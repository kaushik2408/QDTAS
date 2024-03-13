package Com.Base;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class Utility {
	public static String getDataProviderExcelsheet(int row,int cell) throws EncryptedDocumentException,IOException {
	String data;
	FileInputStream excel=new FileInputStream("D:/eclipse-workspace/QDTAS_HRM_APITesting/Testing Data/excelData.xlsx");
	Sheet Inputdata=WorkbookFactory.create(excel).getSheet("Sheet1");
		try {
			
			data=Inputdata.getRow(row).getCell(cell).getStringCellValue();
		}catch(Exception e) {
			
			long intdata=(long)Inputdata.getRow(row).getCell(cell).getNumericCellValue();
			data="" +intdata;
		}
		return data;
}
    public static void getscreenshot(WebDriver driver) throws IOException {
    	Date Currentdate=new Date();
   	 String a=Currentdate.toString().replace(":", "");
   	 File s=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
   	 File d = new File("D:/eclipse-workspace/QDTAS_HRM_APITesting/Screenshot/ss2/"+a+".png");
   	 FileUtils.copyFile(s, d);
   	 
    }
    
}

