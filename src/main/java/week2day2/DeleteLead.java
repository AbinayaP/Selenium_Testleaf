package week2day2;

import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DeleteLead {
@Test
	public  void delete() throws InterruptedException {
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
		//click on phone tab
		driver.findElementByXPath("//span[text()='Phone']").click();
		//give phone number
		driver.findElementByName("phoneNumber").sendKeys("9626817324");
		//click findleads button
		driver.findElementByXPath("//button[text()='Find Leads']/ancestor::td[1]").click();
		Thread.sleep(3000);
		//get  first id 
		String text = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").getText();
		//click first id
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		//delete id
		driver.findElementByLinkText("Delete").click();
		Thread.sleep(3000);
		//click again fin leads to verify the deleted id is exist or not
		driver.findElementByLinkText("Find Leads").click();
		//give the lead id
		driver.findElementByXPath("//div[@class='x-tab-panel-header x-unselectable']/following::input[1]").sendKeys(text);
		Thread.sleep(3000);
		//click find leads
		driver.findElementByXPath("//button[text()='Find Leads']/ancestor::td[1]").click();
		Thread.sleep(3000);
		String text2 = driver.findElementByXPath("//div[text()='No records to display']").getText();
		System.out.println(text2);
		if(text2.equals("No records to display")) {
			driver.close();}
			else
			{
				System.out.println("not deleted");
			}
		
		
		
		

	}

}
