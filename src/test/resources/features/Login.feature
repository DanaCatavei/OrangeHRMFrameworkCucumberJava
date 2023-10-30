Feature: Login
  Scenario Outline:
    Given Navigate to SouceDemo
    When <usr> and <pwd>
    Then Press login button
    Examples:
    |usr|pwd|
