package week4day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ComplexProject {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/?affid=vcommission&affExtParam1=50714");
		//click escape for close the login page
		driver.getKeyboard().sendKeys(Keys.ESCAPE);
		//user input for tv brand
		System.out.println("enter the tV brand");
		//Scanner scan= new Scanner(System.in);
		String tvtype = "Sam";
		//locator for tv and appliances
		WebElement tv = driver.findElementByXPath("//span[text()='TVs & Appliances']");
		WebElement samsung = driver.findElementByXPath("//span[text()='TVs by Brand']/following::span[contains(text(),'"+tvtype+"')]");
		//mouse over 
		Actions obj=new Actions(driver);
		obj.moveToElement(tv).perform();
		Thread.sleep(5000);
		obj.click(samsung).perform();
		Thread.sleep(3000);
		//price filter
		WebElement minValue = driver.findElementByXPath("//div[@class='_1QaKk1']/select[@class='a_eCSK']");
		Select selMinVal = new Select(minValue);
		selMinVal.selectByIndex(3);
		WebElement maxValue = driver.findElementByXPath("//div[@class='_3nSxeA']/select[@class='a_eCSK']");
		Select selMaxVal = new Select(maxValue);
		selMaxVal.selectByIndex(3);
		//screen size
		Thread.sleep(3000);
		WebElement ssize = driver.findElementByXPath("//div[text()='Screen Size']");
		obj.click(ssize).perform();

		Thread.sleep(3000);
		driver.findElementByXPath("//input[@type='checkbox']/following-sibling::div[contains(text(),'48 - 55')]").click();

		Thread.sleep(3000);


		String text = driver.findElementByXPath("(//div[@class='_1vC4OE _2rQ-NK'])[1]").getText();
		System.out.println(text);
		driver.findElementByXPath("(//div[@class='_1vC4OE _2rQ-NK'])[1]").click();
		//switch to next window
		Set<String> allWindow = driver.getWindowHandles();
		//System.out.println(allWindow.size());
		ArrayList<String> listOfAllWindow = new ArrayList<String>();
		listOfAllWindow.addAll(allWindow);
		String secondWindow = listOfAllWindow.get(1);
		driver.switchTo().window(secondWindow);

		//get price value of new window

		String text2 = driver.findElementByXPath("//div[@class='_1vC4OE _37U4_g']").getText();
		System.out.println(text2);
		//close the second window
		driver.close();
		//switch to current window
		driver.switchTo().window(listOfAllWindow.get(0));
		if(text.contains(text2)) {
			System.out.println("Both window prices are same");
		}
		else {
			System.out.println("Prices are not same");
		}
		//click on add  to compare
		WebElement minValue1 = driver.findElementByXPath("(//div[@class='_3T_wwx']//div[@class='col _2-gKeQ']//input[@type='checkbox'])[1]");

		obj.click(minValue1).perform();

		WebElement minValue11 = driver.findElementByXPath("(//div[@class='_3T_wwx']//div[@class='col _2-gKeQ']//input[@type='checkbox'])[2]");

		obj.click(minValue11).perform();
		// click on add compare button

		driver.findElementByXPath("//span[text()='COMPARE']").click();
		Thread.sleep(2000);
		WebElement minValue2 = driver.findElementByXPath("//div[contains(@class,'row _')]//span");
		String strTitleValue="Compare";
		if (minValue2.getText().equals(strTitleValue))
			System.out.println("Reached the compare window");
		else
			System.out.println("Not Reached the compare window");
		//check the price in compare window
		String text3 = driver.findElementByXPath("(//div[@class='_1vC4OE'])[1]").getText().replaceAll("\\D", "");
		String text4 = driver.findElementByXPath("(//div[@class='_1vC4OE'])[2]").getText().replaceAll("\\D", "");

		int x = Integer.parseInt(text3);
		int y = Integer.parseInt(text4);
		//print the lowest price
		if(x>y) {
			System.out.println("The lowest price is "+y);
		}
		else
			System.out.println("The lowest price is "+x);



	}

}
