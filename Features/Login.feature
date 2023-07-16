Feature: Login

Scenario: Successful Login Credentials
Given user launch chrome browser
When user opens url "http://localhost:8888"
And user enters username "admin"
And user enters password "admin"
Then user click on login