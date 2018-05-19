package implementGroups;

import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class DuplicateLead extends SeMethods {
	@Test(groups= {"sanity"},dependsOnGroups= {"smoke"})
	public void run() throws InterruptedException{
	 startApp("chrome", "http://leaftaps.com/opentaps");
	WebElement userName = locateElement("id","username");
	type(userName, "DemoSalesManager");
	WebElement passWord = locateElement("id", "password");
	type(passWord, "crmsfa");
	WebElement login = locateElement("class", "decorativeSubmit");
	click(login);	
	
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
	//click email tab
	WebElement emailtab = locateElement("xpath", "//span[text()='Email']");
	click(emailtab);
	//give email id
	WebElement email = locateElement("name", "emailAddress");
	type(email, "abi.mit94@gmail.com");
	//clickfind leads button
		WebElement findleadbutton = locateElement("xpath", "//button[text()='Find Leads']/ancestor::td[1]");
		click(findleadbutton);
		//get first name
		WebElement firstname = locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a");
		String text = getText(firstname);
		//click first id
		
		WebElement firstid1 = locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		Thread.sleep(3000);
		click(firstid1);
		//click duplicate
		WebElement duplicate = locateElement("link","Duplicate Lead" );
		click(duplicate);
		verifyTitle("Duplicate Lead");
		//click create lead
		WebElement createlead = locateElement("xpath", "//input[@value='Create Lead']");
		click(createlead);
		//get first name
		
		WebElement name = locateElement("viewLead_firstName_sp");
		
		verifyExactText(name, text);
	
	}}
