package week2day1;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Learningirctc {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		Thread.sleep(5000);
		driver.findElementByLinkText("Sign up").click();
		driver.findElementById("userRegistrationForm:userName").sendKeys("ap11");
		driver.findElementById("userRegistrationForm:password").sendKeys("m324hhf");
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("m324hhf");
		WebElement qn = driver.findElementById("userRegistrationForm:securityQ");
		Select dd=new Select(qn);
		dd.selectByIndex(1);
		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("cheeta");
		WebElement language = driver.findElementById("userRegistrationForm:prelan");
		Select dd1=new Select(language);
		dd1.selectByValue("hi");
		driver.findElementById("userRegistrationForm:firstName").sendKeys("Abinya");
		driver.findElementById("userRegistrationForm:lastName").sendKeys("p");
		driver.findElementById("userRegistrationForm:gender:1").click();
		driver.findElementById("userRegistrationForm:maritalStatus:1").click();
		WebElement date=driver.findElementById("userRegistrationForm:dobDay");
		Select dd2=new Select(date);
		dd2.selectByValue("27");
		WebElement month=driver.findElementById("userRegistrationForm:dobMonth");
		Select dd3=new Select(month);
		dd3.selectByValue("06");
		WebElement year=driver.findElementById("userRegistrationForm:dateOfBirth");
		Select dd4=new Select(year);
		dd4.selectByVisibleText("1994");
		WebElement occupation=driver.findElementById("userRegistrationForm:occupation");
		Select dd5=new Select(occupation);
		dd5.selectByVisibleText("Professional");
		driver.findElementById("userRegistrationForm:uidno").sendKeys("24545");
		driver.findElementById("userRegistrationForm:idno").sendKeys("467676");
		WebElement country=driver.findElementById("userRegistrationForm:countries");
		Select dd6=new Select(country);
		List<WebElement> options = dd6.getOptions();
		for(WebElement a:options) {
			System.out.println(a.getText());
		}
		
		//dd6.selectByVisibleText("India");
		driver.findElementById("userRegistrationForm:email").sendKeys("abi.mit94@gmail.com");
		driver.findElementById("userRegistrationForm:mobile").sendKeys("9626817324");
		WebElement nationality=driver.findElementById("userRegistrationForm:nationalityId");
		Select dd7=new Select(nationality);
		dd7.selectByVisibleText("India");
		driver.findElementById("userRegistrationForm:address").sendKeys("23 first");
		driver.findElementById("userRegistrationForm:street").sendKeys("main");
		driver.findElementById("userRegistrationForm:area").sendKeys("venkateswara");
		driver.findElementById("userRegistrationForm:pincode").sendKeys("600089",Keys.TAB);
		Thread.sleep(5000);
		WebElement city=driver.findElementById("userRegistrationForm:cityName");
		Select dd8=new Select(city);
		dd8.selectByIndex(1);
		Thread.sleep(5000);
		WebElement pofice=driver.findElementById("userRegistrationForm:postofficeName");
		Select dd9=new Select(pofice);
		dd9.selectByIndex(1);
		driver.findElementById("userRegistrationForm:landline").sendKeys("236737");
		driver.findElementById("userRegistrationForm:resAndOff:0").click();
		
		
		
		
		
		
		
		
		
		
	}

}
