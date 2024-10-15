Feature: Demo Signup Functionality

@single
Scenario: Verify the signup with valid data
Given User is navigated to the signup page 
When user enter the name and email
| name | email |
| shivani | shivani123@gmail.com  |
And click on signup Button
Then user navigate to the information page

@multiple
Scenario: Verify the signup with multiple set of data
Given User is navigated to the signup page 
When user enter the <fullname>and <emailid>
And click on the signup button
Then user should navigate to the information page with  valid data

Examples:
| username | password      |
| jjjkkk   | abd@gmail.com |
|xyz       | xyz@gmail.com |
|ssfdff    | sss@gmail.com |