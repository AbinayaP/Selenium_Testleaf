package week3day2;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class AdvancedApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement email = driver.findElementById("email");
		
		email.clear();
		Actions builder=new Actions(driver);
		Action build = builder.click(email).keyDown(email, Keys.SHIFT).sendKeys(email, "abinaya").keyUp(email, Keys.SHIFT).doubleClick(email).contextClick(email).build();

		
		build.perform();
	}

}
