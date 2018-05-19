package uisprofile;

import org.openqa.selenium.WebElement;

public interface udmethods {

	/**
	 * This method used for login to portal
	 * user name and password will be a arguement 
	 * and click the submit button
	 * @author Abinaya - Metlife
	 * 		 * 
	 */
	public void login(String username, String password);
	
	/**
	 * This method used for locate element
	 * using id ,link,xpath,name,class etc 
	 * @author Abinaya - Metlife
	 * 		 * 
	 * @return 
	 */
	public  WebElement locateelement(String locator,String locvalue );
	
	/**
	 * This method used for sending value
	 * for text box 
	 * @author Abinaya - Metlife
	 * 		 * 
	 * @return 
	 */
	
	public void type(WebElement ele,String value);
	
	/**
	 * This method used for click button
	 *
	 * @author Abinaya - Metlife
	 * 		 * 
	 * @return 
	 */
	
	public void click(WebElement ele );
}
