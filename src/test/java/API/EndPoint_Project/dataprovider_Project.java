package API.EndPoint_Project;
import org.testng.annotations.DataProvider;



public class dataprovider_Project {
	@DataProvider(name="AddProjectDataProvider")
	public String[] Verify_addproject
	() 
	{
		String[]data={"{ \"projectName\":\"QDTASHRM\", \"description\": \"Business\", \"status\": \"Ok \",\"type\": \"Admin\",\"client\": \"Manager\",\"pId\": \"12\"}"};
		return data;
	}
	
	@DataProvider(name="UpdateProjectDataProvider")
	public String[] Verify_Updateproject
	() 
	{
		String[]data={"{ \"projectName\":\"QDTASHRM\", \"description\": \"Business\", \"status\": \"Ok \",\"type\": \"Admin\",\"client\": \"Manager\"}"};
		return data;
	}
	@DataProvider(name="SearchProjectDataProvider")
	public String[] Verify_Searchproject
	() 
	{
		String[]data={"{ \"key\":\"HRM\", \"pgn\": \"1\", \"sz\": \"10 \"}"};
		return data;
	}
	@DataProvider(name="assignemployeeDataProvider")
	public String[] Verify_assignEmployee
	() 
	{
		String[]data={"{ \"empId\":\"220\", \"pId\": \"2\"}"};
		return data;
	}
	
	@DataProvider(name="assignallmultipleempDataProvider")
	public String[] Verify_assignall
	() 
	{
		String[]data={"{ \"pId\": \"2\",\"empIds\": \"220\"}"};
		return data;
	}
	
	@DataProvider(name="getallProjectDataProvider")
	public String[] Verify_getallproject
	() 
	{
		String[]data={"{ \"pgn\": \"1\",\"sz\": \"10\"}"};
		return data;
	}
	@DataProvider(name="removeEmpDataProvider")
	public String[] Verify_removeemployee
	() 
	{
		String[]data={"{ \"empId\": \"220\",\"pId \": \"10\"}"};
		return data;
	}
	@DataProvider(name="removeMultipleEmpDataProvider")
	public String[] Verify_removeMultipleemployee
	() 
	{
		String[]data={"{ \"pId \": \"4\",\"empId\": \"220\"}"};
		return data;
	}
	
//	@DataProvider(name = "progdata")
//	String[][] get_prog_data() throws IOException {
//	String path = System.getProperty("user.dir") + "D:/eclipse-workspace/QDTAS_HRM_APITesting/Testing Data/ProgData.xlsx";
//	int rownum = XLUtils.getRowCount(path, "Sheet1");
//	int colnum = XLUtils.getCellCount(path, "Sheet1", 1);
//	String progdata[][] = new String[rownum][colnum];for (int i = 1; i <= rownum; i++) 
//	{
//	for (int j = 0; j < colnum; j++) 
//	{
//	progdata[i - 1][j] = XLUtils.getCellData(path, "Sheet1", i, j);
//	}
//	}
//	return progdata;
//	}
}
