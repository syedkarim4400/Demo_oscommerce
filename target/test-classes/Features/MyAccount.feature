Feature: My Account Functionality
This Feature deal with My Account Functionality
@test
Scenario: Verify user should be able to login with correct email and password
Given Launch "<URL>"
When user click on My Account Link
Then user enter "<EmailAddress>" and "<Password>"
Then user click on Singin Button
#Then Verify user in Home page