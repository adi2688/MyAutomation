Feature: Aplication Login

@SanityTest
Scenario: Home Page default login
Given User is on Netbanking landing page
When user login ito application with username and password
Then Home page is populated
And Cards are displayed



@RegTest
Scenario Outline: login
Given User is on Netbanking landing page
When user login ito application With <Username> and <Password>
Examples:
|Username|Password|
|Aditya|Soni|
|Sonale|Gupta|
