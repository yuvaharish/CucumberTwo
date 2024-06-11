Feature: this is the data driven for ornge HRM

Scenario Outline: this is login Scenario data driven
Given user open the chrome browser
And user entering the ornhrm site name
When user enter the "<userName>" and "<passWord>"
And click the login btn
Then user should be navigated to ornhrm Home page

Examples:
|userName|passWord|
|Admin|admin12|
|admin|admin123|
|admin|admin12|
|Admin|admin123|
