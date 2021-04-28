@featuretag
Feature: New User registration.

Background: Navigate to ELEARNING UPSKILL URL and SENT Message

Scenario Outline: Navigate to ELEARNING UPSKILL URL and Login and Sent message


When Completed the registration process
And enter any value "<Username>" in Username field
And enter any value "<Pass>" in Pass field
And click on Login Button
And Click on  Compose hyperlink icon
And enter any value "<sent to>" in Sent to field
And enter any value "<Subject>" in Sent to field
And enter any value "<Message>" in Sent to field
And enter any value "<Description>" in Sent to field
Then click on "<Sent Message>" icon
	
    	


Examples:
 |Username                               | Pass          | sent to   | Subject       |Message         | Descriptiopn                                      |
 |Ankitachaudhari5454Ankitachaudhari5454 | Password@5454 | Ankita    | Sending email |Sending message | DSending an message to validae functionality      |