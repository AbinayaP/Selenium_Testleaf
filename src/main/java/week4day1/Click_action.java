package week4day1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Click_action {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		RemoteWebDriver driver = new ChromeDriver();
		//maximiza bowser
		driver.manage().window().maximize();

		//get URl
		driver.get("http://jqueryui.com/selectable/");
		Thread.sleep(2000);

		//Internet_access
		
		WebElement frame = driver.findElementByXPath("//iframe[@class='demo-frame']");
		driver.switchTo().frame(frame);
		WebElement item1 = driver.findElementByXPath("//ol[@id='selectable']/li[1]");
		WebElement item2 = driver.findElementByXPath("//ol[@id='selectable']/li[2]");
		WebElement item3 = driver.findElementByXPath("//ol[@id='selectable']/li[3]");
		Actions object = new Actions(driver);
		object.clickAndHold(item1).perform();
		driver.getKeyboard().sendKeys(Keys.CONTROL);
		object.click(item2).perform();
		object.click(item3).perform();
		driver.getKeyboard().releaseKey(Keys.CONTROL);



	}

}
