package week6parameterization;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import wdMethods.SeMethods;

public class ProjectMethods extends SeMethods {
	public String filename="";
	@Parameters({"browser","url","uname","password"})
	@BeforeMethod
	public void login(String browser,String url,String uname,String pwd) {
		startApp(browser, url);
		WebElement userName = locateElement("id","username");
		type(userName, uname);
		WebElement passWord = locateElement("id", "password");
		type(passWord, pwd);
		WebElement login = locateElement("class", "decorativeSubmit");
		click(login);	
	}
	@AfterMethod
	public void close() {
		closeBrowser();
	}
	@DataProvider(name="fetchdata")
	public Object[][]getdata() throws IOException {
		Readexcel excel=new Readexcel();
		return excel.rexcel(filename);
		
	}

}
