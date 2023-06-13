Feature: Login Functionality

  Scenario: Login Func
    Given Navigate to IBM HomePages
    And Click members button
    And Click MyIBM Button
    And put IBMid and click Box
    And click continue btn
    And Put Password
    And click Sign in
    Then User should login successfully