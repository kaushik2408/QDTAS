package API.EndPoint_Department;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;





public class Department_EndPoints extends ROUTES_Department {
	
	@Test(priority=1,dataProvider="AddDepartmentDataProvider",dataProviderClass=dataprovider_Department.class)
	public void Verify_AddDepartment(String requestBody)
	{
		RestAssured.baseURI=ROUTES_Department.Baseurl;
		Response VerifyAddDepartmentResponse=given().contentType(ContentType.JSON).body(requestBody).when().post(ROUTES_Department.postAddDepartment_url);
		System.out.println("Response body : " + VerifyAddDepartmentResponse.getBody().asString());
		if(VerifyAddDepartmentResponse.getStatusCode()==201) {
			
			System.out.println("Add Department Test Failed .Unexpected Status Code:"+VerifyAddDepartmentResponse.getStatusCode());
		}
		else {
			System.out.println("Add Deparment Test Passed. Department Created succesfully");
		}
		
	}
	
	@Test(priority=2,dataProvider="UpdateDepartmentDataProvider",dataProviderClass=dataprovider_Department.class)
	public void Verify_UpdateDepartment(String requestBody)
	{
		RestAssured.baseURI=ROUTES_Department.Baseurl;
		Response VerifyUpdateDepartmentResponse=given().contentType(ContentType.JSON).body(requestBody).when().post(ROUTES_Department.postUpdateDepartment_url);
		System.out.println("Response body : " + VerifyUpdateDepartmentResponse.getBody().asString());
		if(VerifyUpdateDepartmentResponse.getStatusCode()==200) {
			
			System.out.println("Update Department Test Failed .Unexpected Status Code:"+VerifyUpdateDepartmentResponse.getStatusCode());
		}
		else {
			System.out.println("Update Deparment Test Passed. Department Updated succesfully");
		}
		
	}
	
	@Test(priority=3,dataProvider="GetallDepartmentDataProvider",dataProviderClass=dataprovider_Department.class)
	public void Verify_GetallDepartment(String requestBody)
	{
		RestAssured.baseURI=ROUTES_Department.Baseurl;
		Response VerifyGetallDepartmentResponse=given().contentType(ContentType.JSON).body(requestBody).when().post(ROUTES_Department.postgetallDepartment_url);
		System.out.println("Response body : " + VerifyGetallDepartmentResponse.getBody().asString());
		if(VerifyGetallDepartmentResponse.getStatusCode()==200) {
			
			System.out.println("Get All Department Test Failed .Unexpected Status Code:"+VerifyGetallDepartmentResponse.getStatusCode());
		}
		else {
			System.out.println("Get All Deparment Test Passed. All Department Get succesfully");
		}
		
	}
	@Test(priority=4,dataProvider="GetallEmpbyDepartmentDataProvider",dataProviderClass=dataprovider_Department.class)
	public void Verify_GetallEmpDepartment(String requestBody)
	{
		RestAssured.baseURI=ROUTES_Department.Baseurl;
		Response VerifyGetallEmpDepartmentResponse=given().contentType(ContentType.JSON).body(requestBody).when().post(ROUTES_Department.postgetallEmpbyDepartment_url);
		System.out.println("Response body : " + VerifyGetallEmpDepartmentResponse.getBody().asString());
		if(VerifyGetallEmpDepartmentResponse.getStatusCode()==200) {
			
			System.out.println("Get All Department Test Failed .Unexpected Status Code:"+VerifyGetallEmpDepartmentResponse.getStatusCode());
		}
		else {
			System.out.println("Get All Deparment Test Passed. All Department Get succesfully");
		}
		
	}
	@Test(priority=5,dataProvider="DeleteDepartmentDataProvider",dataProviderClass=dataprovider_Department.class)
	public void Verify_DeleteDepartment(String requestBody)
	{
		RestAssured.baseURI=ROUTES_Department.Baseurl;
		Response VerifyDeleteDepartmentResponse=given().contentType(ContentType.JSON).body(requestBody).when().post(ROUTES_Department.postDeleteDepartment_url);
		System.out.println("Response body : " + VerifyDeleteDepartmentResponse.getBody().asString());
		if(VerifyDeleteDepartmentResponse.getStatusCode()==200) {
			
			System.out.println("Get All Department Test Failed .Unexpected Status Code:"+VerifyDeleteDepartmentResponse.getStatusCode());
		}
		else {
			System.out.println("Get All Deparment Test Passed. All Department Get succesfully");
		}
		
	}
	@Test
	public void Bearer() {
		String Token="eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZG1pbkBnbWFpbC5jb20iLCJleHAiOjE3MDk1NjQyMzEsImlhdCI6MTcwOTUyODIzMX0.7SjVUJ2v9RO3t67_x0qGz0UGmVBBMX5RjrbrXlmkRxI";
		given().header("Authorization","Bearer" +Token).when().get("https://qdtashrm-backend.onrender.com/user/verify/1").then().statusCode(200).log().all();
	}
}
