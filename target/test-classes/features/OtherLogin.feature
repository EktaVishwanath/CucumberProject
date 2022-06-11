@OtherLoginFeature @Regression
Feature: TechFios Other Login Functionality Validation

Background:
 Given User is on Techfios login page	
	 
  @OtherScenario1
  Scenario Outline: 1 User should be able to login valid credentials (Other)
  	
  	 When User enters username as "<username>"
  	 When User enters password as "<password>"
  	 When User click signin button
  	 Then User should land on dashboard page
  	 
  	 Examples:
  	 |username|password|
  	 |demo1@techfios.com|abc123|
  	 |demo@techfios.com|abc122|
  	 |demo1@techfios.com|abc124|
  	 
  	 
 
  	 
