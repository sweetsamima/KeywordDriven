package keywords;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class DriverScript {
	WebDriver driver = new FirefoxDriver();
	
	PerformAction act = new PerformAction(driver);

  @Test
  public void anytest() throws Exception {
		FileInputStream fis = new FileInputStream("C://Users//Samima//workspace//KeywordDriven//TestCase.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		Sheet Sheetname = workbook.getSheet("KeywordFramework");
		int lastRow = Sheetname.getLastRowNum()+1;
		for (int i=1;i<lastRow;i++){
			Row row = Sheetname.getRow(i);
		
		if(row.getCell(0).toString().length()==0){
			//act= new PerformAction(driver);
			act.DoSomething(row.getCell(3).toString(), row.getCell(2).toString(), row.getCell(1).toString(), row.getCell(4).toString());
			
		}else{
			System.out.println(row.getCell(0));
			
		}
		}
		
		
	  
	  
	  
	  
	  
	  
	  
  }
  
  
  
  
  
  
  
  
  
  
  @BeforeMethod
  public void beforeMethod() {
	  
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeTest
  public void beforeTest() {
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
