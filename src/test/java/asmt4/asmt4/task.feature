@tag
Feature: Cucumber with BDD example

  @tag1
  Scenario Outline: User login with valid credentials
    Given user launch browser
    And user check username "<username>" and password "<password>"
    And user quit browser

    Examples:
      | username          | password     |
      | standard_user     | secret_sauce |
      | locked_out_user   | secret_sauce11 |
      | problem_user      | secret_sauce |
      | performance_glitch_user | secret_sauce24 |
      | error_user        | secret_sauce |
      | visual_user       | secret_sauce62 |
