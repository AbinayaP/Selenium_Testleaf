package week2day2;

import org.testng.annotations.Test;
import java.io.IOException;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EditLeads {
@Test
	public  void edit() throws InterruptedException, IOException {
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
		driver.findElementByLinkText("Find Leads").click();
		Thread.sleep(5000);
		//enter first name to find leads
		driver.findElementByXPath("//div[@class='x-tab-panel-header x-unselectable']/following::input[2]").sendKeys("Abinaya");
		//click find leads button
		driver.findElementByXPath("//button[text()='Find Leads']/ancestor::td[1]").click();

		Thread.sleep(3000);
		//click first id 

		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();

		String text = driver.findElementById("sectionHeaderTitle_leads").getText();
		System.out.println(text);
		System.out.println( text.equals("View Lead"));
		driver.findElementByLinkText("Edit").click();
		Thread.sleep(2000);
		driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys("CTS");
		driver.findElementByXPath("//input[@value='Update']").click();
		Thread.sleep(3000);
		Screenshot.getscreenshot(driver, "./snaps/img5.png");
		String text2 = driver.findElementById("viewLead_companyName_sp").getText();
		System.out.println(text2.contains("CTS"));
		driver.close();





	}
}