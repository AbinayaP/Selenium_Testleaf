package week4day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Click_drag {

	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			RemoteWebDriver driver = new ChromeDriver();
			//maximiza bowser
			driver.manage().window().maximize();

			//get URl
			driver.get("http://jqueryui.com/sortable/");
			Thread.sleep(2000);

			//Internet_access
			
			WebElement frame = driver.findElementByXPath("//iframe[@class='demo-frame']");
			driver.switchTo().frame(frame);


			//Click on item
			WebElement drag1 = driver.findElementByXPath("//li[text()='Item 1']");
			WebElement drag3 = driver.findElementByXPath("//li[text()='Item 3']");
			int x = drag3.getLocation().getX();
			int y = drag3.getLocation().getY();

			Actions object = new Actions(driver);
			object.dragAndDropBy(drag1, x, y).perform();

			//object.dragAndDropBy(drag, xOffset, yOffset)




	}

}
