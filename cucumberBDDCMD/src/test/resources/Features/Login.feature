Feature: Logoin functionaloty test

Scenario:  check login with credentials

Given user is on login page
When user enters username and password
And click on login buttomn
Then user is navigate to home page


Scenario:  check login with invalid credentials

Given user is in login page
When user enters invalid username and password
And click on login button on this npage
Then error validations messgae is displayed
	
