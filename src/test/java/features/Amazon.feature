
@all
Feature: Test Amazon page
  I want to use this template for my feature file

  
  Scenario: Testing of amazon page
    Given I open the amazon page
    When I click on signin button
    Then  I Signin  using emailid and password
    | emailid | password |
    | mnaveenkumar.mpc@gmail.com | Navi@12345 |
    And I click on submit button
    Then I start searching item
    Then now i click on searched item 
    And i add the item to wishlist for further booking
   
    Then i close the browser
