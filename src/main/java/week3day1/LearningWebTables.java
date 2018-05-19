package week3day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningWebTables {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://erail.in/");
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("mas",Keys.TAB);
		driver.findElementById("txtStationTo").sendKeys("Bangalore East");
		Thread.sleep(3000);
		driver.findElementById("chkSelectDateOnly").click();
		Thread.sleep(3000);
		
		WebElement table = driver.findElementByXPath("//table[@class='DataTable TrainList']");
		List<WebElement> trcount = table.findElements(By.tagName("tr"));
		int size = trcount.size();
		
		List<String> text1=new ArrayList<String>();
		
		for(int i=0;i<size;i++) {
			List<WebElement> tdcount = trcount.get(i).findElements(By.tagName("td"));
			String text=tdcount.get(1).getText();
			
			text1.add(text);
	}
		Collections.sort(text1);
		System.out.println(text1);
		
		
		driver.findElementByLinkText("Train Name").click();
		Thread.sleep(3000);
		
		List<String> text2=new ArrayList<String>();
		WebElement table1 = driver.findElementByXPath("//table[@class='DataTable TrainList']");
		List<WebElement> trcount1 = table1.findElements(By.tagName("tr"));
		int size1 = trcount.size();
		for(int i=0;i<size1;i++) {
			List<WebElement> tdcount1 = trcount1.get(i).findElements(By.tagName("td"));
			String textagain=tdcount1.get(1).getText();
			
			text2.add(textagain);
	}
		System.out.println(text2);
		System.out.println(text1.equals(text2));
}}
