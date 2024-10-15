Feature: Demo sign functionality

  Scenario: Verify the sign with valid data
    Given user is navigate the sign page
     When user enter the name and email
      And click the sign button
     Then user navigate to the information page
