package com.qa.rest.test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.junit.Test;

import io.restassured.response.ExtractableResponse;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import org.junit.*;

public class RestAssuredMethods {
	
	public static String URI;
	public static RequestSpecification reqSpec;
	public static Response Resp;
	
	//@Test
	public static void resttest()
	{
		System.out.println(given().
				when().
				get("https://jsonplaceholder.typicode.com/comments/1").then().extract().response().asString());
		given().
		when().
		get("https://jsonplaceholder.typicode.com/comments/1").then().assertThat().body("email", equalTo("Eliseo@gardner.biz"));
		//body("email.text()",Matchers.equalTo("Eliseo@gardner.biz")
	}
	
	public static void setURI(String Target)
	{
		URI = Target;
		reqSpec = given().when();
	}
	
	public static void firerequest()
	{
		Resp = reqSpec.get(URI);
	}
	
	public static void StatusCheck(int StatusVal)
	{
		Resp.then().assertThat().statusCode(StatusVal);
	}
	
	public static void emailCheck(String EmailID)
	{
		Resp.then().assertThat().body("email", equalTo(EmailID));
	}
	
	public static void CheckUserNum(int Uno)
	{
		Resp.then().assertThat().body("id",hasSize(Uno));
	}

}
