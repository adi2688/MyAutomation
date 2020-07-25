Feature: Dashboard Page

@SmokeTest
Scenario Outline: Dashboard Page
Given User is on Netbanking landing page
When user login ito application With <Username> and <Password>
Examples:
|Username|Password|
|Aditya|Soni|
|Sonale|Gupta|
