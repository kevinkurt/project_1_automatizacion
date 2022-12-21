Feature: a as user of the Utest
  i want to create a new register
  to access as user

  Scenario: Succesful user creation
    Given user in the home page
    When user create an account filling all fields
    Then user sees its username