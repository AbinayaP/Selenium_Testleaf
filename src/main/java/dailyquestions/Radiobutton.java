package dailyquestions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/checkbox.html");
		WebElement language = driver.findElementByXPath("//label[text()='Select the languages that you know?']/following-sibling::input[1]");
		
		language.click();
		boolean selected = language.isSelected();
		System.out.println(selected);

	}

}
