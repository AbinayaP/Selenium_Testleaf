package week2day2;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningGetScreenShot {

	public static void main(String[] args) throws InterruptedException, IOException {
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
		Screenshot.getscreenshot(driver,"./snaps/img1.png");
		//click on crmfs
		driver.findElementByLinkText("CRM/SFA").click();
		Thread.sleep(5000);
		
		Screenshot.getscreenshot(driver,"./snaps/img2.png");
		//click on leads
		driver.findElementByLinkText("Leads").click();
		Thread.sleep(3000);
		Screenshot.getscreenshot(driver,"./snaps/img3.png");
		//click on create leads
		driver.findElementByLinkText("Create Lead").click();
		Thread.sleep(3000);
		Screenshot.getscreenshot(driver,"./snaps/img4.png");
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
