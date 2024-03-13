package API.EndPoint_Task;

import org.testng.annotations.DataProvider;

public class dataprovider_Task {
	@DataProvider(name="AssignTaskDataProvider")
	public String[] Verify_AssignTask
	() 
	{
		String[]data={"{ \"id\":\"0\",\"name\": \"Create api\",\"description\": \"Make Sure to add swagger as well\",\"dueDate\": \"2024-03-14\",\"assignee\": \"314\",\"empId\": \" 293\"}"};
		return data;
	}
	
	@DataProvider(name="ReviewTaskDataProvider")
	public String[] Verify_ReviewTask
	() 
	{
		String[]data={"{ \"tId\":\"1\"}"};
		return data;
	}
	
	@DataProvider(name="CompletedTaskDataProvider")
	public String[] Verify_CompletedTask
	() 
	{
		String[]data={"{ \"timeSheetId\":\"1\"}"};
		return data;
	}
	
	@DataProvider(name="GetTaskstatusDataProvider")
	public String[] Verify_GetTaskstatus
	() 
	{
		String[]data={"{ \"eld\":\"293\"}"};
		return data;
	}
	
	@DataProvider(name="GetTaskEmpIdDataProvider")
	public String[] Verify_GetTaskEmpId
	() 
	{
		String[]data={"{ \"eld\":\"293\"}"};
		return data;
	}
}
