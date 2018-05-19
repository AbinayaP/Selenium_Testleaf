package week2day2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Screenshot {
	public static void getscreenshot(ChromeDriver driver,String n) throws IOException {
	
	File src = driver.getScreenshotAs(OutputType.FILE);
	File desc= new File(n);
	FileUtils.copyFile(src, desc);}

}
