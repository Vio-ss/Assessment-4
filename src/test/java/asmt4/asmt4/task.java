package asmt4.asmt4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;

public class task {
    WebDriver driver;

    @Given("user launch browser")
    public void launchBrowser() {
        System.setProperty("webdriver.chrome.driver", "D:\\CD2\\chromedriver-win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");
    }

    @When("user check username {string} and password {string}")
    public void checkUsernameAndPassword(String username, String password) throws InterruptedException {
        driver.get("https://www.saucedemo.com");
        driver.findElement(By.name("user-name")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.name("login-button")).click();
        Thread.sleep(5000);
    }

    @And("user quit browser")
    public void quitBrowser() {
        driver.quit();
    }
}
