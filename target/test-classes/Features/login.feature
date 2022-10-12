#This is the Feature file to elaborate steps of the program
@tag
Feature: HRM Login Test Case and Apply Leave and Perform Search using Method Overloading
# This is for login scenario
  @tag1
 Scenario: User is able to login with valid user id and password
    Given browser is open and application is in login page
    When user enters user name and password
    Then home page is displayed
# This is for appy leave scenario
  @tag2
  Scenario: User Applies for Leave 
    Given user apply for leave
    When leave is applied by user
    Then Leave Applied
# This is for Method Overloading Search scenario
 @tag3
		Scenario: User Searches for people
    Given User goes on Admin Page
    Then User enters the fields