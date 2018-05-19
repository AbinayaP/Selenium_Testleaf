package week5day2;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnextendReporting {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//this Html is non editable only
		ExtentHtmlReporter file1 = new ExtentHtmlReporter("./Reports/result.html");
		file1.setAppendExisting(false);
		//we need to change this as editable
		ExtentReports edit_file = new ExtentReports();
		//import Htmlk to created object
		edit_file.attachReporter(file1);

		//naming the test cases and description
		//create an test suit
		ExtentTest suit1 = edit_file.createTest("Testcase_01", "Log in the application");
		// to assign a category and author for test1
		suit1.assignCategory("login");
		suit1.assignAuthor("Sundar");
		//Particular step details and attach screenshot
		suit1.pass("User Name Entered", MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img1.png").build());

		//Particular step details and attach screenshot
		suit1.fail("password not entered", MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img2.png").build());


		//create a test suit2
		ExtentTest suit2 = edit_file.createTest("Testcase_02", "Logout the application");
		// to assign a category and author for test1
		suit2.assignCategory("logout");
		suit2.assignAuthor("Sundar1");
		//Particular step details and attach screenshot
		suit2.pass("logout button clicked", MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img1.png").build());

		edit_file.flush();

	}

}
