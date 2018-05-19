package uisprofile;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class UeMethods implements udmethods {

	RemoteWebDriver driver;	

	@Test
	public void login(String uname, String pword) {
		WebElement username = locateelement("name", "USER");
		WebElement password = locateelement("name", "PASSWORD");
		type(username, uname);
		type(password,pword);
		WebElement login = locateelement("class", "ButtonBold");

		click(login);
	}


	public WebElement locateelement(String locator, String locvalue) {
		// TODO Auto-generated method stub
		switch (locator) {
		case "id":
			return	driver.findElementById(locvalue);		
		case "name":
			return	driver.findElementByName(locvalue);			
		case "class":
			return	driver.findElementByClassName(locvalue);			
		case "link":
			return	driver.findElementByLinkText(locvalue);			
		case "tag":
			return	driver.findElementByTagName(locvalue);			
		case "xpath":
			return	driver.findElementByXPath(locvalue);
		default:
			break;
		}
		return null;
	}

	public void type(WebElement ele,String value) {

		ele.sendKeys(value);

	}

	public void click(WebElement ele ) {
		ele.click();
	}
}
