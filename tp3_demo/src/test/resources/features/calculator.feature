Feature: Calculator operations

  Scenario: Add two numbers
    Given I have a calculator
    When I add 5 and 3
    Then the result should be 8
    And I print the result to the terminal

  Scenario: Subtract two numbers
    Given I have a calculator
    When I subtract 3 from 5
    Then the result should be 2
    And I print the result to the terminal

  Scenario Outline: Add multiple numbers
    Given I have a calculator
    When I add <number1>, <number2>, and <number3>
    Then the result should be <result>
    And I print the result to the terminal

    Examples:
      | number1 | number2 | number3 | result |
      | 1       | 2       | 3       | 6      |
      | 4       | 5       | 6       | 15     |
      | 7       | 8       | 9       | 24     |
