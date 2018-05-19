package week2day2;

import org.testng.annotations.Test;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Createlead {
@Test(invocationCount=5)
	public void create() throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
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
		/*WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		Select dd=new Select(source);
	
		List<WebElement> options = dd.getOptions();
		String[] text=new String[options.size()];
		String count[]=new String[options.size()];
		for(WebElement a:options)
		{
			
			for(int i =0;i<options.size();i++) {
			text[i] =  a.getText();
			if(text[i].startsWith("E")) {
				for(int j=0;j<=options.size();j++) {
				count[j]=text[i];
						}
			}
			}
		}
		//dd.selectByIndex(j);*/
		WebElement Mcampaign=driver.findElementById("createLeadForm_marketingCampaignId");
		Select dd1=new Select(Mcampaign);
		dd1.selectByValue("CATRQ_CARNDRIVER");
		driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Naveena");
		driver.findElementById("createLeadForm_lastNameLocal").sendKeys("P");
		driver.findElementById("createLeadForm_personalTitle").sendKeys("PA");
		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Leadscr");
		driver.findElementById("createLeadForm_departmentName").sendKeys("insurance");
		driver.findElementById("createLeadForm_annualRevenue").sendKeys("35366");
		driver.findElementById("createLeadForm_industryEnumId").sendKeys("PAa");
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("9626817324");
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("abi.mit94@gmail.com");
		//enter date of birth
		
		driver.findElementById("createLeadForm_birthDate-button").click();

		List<WebElement> allrows = driver.findElementsByClassName("daysrow");	

		List<WebElement> allcoulmns = allrows.get(0).findElements(By.tagName("td"));

		allcoulmns.get(1).click();

		//click on submit
		driver.findElementByClassName("smallSubmit").click();

	}

}
