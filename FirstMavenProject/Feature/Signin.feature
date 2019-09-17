@login
Feature: Amazon Log in feature Test


Scenario: User able to log in successfully with valid credientials
    Given user able to go home page
    When  click on sign in button
    And enter valid user name
    And enter valid password
    And click on submit in button 
    Then user able to sign in successfully
    
    
    
