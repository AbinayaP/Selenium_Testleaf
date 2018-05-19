package codingchallenge;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.naming.MalformedLinkException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException {
		int respcode=200;
		
		System.setProperty("Webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/crmsfa/control/main?externalLoginKey=EL331491204432");
		Thread.sleep(3000);
		
		List<WebElement> links=driver.findElementsByTagName("a");
		
		
		for(WebElement link :links) {
			String url = link.getAttribute("href");
			System.out.println(url);
					HttpURLConnection huc=(HttpURLConnection)(new URL(url).openConnection());
					huc.setRequestMethod("HEAD");
					huc.connect();
					respcode=huc.getResponseCode();
					System.out.println(respcode);
					if(respcode>=400) {
						System.out.println("not a valid link");
					}
					else
						System.out.println("valid link");
			
		}
		}
		}
		
		
	