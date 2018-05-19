package week4day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LearningDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		RemoteWebDriver driver = new ChromeDriver();
		//maximiza bowser
		driver.manage().window().maximize();

		//get URl
		driver.get("http://jqueryui.com/draggable/");
		Thread.sleep(2000);

		//Internet_access
		
		WebElement frame = driver.findElementByXPath("//iframe[@class='demo-frame']");
		driver.switchTo().frame(frame);

		//Click on item
		WebElement drag = driver.findElementById("draggable");
		Actions object = new Actions(driver);
		object.dragAndDropBy(drag, 120, 600).perform();

		}

	}


