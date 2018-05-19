package week6parameterization;



import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import wdMethods.SeMethods;

public class Createlead extends ProjectMethods{
	
	
	@BeforeClass
	public void bfclass() {
		filename="TC001";
	}
	@Test(dataProvider="fetchdata")
	public void run(String cname,String fname,String lname) {
		
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
		type(Cname, cname);
		WebElement Fname = locateElement("id", "createLeadForm_firstName");
		type(Fname, fname);
		WebElement Lname = locateElement("id", "createLeadForm_lastName");
		type(Lname, lname);
		//dropdown
		WebElement source = locateElement("id", "createLeadForm_dataSourceId");
		selectDropDownUsingText(source, "LEAD_COLDCALL");
		WebElement submit = locateElement("class", "smallSubmit");
		click(submit);
		
	}
	
	

}
