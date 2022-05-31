package helperMethods;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import utils.DataInputProvider;

public class ProjectMethods extends HelperSeleniumMethods {

	public String browserName;
	public String dataSheetName;

	@BeforeSuite
	public void beforeSuite() {
		//System.out.println("beforeSuite");
		startResult();
	}

	@BeforeTest 
	public void setData() { 
		//System.out.println("beforeTest");
		testCaseName="TC001_AmazonE2E";
		testDescription="Amazon Samsung TV second highest price"; 
		testNodes="Leads";
		category="Smoke"; 
		authors="Ameer"; 
		browserName="Chrome";
		dataSheetName="TC001"; 
	}


	@BeforeClass
	public void beforeClass() {
		//System.out.println("beforeClass");
		startTestModule(testCaseName, testDescription);
	}

	@BeforeMethod
	public void beforeMethod() {
		//System.out.println("beforeMethod");
		test = startTestCase(testNodes); 
		test.assignCategory(category);
		test.assignAuthor(authors); 
		startApp(browserName);
	}


	/*-----@Test------*/


	@AfterMethod
	public void afterMethod() {
		//System.out.println("afterMethod");
		closeAllBrowsers();
	}

	@AfterClass
	public void afterClass() {
		//System.out.println("afterClass");
	}

	@AfterTest
	public void afterTest() {
		//System.out.println("afterTest");
	}

	@AfterSuite
	public void afterSuite() {
		//System.out.println("afterSuite");
		endResult();
	}




	@DataProvider(name = "fetchData")
	public Object[][] getData() {
		return DataInputProvider.getSheet(dataSheetName);
	}

}
