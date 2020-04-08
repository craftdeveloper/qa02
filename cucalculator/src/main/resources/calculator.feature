Feature: Test Calculator Application

  Scenario: Test sum method of the calculator
    Given two number 3 and 6
    When I call function sum
    Then outcome will be 9
    
   Scenario: Test subtract method of the calculator
    Given two number 6 and 3
    When I call function subtract 
    Then outcome will be 3
    
      Scenario: Test multiply method of the calculator
    Given two number 6 and 3
    When I call function multiply 
    Then outcome will be 18
 
  