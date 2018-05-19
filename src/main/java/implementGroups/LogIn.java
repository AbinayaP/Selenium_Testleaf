package implementGroups;



import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.SeMethods;

public class LogIn extends SeMethods{
	@Test(groups= {"smoke"})
	public void run() {
		startApp("chrome", "http://leaftaps.com/opentaps");
		WebElement userName = locateElement("id","username");
		type(userName, "DemoSalesManager");
		WebElement passWord = locateElement("id", "password");
		type(passWord, "crmsfa");
		WebElement login = locateElement("class", "decorativeSubmit");
		click(login);	
		
		//create lead
		WebElement crmLink = locateElement("link", "CRM/SFA");
		click(crmLink);
		//Click on leads
		WebElement leadsLink = locateElement("link", "Leads");
		click(leadsLink);
		takeSnap();
		//Click on Create Lead
		WebElement CreateLink = locateElement("link","Create Lead");
		click(CreateLink);
		//enter input
		WebElement Cname = locateElement("id", "createLeadForm_companyName");
		type(Cname, "yoy");
		WebElement Fname = locateElement("id", "createLeadForm_firstName");
		type(Fname, "guru");
		WebElement Lname = locateElement("id", "createLeadForm_lastName");
		type(Lname, "sir");
		//dropdown
		WebElement source = locateElement("id", "createLeadForm_dataSourceId");
		selectDropDownUsingText(source, "LEAD_COLDCALL");

		
	}
	
	

}
