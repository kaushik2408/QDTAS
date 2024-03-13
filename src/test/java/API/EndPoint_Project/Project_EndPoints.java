package API.EndPoint_Project;

import static io.restassured.RestAssured.given;


import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Project_EndPoints {
	
	public static final String Utility = null;

	@Test(priority=1,dataProvider="AddProjectDataProvider",dataProviderClass=dataprovider_Project.class)
	public void Verify_addproject(String requestBody)
	{
		RestAssured.baseURI=ROUTES_Project.Baseurl;
		Response VerifyAddProjectResponse=given().contentType(ContentType.JSON).body(requestBody).when().post(ROUTES_Project.postprojectadd_url);
		System.out.println("Response body : " + VerifyAddProjectResponse.getBody().asString());
		
		if(VerifyAddProjectResponse.getStatusCode()==201) {
			
			System.out.println("Addproject Test Failed .Unexpected Status Code:"+VerifyAddProjectResponse.getStatusCode());
			
		}
		else {
			System.out.println("Addproject Test Passed. project created succesfully");
			
		}
		
	}
	
	@Test(priority=2,dataProvider="UpdateProjectDataProvider",dataProviderClass=dataprovider_Project.class)
	public void Verify_Updateproject(String requestBody)
	{
		RestAssured.baseURI=ROUTES_Project.Baseurl;
		Response VerifyUpdateProjectResponse=given().contentType(ContentType.JSON).body(requestBody).when().post(ROUTES_Project.postprojectupdate_url);
		System.out.println("Response body : " + VerifyUpdateProjectResponse.getBody().asString());
		
		if(VerifyUpdateProjectResponse.getStatusCode()==200) {
			
			System.out.println("Update Test Failed .Unexpected Status Code:"+VerifyUpdateProjectResponse.getStatusCode());
			
		}
		else {
			System.out.println("Update Test Passed. project updated succesfully");
			
		}
		
	}
	
	@Test(priority=3,dataProvider="SearchProjectDataProvider",dataProviderClass=dataprovider_Project.class)
	public void Verify_Searchproject(String requestBody)
	{
		RestAssured.baseURI=ROUTES_Project.Baseurl;
		Response VerifySearchProjectResponse=given().contentType(ContentType.JSON).body(requestBody).when().post(ROUTES_Project.postsearchproject_url);
		System.out.println("Response body : " + VerifySearchProjectResponse.getBody().asString());
		
		if(VerifySearchProjectResponse.getStatusCode()==200) {
			
			System.out.println("Searchproject Test Failed .Unexpected Status Code:"+VerifySearchProjectResponse.getStatusCode());
			
		}
		else {
			System.out.println("Searchproject Test Passed. project Search succesfully");
			
		}
		
	}
	
	@Test(priority=4,dataProvider="assignemployeeDataProvider",dataProviderClass=dataprovider_Project.class)
	public void Verify_assignEmployee(String requestBody)
	{
		RestAssured.baseURI=ROUTES_Project.Baseurl;
		Response VerifyassignemployeeResponse=given().contentType(ContentType.JSON).body(requestBody).when().post(ROUTES_Project.postassignemployee_url);
		System.out.println("Response body : " + VerifyassignemployeeResponse.getBody().asString());
		
		if(VerifyassignemployeeResponse.getStatusCode()==200) {
			
			System.out.println("assignemployee Test Failed .Unexpected Status Code:"+VerifyassignemployeeResponse.getStatusCode());
			
		}
		else {
			System.out.println("assignemployee Test Passed. assignemp record field show succesfully");
			
		}
		
	}
	
	@Test(priority=5,dataProvider="assignallmultipleempDataProvider",dataProviderClass=dataprovider_Project.class)
	public void Verify_assignall(String requestBody)
	{
		RestAssured.baseURI=ROUTES_Project.Baseurl;
		Response VerifyassignallResponse=given().contentType(ContentType.JSON).body(requestBody).when().post(ROUTES_Project.postassignall_url);
		System.out.println("Response body : " + VerifyassignallResponse.getBody().asString());
		
		if(VerifyassignallResponse.getStatusCode()==200) {
			
			System.out.println("AssignallMultipleEmp Test Failed .Unexpected Status Code:"+VerifyassignallResponse.getStatusCode());
			
		}
		else {
			System.out.println("AssignallMultipleEmp Test Passed. AssignMultiple record fetch succesfully");
			
		}
		
	}
	
	@Test(priority=6,dataProvider="getallProjectDataProvider",dataProviderClass=dataprovider_Project.class)
	public void Verify_getallproject(String requestBody)
	{
		RestAssured.baseURI=ROUTES_Project.Baseurl;
		Response VerifygetallprojectResponse=given().contentType(ContentType.JSON).body(requestBody).when().post(ROUTES_Project.postgetallprojects_url);
		System.out.println("Response body : " + VerifygetallprojectResponse.getBody().asString());
		
		if(VerifygetallprojectResponse.getStatusCode()==200) {
			
			System.out.println("Getallproject Test Failed .Unexpected Status Code:"+VerifygetallprojectResponse.getStatusCode());
			
		}
		else {
			System.out.println("Getallproject Test Passed. fetch all project record succesfully");
			
		}
		
	}
	
	@Test(priority=7,dataProvider="removeEmpDataProvider",dataProviderClass=dataprovider_Project.class)
	public void Verify_removeemployee(String requestBody)
	{
		RestAssured.baseURI=ROUTES_Project.Baseurl;
		Response VerifyremoveEmployResponse=given().contentType(ContentType.JSON).body(requestBody).when().post(ROUTES_Project.postremoveEmployee_url);
		System.out.println("Response body : " + VerifyremoveEmployResponse.getBody().asString());
		
		if(VerifyremoveEmployResponse.getStatusCode()==200) {
			
			System.out.println("RemoveEmployee Test Failed .Unexpected Status Code:"+VerifyremoveEmployResponse.getStatusCode());
			
		}
		else {
			System.out.println("RemoveEmployee Test Passed. remove employee from record succesfully");
			
		}
		
	}
	
	@Test(priority=8,dataProvider="removeMultipleEmpDataProvider",dataProviderClass=dataprovider_Project.class)
	public void Verify_removeMultipleemployee(String requestBody)
	{
		RestAssured.baseURI=ROUTES_Project.Baseurl;
		Response VerifyremoveremoveMultipleResponse=given().contentType(ContentType.JSON).body(requestBody).when().post(ROUTES_Project.postremoveall_url);
		System.out.println("Response body : " + VerifyremoveremoveMultipleResponse.getBody().asString());
		
		if(VerifyremoveremoveMultipleResponse.getStatusCode()==200) {
			
			System.out.println("RemovemultipleEmp Test Failed .Unexpected Status Code:"+VerifyremoveremoveMultipleResponse.getStatusCode());
			
		}
		else {
			System.out.println("RemovemultipleEmp Test Passed. project Search succesfully");
			
		}
	}
		
	@Test
	public void CheckAPI() {
		System.out.println("API Test Pass");
	}
	
//	@AfterMethod
//	public void ss1(ITestResult result) throws IOException {
//		if(ITestResult.SUCCESS==result.getStatus()) {
//			
//			Utility.getscreenshot(driver);
//		}	
		
		
		
		
	
	
	}



