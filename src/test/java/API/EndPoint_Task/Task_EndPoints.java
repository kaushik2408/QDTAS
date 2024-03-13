package API.EndPoint_Task;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Task_EndPoints extends ROUTES_Task {
	@Test(priority=1,dataProvider="AssignTaskDataProvider",dataProviderClass=dataprovider_Task.class)
	public void Verify_AssignTask(String requestBody)
	{
		RestAssured.baseURI=ROUTES_Task.Baseurl;
		Response VerifyAsignTaskResponse=given().contentType(ContentType.JSON).body(requestBody).when().post(ROUTES_Task.postassignTask_url);
		System.out.println("Response body : " + VerifyAsignTaskResponse.getBody().asString());
		if(VerifyAsignTaskResponse.getStatusCode()==201) {
			
			System.out.println("Assign Task Test Failed .Unexpected Status Code:"+VerifyAsignTaskResponse.getStatusCode());
		}
		else {
			System.out.println("Assign Task Test Passed. Assign Task succesfully");
		}
		
	}
	
	@Test(priority=2,dataProvider="ReviewTaskDataProvider",dataProviderClass=dataprovider_Task.class)
	public void Verify_ReviewTask(String requestBody)
	{
		RestAssured.baseURI=ROUTES_Task.Baseurl;
		Response VerifyReviewTaskResponse=given().contentType(ContentType.JSON).body(requestBody).when().post(ROUTES_Task.postReviewTask_url);
		System.out.println("Response body : " + VerifyReviewTaskResponse.getBody().asString());
		if(VerifyReviewTaskResponse.getStatusCode()==200) {
			
			System.out.println("Task Review Test Failed .Unexpected Status Code:"+VerifyReviewTaskResponse.getStatusCode());
		}
		else {
			System.out.println("Task Review Test Passed. Task under review succesfully");
		}
		
	}
	@Test(priority=3,dataProvider="CompletedTaskDataProvider",dataProviderClass=dataprovider_Task.class)
	public void Verify_CompletedTask(String requestBody)
	{
		RestAssured.baseURI=ROUTES_Task.Baseurl;
		Response VerifyCompletedTaskResponse=given().contentType(ContentType.JSON).body(requestBody).when().post(ROUTES_Task.postTaskCompleted_url);
		System.out.println("Response body : " + VerifyCompletedTaskResponse.getBody().asString());
		if(VerifyCompletedTaskResponse.getStatusCode()==201) {
			
			System.out.println("Completed Task Test Failed .Unexpected Status Code:"+VerifyCompletedTaskResponse.getStatusCode());
		}
		else {
			System.out.println("Completed Task Test Passed. Task Completed succesfully");
		}
		
	}
	@Test(priority=4,dataProvider="GetTaskstatusDataProvider",dataProviderClass=dataprovider_Task.class)
	public void Verify_GetTaskstatus(String requestBody)
	{
		RestAssured.baseURI=ROUTES_Task.Baseurl;
		Response VerifygetTaskstatusResponse=given().contentType(ContentType.JSON).body(requestBody).when().post(ROUTES_Task.getTaskStatus_url);
		System.out.println("Response body : " + VerifygetTaskstatusResponse.getBody().asString());
		if(VerifygetTaskstatusResponse.getStatusCode()==200) {
			
			System.out.println("Get Task Test Failed .Unexpected Status Code:"+VerifygetTaskstatusResponse.getStatusCode());
		}
		else {
			System.out.println("Get Task Test Passed. get emp Task status succesfully");
		}
		
	}
	
	@Test(priority=5,dataProvider="GetTaskEmpIdDataProvider",dataProviderClass=dataprovider_Task.class)
	public void Verify_GetTaskEmpId(String requestBody)
	{
		RestAssured.baseURI=ROUTES_Task.Baseurl;
		Response VerifyGetTaskEmpIdResponse=given().contentType(ContentType.JSON).body(requestBody).when().post(ROUTES_Task.getTaskempid_url);
		System.out.println("Response body : " + VerifyGetTaskEmpIdResponse.getBody().asString());
		if(VerifyGetTaskEmpIdResponse.getStatusCode()==200) {
			
			System.out.println("Get Task EmpId Test Failed .Unexpected Status Code:"+VerifyGetTaskEmpIdResponse.getStatusCode());
		}
		else {
			System.out.println("Get Task EmpId Test Passed. Get Task status succesfully");
		}
		
	}
}
