Feature: Walmart Health Clinic - Appointment


  Scenario: Validate Succesful Appointment
    Given i acces to walmart clinic website
    When i click to schedule now button
    And i search with zipcode 30265
    And i click on Find Care Button
    And i click on medical care button
    And i click on continue button
    And i click on continue button again
    And i select on Annual Physical Exam
    And i click on continue button on care section
    And i click on closest date and hours
    And i click on continue button on appointment date page
    And i select for Someoneelse
    And i enter unique first name
    And i enter unique last name
    And i enter unique date of birth
    And i enter specific street adress
    And i select female at sex at birth
    And i select female at gender identity
    And i click on continue button on patient information page
    And i enter unique contact e-mail adress
    And i enter unique contact phone number
    And i click on continue button on contact information section
    And i click on No at insurance information section
    And i click on continue button on insurance section
    And i click on checking box
    And i click on schedule appointment button
    And i want to run the scenario 10 times




