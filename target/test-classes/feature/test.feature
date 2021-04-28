@featuretag
Feature: New User registration.

Background: Navigate to ELEARNING UPSKILL URL and complete the registraction process

Scenario: Navigate to ELEARNING UPSKILL URL

		Given User should be navigated to the ELEARNING UPSKILL URL
    When Click on Sign Up Button
    And Enter all mandatory field
    And Click on Register Button
    Then registration should be successful 
    
    
 
