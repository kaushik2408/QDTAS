package API.EndPoint_Timesheet;

public class ROUTES_Timesheet {
	public static  String Baseurl="https://qdtashrm-backend.onrender.com";
	public static  String postAddTimesheet_url=Baseurl+"/ts/add";
	public static  String postUpdateTimesheet_url=Baseurl+"/ts/updateById/1";
    public static  String postgetallEmpIdTimesheet_url=Baseurl+"/ts/getByEmpId/1";
    public static  String postDeleteTimesheetById_url=Baseurl+"/ts/deleteById/1";
}
