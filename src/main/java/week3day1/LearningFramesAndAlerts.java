package week3day1;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningFramesAndAlerts {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[text()='Try it']").click();
		String text="Abinaya";
		driver.switchTo().alert().sendKeys(text);
		driver.switchTo().alert().accept();
		
		String text2 = driver.findElementById("demo").getText();
		boolean contains = text2.contains(text);
		if(contains) {
			System.out.println("entered string is present");
		}
		else
			System.out.println("entered string is not present");
		

	}

}
