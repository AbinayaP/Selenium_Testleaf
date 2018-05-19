package week6parameterization;


import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import wdMethods.SeMethods;

public class DeleteLead extends ProjectMethods{
	@BeforeClass
	public void bfclass() {
		filename="TC003";
	}
	@Test(dataProvider="fetchdata")
	public void run(String phno) throws InterruptedException{
	//delete lead
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
	//click on phone tabs
	WebElement phonetab = locateElement("xpath", "//span[text()='Phone']");
	click(phonetab);
	//give phone number
	WebElement phone = locateElement("name", "phoneNumber");
	type(phone, phno);
	//clickfind leads button
	WebElement findleadbutton = locateElement("xpath", "//button[text()='Find Leads']/ancestor::td[1]");
	click(findleadbutton);
	//get first id
	WebElement firstid = locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
	String text = getText(firstid);
	//click first id
	click(firstid);
	//delete id
	WebElement deleteid = locateElement("link", "Delete");
	click(deleteid);
	//again click findleads
		WebElement edit_lead1 = locateElement("link", "Find Leads");
		click(edit_lead1);
		Thread.sleep(3000);
		takeSnap();
		//give the lead id
		WebElement leadid = locateElement("xpath", "//div[@class='x-tab-panel-header x-unselectable']/following::input[1]");
	type(leadid, text);
	//clickfind leads button
		WebElement findleadbutton1 = locateElement("xpath", "//button[text()='Find Leads']/ancestor::td[1]");
		click(findleadbutton1);
		Thread.sleep(3000);
	WebElement display = locateElement("xpath", "//div[text()='No records to display']");
	verifyExactText(display, "No records to display");
		
}}
