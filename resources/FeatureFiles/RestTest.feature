
Feature: RestAssure Service Test 
 
	To check the response of the following services from jsonplaceholder
	
Scenario: check the response and verify the email ID

		Given I want to make a request to the following URI
		|								      URI      									|
		|https://jsonplaceholder.typicode.com/comments/1|
		
		Then I make a request to it
		
		Then The response status code is "200"
		
		And I verify that the email id is "Eliseo@gardner.biz"
		


Scenario: check the response and confirm the Number of  the users

		Given I want to make a request to the following URI
		|								  URI      								|
		|https://jsonplaceholder.typicode.com/users|
		
		Then I make a request to it
		
		Then The response status code is "200"
		
		And I verify that there are "10" users present in the response
		



