package week3day2;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Learningwindowhandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Chrome driver
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		RemoteWebDriver driver = new ChromeDriver();
		//maximiza bowser
		driver.manage().window().maximize();

		//get URl
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		Thread.sleep(2000);

		
		//Click on Contact us
		driver.findElementByLinkText("Contact Us").click();

		// get new window
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> allWindows = new ArrayList<String>();
		allWindows.addAll(windowHandles);

		//Move to new window
		String secondWindow = allWindows.get(1);
		driver.switchTo().window(secondWindow);
		System.out.println(driver.getCurrentUrl());
		driver.close();
		Thread.sleep(2000);
		//Back to activity window.
		String firstWindow = allWindows.get(0);
		driver.switchTo().window(firstWindow);
		System.out.println(driver.getCurrentUrl());
		driver.close();
		}



}
