package API.EndPoint_Timesheet;

import org.testng.annotations.DataProvider;

public class dataprovider_Timesheet {
	@DataProvider(name="AddTimesheetDataProvider")
	public String[] Verify_AddTimesheet
	() 
	{
		String[]data={"{ \"timeSheetId\":\"1\",\"startTime\": \"10:00:00\",\"endTime\": \"18:00:00\",\"date\": \"2024-03-09\",\"note\": \"Finals\",\"projectId\": \" 2\",\"empId\":\"225\"}"};
		return data;
	}
	
	@DataProvider(name="UpdateTimesheetDataProvider")
	public String[] Verify_UpdateTimesheet
	() 
	{
		String[]data={"{ \"timeSheetId\":\"1\",\"startTime\": \"10:00:00\",\"endTime\": \"18:00:00\",\"date\": \"2024-03-09\",\"note\": \"Finals\",\"projectId\": \" 2\"}"};
		return data;
	}
	
	@DataProvider(name="GetallempTimesheetDataProvider")
	public String[] Verify_GetallEmpTimesheet
	() 
	{
		String[]data={"{ \"timeSheetId\":\"1\"}"};
		return data;
	}
	
	@DataProvider(name="DeleteTimesheetDataProvider")
	public String[] Verify_DeleteTimesheet
	() 
	{
		String[]data={"{ \"timeSheetId\":\"1\"}"};
		return data;
	}
}
