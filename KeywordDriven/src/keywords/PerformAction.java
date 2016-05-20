package keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PerformAction {
	WebDriver driver;
	public PerformAction(WebDriver a){
		this.driver = a;
	}
	
	public void DoSomething(String locator, String webObject, String keyword, String value ) throws Exception{
		switch (keyword.toUpperCase()) {
		case "GOTOURL":
			//GO to URL
			driver.get(ReadObjectRepo.getProperty(value));
			break;
		case "CLICK":
			driver.findElement(this.getObject(locator,webObject)).click();
			break;
		case "SETEXT":
			driver.findElement(this.getObject(locator,webObject)).sendKeys(value);
			break;
		case "GETTEXT":
			driver.findElement(this.getObject(locator,webObject)).getText();
			break;
		default:
			break;
		}
	}
	


	private By getObject(String locator, String webObject) throws Exception{
		//Find by xpath
		if(locator.equalsIgnoreCase("XPATH")){
			
			return By.xpath(ReadObjectRepo.getProperty(webObject));
		}
		else if(locator.equalsIgnoreCase("ID")){
			return By.id(ReadObjectRepo.getProperty(webObject));
		}
		else if(locator.equalsIgnoreCase("CLASSNAME")){
			return By.className(ReadObjectRepo.getProperty(webObject));
		}
		else if(locator.equalsIgnoreCase("CSSSELECTOR")){
			return By.cssSelector(ReadObjectRepo.getProperty(webObject));
		}
		else if(locator.equalsIgnoreCase("LINKTEXT")){
			return By.linkText(ReadObjectRepo.getProperty(webObject));
		}
		else if(locator.equalsIgnoreCase("PARTIALLINKTEXT")){
			return By.partialLinkText(ReadObjectRepo.getProperty(webObject));
		}
		else if(locator.equalsIgnoreCase("NAME")){
			return By.name(ReadObjectRepo.getProperty(webObject));
			
		}
		else if(locator.equalsIgnoreCase("TAGNAME")){
			return By.tagName(ReadObjectRepo.getProperty(webObject));
		
		}else{
			throw new Exception("What are you looking for idiot? I can't find it");
		}
		 
		
	}



}
