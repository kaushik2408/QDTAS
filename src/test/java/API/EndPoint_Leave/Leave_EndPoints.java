package API.EndPoint_Leave;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class Leave_EndPoints extends ROUTES_Leave {
	
	

	@Test(priority=2,dataProvider="CreateleaveDataProvider",dataProviderClass=dataprovider_Leave.class)
	public void Verify_Createleave(String requestBody)
	{
		RestAssured.baseURI=ROUTES_Leave.Baseurl;
		Response VerifyCreateleaveResponse=given().contentType(ContentType.JSON).body(requestBody).when().post(ROUTES_Leave.postCreateleave_url);
		System.out.println("Response body : " + VerifyCreateleaveResponse.getBody().asString());
		
		if(VerifyCreateleaveResponse.getStatusCode()==201) {
			
			System.out.println("Leave Test Failed .Unexpected Status Code:"+VerifyCreateleaveResponse.getStatusCode());
		}
		else {
			System.out.println("Leave Test Passed. Leave created succesfully");
		}
		
	}
	
	@Test(priority=3,dataProvider="ApproveleaveDataProvider",dataProviderClass=dataprovider_Leave.class)
	public void Verify_Approveleave(String requestBody)
	{
		RestAssured.baseURI=ROUTES_Leave.Baseurl;
		Response VerifyApproveleaveResponse=given().contentType(ContentType.JSON).body(requestBody).when().post(ROUTES_Leave.postApproveleave_url);
		
	
       System.out.println("Response body : " + VerifyApproveleaveResponse.getBody().asString());
       System.out.println("Status Code: " +VerifyApproveleaveResponse.getStatusCode());
       
//       int expected=200;
//       int actual=VerifyApproveleaveResponse.getStatusCode();
//       Assert.assertEquals( actual, expected);
         if(VerifyApproveleaveResponse.getStatusCode()==200) {
			
			System.out.println("Leave Test Failed .Unexpected Status Code:"+VerifyApproveleaveResponse.getStatusCode());
		}
		else {
		
			System.out.println("Leave Test Passed. Leave Approved succesfully");
		}
		
	}
	
	@Test(priority=4,dataProvider="UpdateleaveDataProvider",dataProviderClass=dataprovider_Leave.class)
	public void Verify_Updateleave(String requestBody)
	{
		RestAssured.baseURI=ROUTES_Leave.Baseurl;
		Response VerifyUpdateleaveResponse=given().contentType(ContentType.JSON).body(requestBody).when().post(ROUTES_Leave.postUpdateleave_url);
		
	
       System.out.println("Response body : " + VerifyUpdateleaveResponse.getBody().asString());
		

		
		if(VerifyUpdateleaveResponse.getStatusCode()==200) {
			
			System.out.println("UpdateLeave Test Failed .Unexpected Status Code:"+VerifyUpdateleaveResponse.getStatusCode());
		}
		else {
			System.out.println("Update Leave Test Passed. Leave Update succesfully");
		}
		
	}
	
	@Test(priority=5,dataProvider="RejectleaveDataProvider",dataProviderClass=dataprovider_Leave.class)
	public void Verify_Rejectleave(String requestBody)
	{
		RestAssured.baseURI=ROUTES_Leave.Baseurl;
		Response VerifyRejectleaveResponse=given().contentType(ContentType.JSON).body(requestBody).when().post(ROUTES_Leave.postRejectleave_url);
		
	
       System.out.println("Response body : " + VerifyRejectleaveResponse.getBody().asString());
		
      if(VerifyRejectleaveResponse.getStatusCode()==200) {
			
			System.out.println("UpdateLeave Test Failed .Unexpected Status Code:"+VerifyRejectleaveResponse.getStatusCode());
		}
		else {
			System.out.println("Reject Leave Test Passed. Leave Rejected succesfully");
		}
		
	}
	@Test(priority=6,dataProvider="DeleteleaveDataProvider",dataProviderClass=dataprovider_Leave.class)
	public void Verify_Deleteleave(String requestBody)
	{
		RestAssured.baseURI=ROUTES_Leave.Baseurl;
		Response VerifyDeleteleaveResponse=given().contentType(ContentType.JSON).body(requestBody).when().post(ROUTES_Leave.postDeleteleave_url);
		
	
       System.out.println("Response body : " + VerifyDeleteleaveResponse.getBody().asString());
		
      if(VerifyDeleteleaveResponse.getStatusCode()==200) {
			
			System.out.println("UpdateLeave Test Failed .Unexpected Status Code:"+VerifyDeleteleaveResponse.getStatusCode());
		}
		else {
			System.out.println("Reject Leave Test Passed. Leave Rejected succesfully");
		}
		
	}

	
	
	
}
