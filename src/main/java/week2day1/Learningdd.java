package week2day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Learningdd {

	public static void main(String[] args) throws InterruptedException {
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
		//click on create leads
		driver.findElementByLinkText("Create Lead").click();
		Thread.sleep(3000);
		//enter the info
		driver.findElementById("createLeadForm_companyName").sendKeys("IBM");
		driver.findElementById("createLeadForm_firstName").sendKeys("Abinaya");
		driver.findElementById("createLeadForm_lastName").sendKeys("P");
		WebElement source=driver.findElementById("createLeadForm_dataSourceId");
		Select dd=new Select(source);
		dd.selectByIndex(4);
		WebElement Mcampaign=driver.findElementById("createLeadForm_marketingCampaignId");
		Select dd1=new Select(Mcampaign);
		List<WebElement> alloptions =dd1.getOptions();
		for(WebElement eachoption : alloptions) {

			String text=eachoption.getText();
			System.out.println(text);
		}
		//click on submit
		driver.findElementByClassName("smallSubmit").click();

	}

}
