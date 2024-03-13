package Com.Utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

public class ObjectRepo {
	public static WebDriver driver;
	public static ExtentTest test;

	public static String test(String pass,String fail) {
		 File d=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 File s = new File("D:/eclipse-workspace/QDTAS_HRM_APITesting/Screenshot/jpg.new");
		 try {
			 FileUtils.copyFile(d, s);
			 
		 }catch(IOException e) {
			 return fail;
		 }
		 return pass;
	}
}
