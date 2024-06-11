Feature: this is the login feature for ornge HRM

Scenario: this is login Scenario
Given user open the browser2
And user entering the URL
When user enter the valid userName and passWord
|Admin|admin12|
|admin|admin123|
And click the login button
Then user should be navigated to Home page
