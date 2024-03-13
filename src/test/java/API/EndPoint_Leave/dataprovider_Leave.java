package API.EndPoint_Leave;

import org.testng.annotations.DataProvider;

public class dataprovider_Leave {
	@DataProvider(name="CreateleaveDataProvider")
	public String[] Verify_Createleave
	() 
	{
		String[]data={"{ \"leaveId\":\"49\", \"employeeId\": \"1\", \"startDate\": \"2024-02-29T02:59:31.302Z \",\"endDate\": \"2024-03-04T02:59:31.302Z\",\"reason\": \"Flue\",\"status\": \"Create\"}"};
		return data;
	}
	@DataProvider(name="ApproveleaveDataProvider")
	public String[] Verify_Approveleave
	() 
	{
		String[]data={"{ \"leaveId\":\"49\"}"};
		return data;
	}
	@DataProvider(name="UpdateleaveDataProvider")
	public String[] Verify_Updateleave
	() 
	{
		String[]data={"{ \"leaveId\":\"49\", \"employeeId\": \"1\", \"startDate\": \"2024-02-29T02:59:31.302Z \",\"endDate\": \"2024-03-04T02:59:31.302Z\",\"reason\": \"Flue\",\"status\": \"Updated\"}"};
		return data;
	}
	@DataProvider(name="RejectleaveDataProvider")
	public String[] Verify_Rejectleave
	() 
	{
		String[]data={"{ \"leaveId\":\"49\"}"};
		return data;
	}
	@DataProvider(name="DeleteleaveDataProvider")
	public String[] Verify_Deleteleave
	() 
	{
		String[]data={"{ \"leaveId\":\"49\"}"};
		return data;
	}
}
