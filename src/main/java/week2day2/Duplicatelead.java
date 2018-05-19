package week2day2;

import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Duplicatelead {
@Test
	public  void duplicate() throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		//login
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		Thread.sleep(3000);
		//click on crmfs
		driver.findElementByLinkText("CRM/SFA").click();
		Thread.sleep(5000);
		//click on leads
		driver.findElementByLinkText("Leads").click();
		Thread.sleep(3000);	
		//click on find leads
		driver.findElementByLinkText("Find Leads").click();
		Thread.sleep(5000);
		//click on email tab
		driver.findElementByXPath("//span[text()='Email']").click();
		//enter email id
		driver.findElementByName("emailAddress").sendKeys("abi.mit94@gmail.com");
		//click findleads button
		driver.findElementByXPath("//button[text()='Find Leads']/ancestor::td[1]").click();
		Thread.sleep(3000);
		//get  first name  
		String text = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a").getText();
		Thread.sleep(3000);
		//click first id
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		Thread.sleep(3000);
		driver.findElementByLinkText("Duplicate Lead").click();
		Thread.sleep(3000);
		String text2 = driver.findElementById("sectionHeaderTitle_leads").getText();
		if(text2.equals("Duplicate Lead")) {
			driver.findElementByXPath("//input[@value='Create Lead']").click();
			Thread.sleep(3000);
			String text3 = driver.findElementById("viewLead_firstName_sp").getText();
			if(text.equals(text3)) {
				System.out.println("name verified");
				driver.close();
			}
		}
	}

}
