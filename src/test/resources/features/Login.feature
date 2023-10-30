Feature: Login
  Scenario Outline:
    Given Navigate to SouceDemo
    When Fill out <username> and <password>
    Then Press login button
    Examples:
      | username      | password |
      | standard_user | secret_souce |


