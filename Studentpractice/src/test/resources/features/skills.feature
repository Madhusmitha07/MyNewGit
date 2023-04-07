Feature: Automating skills functionality

Background: Common steps
Given User launch chromebrowser
When User opens "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"

Scenario: Add skills record
Given user logs with username as "Admin" and password as "admin123"
When user adds skills record with skillname as "Oracle123" and skilldesc as "Oracle123 desc"
Then user performs logout
And closes the browser