package API.EndPoint_Department;

import org.testng.annotations.DataProvider;

public class dataprovider_Department {
	@DataProvider(name="AddDepartmentDataProvider")
	public String[] Verify_AddDepartment
	() 
	{
		String[]data={"{ \"deptId\":\"1\",\"deptName\": \"Development\",}"};
		return data;
	}
	@DataProvider(name="UpdateDepartmentDataProvider")
	public String[] Verify_UpdateDepartment
	() 
	{
		String[]data={"{ \"deptId\":\"1\",\"deptName\": \"Development\",}"};
		return data;
	}
	@DataProvider(name="GetallDepartmentDataProvider")
	public String[] Verify_GetallDepartment
	() 
	{
		String[]data={"{ \"deptId\":\"13\",\"deptName\": \"Qa\"}"};
		return data;
	}
	@DataProvider(name="GetallEmpbyDepartmentDataProvider")
	public String[] Verify_GetallEmpDepartment
	() 
	{
		String[]data={"{ \"deptId\":\"13\",\"deptName\": \"Qa\"}"};
		return data;
	}
	@DataProvider(name="DeleteDepartmentDataProvider")
	public String[] Verify_DeleteDepartment
	() 
	{
		String[]data={"{ \"deptId\":\"13\",\"deptName\": \"Qa\"}"};
		return data;
	}
}
