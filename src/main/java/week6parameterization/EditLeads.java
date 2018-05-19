package week6parameterization;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class EditLeads extends ProjectMethods {
	
	@BeforeClass
	public void bfclass() {
		filename="TC002";
	}
	@Test(dataProvider="fetchdata")
	public void run(String Fname,String cname) throws InterruptedException {
		//edit lead
		//Crmsfa
		WebElement crmLink = locateElement("link", "CRM/SFA");
		click(crmLink);
		//Click on leads
		WebElement leadsLink = locateElement("link", "Leads");
		click(leadsLink);
		takeSnap();
		//Edit Lead
		WebElement edit_lead = locateElement("link", "Find Leads");
		click(edit_lead);
		Thread.sleep(3000);
		takeSnap();
		//Click Find
		WebElement find = locateElement("xpath", "//div[@class='x-tab-panel-header x-unselectable']/following::input[2]");
		type(find, Fname);
		//click on find leads button
			WebElement findleadbutton = locateElement("xpath", "//button[text()='Find Leads']/ancestor::td[1]");
			click(findleadbutton);
			//click first id 
			Thread.sleep(3000);
			WebElement firstid = locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
			Thread.sleep(3000);
			click(firstid);
			//pagetitle
			Thread.sleep(3000);
			verifyTitle("View Lead | opentaps CRM ");
			//click edit
			
			click(locateElement("link", "Edit"));
			
			//update value
			Thread.sleep(3000);
			WebElement companame = locateElement("updateLeadForm_companyName");
			type(companame, cname);
			//click update
			Thread.sleep(3000);
			WebElement updatebuton = locateElement("xpath", "//input[@value='Update']");
			click(updatebuton);
			//check the value
			WebElement compn = locateElement("viewLead_companyName_sp");
			verifyPartialText(compn, "CTS");
			//close the browse
			
			
			
	}
}