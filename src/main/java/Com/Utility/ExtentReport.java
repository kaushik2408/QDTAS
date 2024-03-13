package Com.Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport {
	public static ExtentReports extent;
	public static ExtentReports extentReporterGenerator() {
		String pathreports="D:/eclipse-workspace/QDTAS_HRM_APITesting/TestReport/Index.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(pathreports);
		reporter.config().setDocumentTitle(" Test Reports");
	    reporter.config().setReportName("API Automation Test Report");
	    reporter.config().setTheme(Theme.DARK);
	    extent=new ExtentReports();
	    extent.attachReporter(reporter);
	    extent.setSystemInfo("Project name","QDTAS_HRM");
	    extent.setSystemInfo("QA","Kaushik Kulkarni");
	    extent.setSystemInfo("Browser","Chrome");
	    extent.setSystemInfo("OS","Windows");
	    return extent;
	}
}
