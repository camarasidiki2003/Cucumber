@Regression @OtherSecenario
Feature: TechFios Billing Login Functionality validation

@Secenario1
  Scenario: User should be able to login with valid credentials 
    Given User is on Techfios login page
    When User enters username as "demo@techfios.com"
    When User enters password as "abc123"
    When User clicks signin button
    Then User should land on dashboard page 
@Secenario2
Scenario: User should not be able to login with valid credentials 
    Given User is on Techfios login page
    When User enters username as "demo@techfios.com"
    When User enters password as "abc124"
    When User clicks signin button
    Then User should land on dashboard page
@Secenario3
Scenario: User should not be able to login with valid credentials 
    Given User is on Techfios login page
    When User enters username as "demo@techfiosa.com"
    When User enters password as "abc123"
    When User clicks signin button
    Then User should land on dashboard page 

        
    
    
    
    