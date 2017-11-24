@Signin
Feature: Signin verification

#  @Signin_Valid
#  Scenario:Sign in functionality
#    Given I Go to "https://www.d3dsecurity.co.uk/"
#    When i click on login button
#    Given I enter the username as "test1@yahoo.com"
#    And I enter the password as "Testing1"
#    When I click on Signin button on Loginpage
#    And I should see My account button on the right hand side
#    And I should see the Logout on the right hand side

  @Signin_Valid
  Scenario:Sign in functionality as per Data table
    Given I Go to "https://www.d3dsecurity.co.uk/"
    When i click on login button
    Given I enter the details
      | Emailid          | Password |
      | test1@yahoo.com  | Testing1 |
      | reg123@yahoo.com | Testing1 |
 When I click on Signin button on Loginpage
#    working  kalyani on Github

#    And I should see the Logout on the right hand side


  @Sign_Invalid
  Scenario: Signin functionality with invalid data
    Given I Go to "https://www.d3dsecurity.co.uk/"
    When i click on login button
    Given I enter the username as "test1yahoo.com"
    And I enter the password as "Testing1"
    When I click on Signin button on Loginpage
    And I should see a Error message "Wrong credentials"

  @Whyd3dDisplay_header

  Scenario: Availability of Link texts
    Given I Go to "https://www.d3dsecurity.co.uk/"
    Then I should see "Why D3d" header
    When I click on Why D3d header
    Then I should see about us in the current url


