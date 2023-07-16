Feature: Organization

Scenario: Login with valid credentials
Given user launch chrome browser
When user  url "http://localhost:8888"
And user  username "admin"
And user  password "admin"
Then click  login
And click on Organization module