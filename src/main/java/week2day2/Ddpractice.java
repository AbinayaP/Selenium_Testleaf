package week2day2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ddpractice {

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
		Thread.sleep(3000);
		//to select second option starts with E
		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		Select dd=new Select(source);
	
		List<WebElement> options = dd.getOptions();
		String[] text=new String[options.size()];
		String count[]=new String[options.size()];
		for(WebElement a:options)
		{
			
			for(int i =0;i<options.size();i++) {
			text[i] =  a.getText();
			if(text[i].startsWith("P")) {
				for(int j=0;j<options.size();j++) {
				count[j]=text[i];
						}
			}
			}
		}
		dd.selectByVisibleText(count[1]);
	
	}

}
