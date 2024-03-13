package Com.Utility;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;



public class Listeners  implements ITestListener {
 WebDriver driver;
	ExtentReports extent=ExtentReport.extentReporterGenerator();
	ThreadLocal<ExtentTest>extentTest=new ThreadLocal<ExtentTest>();
    public void onTestStart(ITestResult result) {
    	ObjectRepo.test=extent.createTest(result.getTestClass().getName() + "==" +result.getMethod().getMethodName());
    	extentTest.set(ObjectRepo.test);
    	
    }
    public void onTestSuccess(ITestResult result) {
    	ObjectRepo.test.log(Status.PASS, "Test case Passed");
    	//extentTest.get().addScreenCaptureFromBase64String(CaptureScreen());
    	String src=((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
    	ObjectRepo.test.addScreenCaptureFromBase64String(src);
    }
    public void onTestFailure(ITestResult result) {
    	ObjectRepo.test.log(Status.FAIL, "Test case Failed");
    	//extentTest.get().addScreenCaptureFromBase64String(CaptureScreen());
    	String src=((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
    }
    
	public void onTestSkipped(ITestResult result) {
    	ObjectRepo.test.log(Status.SKIP, "Test case Skiped");
    	//extentTest.get().addScreenCaptureFromBase64String(CaptureScreen());
    	String src=((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
    	ObjectRepo.test.addScreenCaptureFromBase64String(src);
    }
    public void onFinish(ITestContext context) {
    	extent.flush();
    }
    private String CaptureScreen() 
    {
		
    	String src=((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
		return src;
    	
	}
}
