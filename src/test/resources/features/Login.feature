Feature: Login
  Scenario Outline:
    Given Fill out <username> and <password>
    Then Press login button
    Examples:
      | username      | password     |
      | standard_user | secret_sauce |


