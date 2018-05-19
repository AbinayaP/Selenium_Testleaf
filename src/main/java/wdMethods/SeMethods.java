package wdMethods;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;



public class SeMethods  implements WdMethods{
	RemoteWebDriver driver;	
	int i = 1;
	
	public void startApp(String browser, String url) {
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();
				
			} else if(browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			}
			else {
				System.setProperty("webdriver.safari.driver", "./drivers/safari.exe");
			driver = new SafariDriver();
			}
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			System.err.println("safari driver only runs on mac machine");
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("The Browser is Launched");

	}

	public WebElement locateElement(String locator, String locValue) {
		try {
			switch (locator) {
			case "id":
				return	driver.findElementById(locValue);		
			case "name":
				return	driver.findElementByName(locValue);			
			case "class":
				return	driver.findElementByClassName(locValue);			
			case "link":
				return	driver.findElementByLinkText(locValue);			
			case "tag":
				return	driver.findElementByTagName(locValue);			
			case "xpath":
				return	driver.findElementByXPath(locValue);
			default:
				break;
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The element "+ locator+"not found"+ "with value"+ locValue);
			
		}
		return null;
	}

	public WebElement locateElement(String locValue) {
		try {
			return locateElement("id", locValue);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The element id"+"not found"+ "with value"+ locValue);
		}
		return null;
	}

	public void type(WebElement ele, String data)  {
		try {
			ele.clear();
			ele.sendKeys(data);
			
			
		} catch (InvalidElementStateException  e) {
			// TODO Auto-generated catch block
			System.err.println("the element  is not interactable");
		}
		finally {
		takeSnap();}
	}

	public void click(WebElement ele) {
		
		try {
			ele.click();
			System.out.println("The Element Is Clicked");
		} catch (ElementNotSelectableException e) {
			// TODO Auto-generated catch block
			System.err.println("the element is not clickable");
		}
		finally {
		takeSnap();}
	}

	public void clickWithNoSnap(WebElement ele) {
		// TODO Auto-generated method stub
		try {
			ele.click();
			System.out.println("The Element Is Clicked");
		} catch (ElementNotSelectableException e) {
			// TODO Auto-generated catch block
			System.err.println("the element is not clickable");
		}

	}

	public String getText(WebElement ele) {
		// TODO Auto-generated method stub
		try {
			System.out.println("The text retrived from elenment"+ele);
			return ele.getText();
		} catch (ElementNotInteractableException e) {
			System.err.println("Not able to interact with element to get the text");
			throw new RuntimeException();
			
		}
		
	}

	public void selectDropDownUsingText(WebElement ele, String value) {

		// TODO Auto-generated method stub
		Select dd=new Select(ele);
		dd.selectByValue(value);
		takeSnap();
		System.out.println("The given value got selected" +value);

	}

	public void selectDropDownUsingIndex(WebElement ele, int index) {
		// TODO Auto-generated method stub
		Select dd=new Select(ele);
		dd.selectByIndex(index);
		takeSnap();
		System.out.println("The given value got selected" +index);

	}

	public boolean verifyTitle(String expectedTitle) {
		// TODO Auto-generated method stub
		String acutaltitle=driver.getTitle();
		if(acutaltitle.equals(expectedTitle)) {
			System.out.println("The given title "+expectedTitle+"is  matched with page title of"+acutaltitle);
			return true;
		}
		else {
			System.out.println("The given title "+expectedTitle+"is not matched with page title of"+acutaltitle);
			return false;
		}


	}

	public void verifyExactText(WebElement ele, String expectedText) {
		
		String Exct_text=ele.getText();
		if(Exct_text.equals(expectedText)) {
			System.out.println("The element text"+Exct_text+" is equal to expected text");
		}
		else
			System.out.println("The element text"+Exct_text +" is not equal to expected text");

	}

	public void verifyPartialText(WebElement ele, String expectedText) {
		
		String actual_text=ele.getText();
		if(actual_text.contains(expectedText))
			System.out.println("The given text"+expectedText +" is having the actual text of"+actual_text);
		else
			System.out.println("The given text"+expectedText +" is not having the actual text of"+actual_text);
	}

	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		
		String Actual_value = ele.getAttribute(attribute);
		if(Actual_value.equals(value))
			System.out.println("The element attribute "+attribute+"value is matched with given value"+value);
		else
			System.out.println("The element attribute "+attribute+"value is not matched with given value"+value);
	}

	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		
		String Actual_value = ele.getAttribute(attribute);
		if(Actual_value.contains(value))
			System.out.println("The element attribute "+attribute+"value is partially matched with given value"+value);
		else
			System.out.println("The element attribute "+attribute+"value is not partially matched with given value"+value);

	}

	public void verifySelected(WebElement ele) {
		takeSnap();
		if(ele.isSelected())
			System.out.println("The element got selected");
		else
			System.out.println("The element is not selected");

	}

	public void verifyDisplayed(WebElement ele) {
		takeSnap();
		if(ele.isDisplayed())
			System.out.println("The element is displayed");
		else
			System.out.println("The element is not displayed");

	}

	public void switchToWindow(int index) {
		// TODO Auto-generated method stub
		Set<String> winhandle = driver.getWindowHandles();
		List<String> winhandle1=new ArrayList<String>();
		 winhandle1.addAll(winhandle);
		driver.switchTo().window(winhandle1.get(index));
		takeSnap();
		System.out.println("The given wimndow "+index +"got switched");

	}

	public void switchToFrame(WebElement ele) {
		driver.switchTo().frame(ele);
		takeSnap();
		System.out.println("The Given frame got switched using element"+ele);

	}

	public void acceptAlert() {
		takeSnap();
		driver.switchTo().alert().accept();
		System.out.println("The alert got accepted");

	}

	public void dismissAlert() {
		takeSnap();
		driver.switchTo().alert().dismiss();
		System.out.println("The given alert got dismissed");
		

	}

	public String getAlertText() {
		takeSnap();
		System.out.println("the text of alert retrived");
		return driver.switchTo().alert().getText();
		
	}

	public void takeSnap() {
		File src = driver.getScreenshotAs(OutputType.FILE);
		File desc = new File("./snaps/img"+i+".png");
		try {
		FileUtils.copyFile(src, desc);
		} catch (IOException e) {
		e.printStackTrace();
		}
		i++;
		}

	public void closeBrowser() {
		driver.close();
		System.out.println("The current browser get closed");

	}

	public void closeAllBrowsers() {
		driver.quit();
		System.out.println("All browser get closed");

	}

	



}
