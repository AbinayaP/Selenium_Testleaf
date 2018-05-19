package dailyquestions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton2Uncheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://testleaf.herokuapp.com/pages/checkbox.html");
		WebElement language = driver.findElementByXPath("//label[text()='DeSelect only checked']/following-sibling::input[2]");
		
		language.click();
		boolean selected = language.isSelected();
		System.out.println(selected);

	}

}
