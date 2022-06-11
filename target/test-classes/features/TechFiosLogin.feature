@LoginFeature @Regression
Feature: TechFios Billing Login Functionality Validation

  @Scenario1  @Smoke
  Scenario: User should be able to login valid credentials
  	 Given User is on Techfios login page
  	 When User enters username as "demo@techfios.com"
  	 When User enters password as "abc123"
  	 When User click signin button
  	 Then User should land on dashboard page
  	 
  @Scenario2 
   Scenario: User should be able to login valid credentials
  	 Given User is on Techfios login page
  	 When User enters "username"
  	 When User enters "password"
  	 When User click signin button
  	 Then User should land on dashboard page
