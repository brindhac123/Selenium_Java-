Feature: SwagLabs Login

  Scenario: Successful login with valid credentials
    Given User launches the browser
    And User navigates to SwagLabs login page
    When User enters valid username "standard_user" and password "secret_sauce"
    And User clicks on login button
    Then User should be redirected to the home page