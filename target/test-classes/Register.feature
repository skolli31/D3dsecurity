@Register_Val
Feature: Register Validation
@k
  Scenario: Registration confirmation with Valid data
    Given I go to "https://www.d3dsecurity.co.uk"
    Then I should see a Register button
    When I click on the Register button
    Then I should see a page with Register as header
    Given I enter the valid emaild as "Test24@yahoo.com"
    And I enter the new passwd as "Testing1"
    And I enter the confirm passwd as "Testing1"
    When i click on the Register button on register page
    Then I should see the My Account button
    And I should see My Account text
    And I should see the Logout button
    And I should see the Logout text

  Scenario: Registration failed with Blank fields
    Given I go to "https://www.d3dsecurity.co.uk"
    Then I should see a Register button
    When I click on the Register button
    Then I should see a page with Register as header
    Given I enter the valid emaild as ""
    And I enter the new passwd as ""
    And I enter the confirm passwd as ""
    When i click on the Register button on register page
    Then I should see an error message as "Username is not valid"

  Scenario: Registration failed with mismatch in Password fields
    Given I go to "https://www.d3dsecurity.co.uk"
    Then I should see a Register button
    When I click on the Register button
    Then I should see a page with Register as header
    Given I enter the valid emaild as "Test11@yahoo.com"
    And I enter the new passwd as "Testing1"
    And I enter the confirm passwd as "testing1"
    When i click on the Register button on register page
    Then I should see  error message as "Passwords must be identical and filled"

  Scenario: Registration failed with blank Confirm Password fields
    Given I go to "https://www.d3dsecurity.co.uk"
    Then I should see a Register button
    When I click on the Register button
    Then I should see a page with Register as header
    Given I enter the valid emaild as "Test11@yahoo.com"
    And I enter the new passwd as "Testing1"
    And I enter the confirm passwd as ""
    When i click on the Register button on register page
    Then I should see  error message as "Passwords must be identical and filled"

  Scenario: Registration failed with blank Confirm Password fields
    Given I go to "https://www.d3dsecurity.co.uk"
    Then I should see a Register button
    When I click on the Register button
    Then I should see a page with Register as header
    Given I enter the valid emaild as "Test11@yahoo.com"
    And I enter the new passwd as ""
    And I enter the confirm passwd as "Testing1"
    When i click on the Register button on register page
    Then I should see  error message as "Passwords must be identical and filled"

  Scenario: Registration failed with blank emaild field
    Given I go to "https://www.d3dsecurity.co.uk"
    Then I should see a Register button
    When I click on the Register button
    Then I should see a page with Register as header
    Given I enter the valid emaild as ""
    And I enter the new passwd as "Testing1"
    And I enter the confirm passwd as "Testing1"
    When i click on the Register button on register page
    Then I should see an error message as "Username is not valid"
















