Feature: Verify Initial View Page

  Background:
    Given user Enter username "TESSupport"
    And user Enter password "SPOL_Support@2014"
    Then click on login button

  @PlaceOrder
  Scenario: Title Should be Shown "All Budget" by Unit Manager Page
    Given click budget option from left menu
    When click on all budget
    Then validation of page title

