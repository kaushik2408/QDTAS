package API.EndPoint_Timesheet;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Timesheet_EndPoints extends ROUTES_Timesheet {
	@Test(priority=1,dataProvider="AddTimesheetDataProvider",dataProviderClass=dataprovider_Timesheet.class)
	public void Verify_AddTimesheet(String requestBody)
	{
		RestAssured.baseURI=ROUTES_Timesheet.Baseurl;
		Response VerifyAddTimesheetResponse=given().contentType(ContentType.JSON).body(requestBody).when().post(ROUTES_Timesheet.postAddTimesheet_url);
		System.out.println("Response body : " + VerifyAddTimesheetResponse.getBody().asString());
		if(VerifyAddTimesheetResponse.getStatusCode()==201) {
			
			System.out.println("Add Timesheet Test Failed .Unexpected Status Code:"+VerifyAddTimesheetResponse.getStatusCode());
		}
		else {
			System.out.println("Add Timesheet Test Passed. Timesheet add succesfully");
		}
		
	}
	
	@Test(priority=2,dataProvider="UpdateTimesheetDataProvider",dataProviderClass=dataprovider_Timesheet.class)
	public void Verify_UpdateTimesheet(String requestBody)
	{
		RestAssured.baseURI=ROUTES_Timesheet.Baseurl;
		Response VerifyUpdateTimesheetResponse=given().contentType(ContentType.JSON).body(requestBody).when().post(ROUTES_Timesheet.postUpdateTimesheet_url);
		System.out.println("Response body : " + VerifyUpdateTimesheetResponse.getBody().asString());
		if(VerifyUpdateTimesheetResponse.getStatusCode()==200) {
			
			System.out.println("Update Timesheet Test Failed .Unexpected Status Code:"+VerifyUpdateTimesheetResponse.getStatusCode());
		}
		else {
			System.out.println("Update Timesheet Test Passed. Timesheet Update  succesfully");
		}
		
	}
	@Test(priority=3,dataProvider="GetallempTimesheetDataProvider",dataProviderClass=dataprovider_Timesheet.class)
	public void Verify_GetallEmpTimesheet(String requestBody)
	{
		RestAssured.baseURI=ROUTES_Timesheet.Baseurl;
		Response VerifyGetallEmpTimesheetResponse=given().contentType(ContentType.JSON).body(requestBody).when().post(ROUTES_Timesheet.postgetallEmpIdTimesheet_url);
		System.out.println("Response body : " + VerifyGetallEmpTimesheetResponse.getBody().asString());
		if(VerifyGetallEmpTimesheetResponse.getStatusCode()==200) {
			
			System.out.println("Get All Emoloyee Test Failed .Unexpected Status Code:"+VerifyGetallEmpTimesheetResponse.getStatusCode());
		}
		else {
			System.out.println("Get All Emoloyee Test Passed. Get Employee detail succesfully");
		}
		
	}
	@Test(priority=4,dataProvider="DeleteTimesheetDataProvider",dataProviderClass=dataprovider_Timesheet.class)
	public void Verify_DeleteTimesheet(String requestBody)
	{
		RestAssured.baseURI=ROUTES_Timesheet.Baseurl;
		Response VerifyDeleteTimesheetResponse=given().contentType(ContentType.JSON).body(requestBody).when().post(ROUTES_Timesheet.postDeleteTimesheetById_url);
		System.out.println("Response body : " + VerifyDeleteTimesheetResponse.getBody().asString());
		if(VerifyDeleteTimesheetResponse.getStatusCode()==200) {
			
			System.out.println("Delete Timesheet Test Failed .Unexpected Status Code:"+VerifyDeleteTimesheetResponse.getStatusCode());
		}
		else {
			System.out.println("Delete Timesheet Test Passed. Delete Timesheet succesfully");
		}
		
	}
}
