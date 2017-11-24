@GetFreeQuote
Feature: Get a free quote with valid and invalid data

  Background:
    Given I go to Url "https://www.d3dsecurity.co.uk"

  @freequote_valid
  Scenario Outline: Get a free quote with Valid data
#    Given I go to Url "https://www.d3dsecurity.co.uk"
    When I click Online tab on the Home page
    Then I should see a "Get a Free Quote" on the left hand side bottom
    Given I entered the  first name as "<first name>"
    And I entered  the last name as "<last name>"
    And I enter the email id as "<email id>"
    And I enter phone no as "<phone no>"
    And I enter the subject as "<subject>"
    And I enter the message as "<messagebox>"
    Given I enter the captcha in the given box
    When I click on the send message button
    Then I should see a displayed message as "<header>" on the current url page
    Then I should see a displayed message1 as "<header1>" on the current url page
    And I should see a current Url as " https://www.d3dsecurity.co.uk/thank-you/"

    Examples:
      | first name | last name | email id             | phone no    | subject                        | messagebox | header    | header1                                         |
      | Kalyani    | Kolli     | skolli31@gmail.com   | 07473467367 | Quote for Wifi video door bell | Hi there   | Thank you | Thanks For Inquiry, We will Contact you Soon !! |
#      | Aruna      | Vanta     | arunavanta@yahoo.com | 07426529999 | Quote for Wifi Cctv            | Hello      | Thank you | Thanks For Inquiry, We will Contact you Soon !! |
#      | Chandana   | Guntur    | chandanaguntur@hotmail.com | 07986456245 | Quote for Outdoor Ip camera    | Hi         | Thank you | Thanks For Inquiry, We will Contact you Soon !! |


  @freequote_invalid
  Scenario Outline: Get a free quote with Valid data
    Given I go to Url "https://www.d3dsecurity.co.uk"
    When I click Online tab on the Home page
    Then I should see a "Get a Free Quote" on the left hand side bottom
    Given I entered the  blank first name as "<first name>"
#    Then I should see error message as "Please fill in the required field."
    Given I entered  the last name as "<last name>"
    And I enter the email id as "<email id>"
    And I enter phone no as "<phone no>"
    And I enter the subject as "<subject>"
    And I enter the message as "<messagebox>"
    And I enter the captcha in the given box
    When I click on the send message button
    Then I should see a error message as "Validation errors occurred. Please confirm the fields and submit it again."

    Examples:
      | first name | last name | email id           | phone no    | subject                        | messagebox |
      |            | Kolli     | skolli31@gmail.com | 07473467367 | Quote for Wifi video door bell | Hi there   |