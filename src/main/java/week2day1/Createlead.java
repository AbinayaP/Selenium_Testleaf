package week2day1;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import wdMethods.SeMethods;
import week2day2.Screenshot;

public class Createlead extends Screenshot {
	
@Test
	public void  run() throws InterruptedException, IOException {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeOptions op= new ChromeOptions();
	op.addArguments("disable-infobars");
	op.addArguments("start-maximized");
	
	//op.setHeadless(true);
	ChromeDriver driver = new ChromeDriver(op);
	
		//driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/control/main");
		
		//login
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		
		getscreenshot(driver,"./snaps/chrome.png");
		Thread.sleep(3000);
		//click on crmfs
		driver.findElementByLinkText("CRM/SFA").click();
		Thread.sleep(5000);
		//click on leads
		driver.findElementByLinkText("Leads").click();
		Thread.sleep(3000);
		//click on create leads
		driver.findElementByLinkText("Create Lead").click();
		Thread.sleep(3000);
		//enter the info
		driver.findElementById("createLeadForm_companyName").sendKeys("IBM");
		driver.findElementById("createLeadForm_firstName").sendKeys("Abinaya");
		driver.findElementById("createLeadForm_lastName").sendKeys("P");

		//enter date of birth
		driver.findElementById("createLeadForm_birthDate-button").click();

		List<WebElement> allrows = driver.findElementsByClassName("daysrow");	

		List<WebElement> allcoulmns = allrows.get(0).findElements(By.tagName("td"));

		allcoulmns.get(1).click();

		//click on submit
		driver.findElementByClassName("smallSubmit").click();

	}

}
