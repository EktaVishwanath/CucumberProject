@DBLoginFeature @Regression
Feature: TechFios Billing Login Functionality Validation

  @DbScenario1  @Smoke
  Scenario: 1 User should be able to login valid credentials
  	 Given User is on Techfios login page
  	 When User enters "username" fromTechfios database
  	 When User enters "password" fromTechfios database
  	 When User click signin button
  	 Then User should land on dashboard page
  	 
 