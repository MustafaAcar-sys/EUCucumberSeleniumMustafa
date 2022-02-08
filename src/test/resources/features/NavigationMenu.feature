@navigate
Feature:
  Scenario: Navigating fleet-vehicles
    Given the user is on the login page
    And the user enters the sales manager information
    When the user navigates to Fleet, Vehicle
    Then The title should be Vehicles

    Scenario: Navigating Marketing-Camapigns
      Given the user is on the login page
      And the user enters the sales manager information
      When the user navigates to Marketing-Campaigns
      Then the title should be Campaigns

      Scenario: Navigating Activities--Calendar Events
        Given the user is on the login page
        And the user enters the sales manager information
        When the user navigates to Activities--Calendar Events
        Then the title should be Calendars
