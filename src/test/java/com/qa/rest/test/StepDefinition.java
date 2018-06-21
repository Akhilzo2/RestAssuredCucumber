package com.qa.rest.test;
import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	
	@Given("^I am testing rest assured$")
	public void i_am_testing_rest_assured()
	{
	    System.out.println("I am running my test here");
	    RestAssuredMethods.resttest();
	}
	
	@Given("^I want to make a request to the following URI$")
	public void i_want_to_make_a_request_to_the_following_URI(DataTable URITable) 
	{
	   
		String URI = URITable.cells(1).toString().replace("[","").replace("]","");
		RestAssuredMethods.setURI(URI);
	}

	@Then("^I make a request to it$")
	public void i_make_a_request_to_it() 
	{
		RestAssuredMethods.firerequest();
	}

	@Then("^The response status code is \"([^\"]*)\"$")
	public void the_response_status_code_is(String StatusCode) 
	{
		RestAssuredMethods.StatusCheck(Integer.valueOf(StatusCode));
	}

	@Then("^I verify that the email id is \"([^\"]*)\"$")
	public void i_verify_that_the_email_id_is(String EmailID) 
	{
		RestAssuredMethods.emailCheck(EmailID);
	}
	
	@Then("^I verify that there are \"([^\"]*)\" users present in the response$")
	public void i_verify_that_there_are_users_present_in_the_response(String UserNum) 
	{
		RestAssuredMethods.CheckUserNum(Integer.valueOf(UserNum));
	}
}
