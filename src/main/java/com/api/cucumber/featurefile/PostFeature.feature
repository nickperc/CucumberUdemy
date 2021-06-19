Feature: Post feature of facebook
  This will test the post functionality at the user wall

  Scenario: Post a text on user wall
    Given User should be logged in
    And Should be present at its own wall
    When I type the text in the text box
    And Click on Post button
    Then The message should be posted

  Scenario: Post a video on user wall
    Given User should be logged in
    And Should be present at its own wall
    When User supply the youtube link in the text box
    And Click on Post button
    Then Video should get posted on the user wall
    And The video should have proper Thumnail