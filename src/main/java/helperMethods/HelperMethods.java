package helperMethods;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;

public interface HelperMethods {
		
	
		/**
		 * This method will launch the chrome browser and 
		 * maximise the browser and set the wait for 30 seconds 
		 * and load the url 
		 */
		public void startApp(String browser, boolean bReturns) throws MalformedURLException ;

		/**
		 * This method will locate the element using any given locator
		 * @param locator  - The locator by which the element to be found
		 * @param locValue - The locator value by which the element to be found
		 */
		public WebElement locateElement(String locator, String locValue) ;	
		
		/**
		 * This method will locate the element using id
		 * @param locValue - The locator value by which the element to be found
		 */
		public WebElement locateElement(String locValue) ;	
		
		/**
		 * This method will enter the value in the given text field 
		 * @param ele   - The Webelement (text field) in which the data to be entered
		 * @param data  - The data to be sent to the webelement
		 */
		public void type(WebElement ele, String data) ;
		
		/**
		 * This method will click the element and take snap
		 * @param ele   - The Webelement (button/link/element) to be clicked
		 */
		public void click(WebElement ele);

		/**
		 * This method will get the text of the element
		 * @param ele   - The Webelement (button/link/element) in which text to be retrieved
		 */
		public String getText(WebElement ele);
		
		/**
		 * This method will get the title of the page
		 */
		public String getTitle();

		/**
		 * This method will select the drop down visible text
		 * @param ele   - The Webelement (dropdown) to be selected
		 * @param value The value to be selected (visibletext) from the dropdown 
		 */
		public void selectDropDownUsingText(WebElement ele, String value) ;
		
		/**
		 * This method will select the drop down using index
		 * @param ele   - The Webelement (dropdown) to be selected
		 * @param index The index to be selected from the dropdown 
		 */
		public void selectDropDownUsingIndex(WebElement ele, int index) ;

		/**
		 * This method will verify browser actual title with expected
		 * @param title - The expected title of the browser
		 */
		public boolean verifyTitle(String expectedTitle);
		
		/**
		 * This method will verify exact given text with actual text on the given element
		 * @param ele   - The Webelement in which the text to be need to be verified
		 * @param expectedText  - The expected text to be verified
		 */
		public void verifyExactText(WebElement ele, String expectedText);
		
		/**
		 * This method will verify given text contains actual text on the given element
		 * @param ele   - The Webelement in which the text to be need to be verified
		 * @param expectedText  - The expected text to be verified
		 */
		public void verifyPartialText(WebElement ele, String expectedText);

		/**
		 * This method will verify exact given attribute's value with actual value on the given element
		 * @param ele   - The Webelement in which the attribute value to be need to be verified
		 * @param attribute  - The attribute to be checked (like value, href etc)
		 * @param value  - The value of the attribute
		 */
		public void verifyExactAttribute(WebElement ele, String attribute, String value);
		
		/**
		 * This method will verify partial given attribute's value with actual value on the given element
		 * @param ele   - The Webelement in which the attribute value to be need to be verified
		 * @param attribute  - The attribute to be checked (like value, href etc)
		 * @param value  - The value of the attribute
		 */
		public void verifyPartialAttribute(WebElement ele, String attribute, String value);
	
		/**
		 * This method will verify if the element (Radio button, Checkbox)  is selected
		 * @param ele   - The Webelement (Radio button, Checkbox) to be verified
		 */
		public boolean verifySelected(WebElement ele);
		
		/**
		 * This method will verify if the element is visible in the DOM
		 * @param ele   - The Webelement to be checked
		 * @return 
		 */
		public boolean verifyDisplayed(WebElement ele);
		
		/**
		 * This method will switch to the Window of interest
		 * @param index The window index to be switched to. 0 -> first window 
		 */
		public void switchToWindow(int index);
		
		/**
		 * This method will switch to the specific frame
		 * @param ele   - The Webelement (frame) to be switched
		 */
		public void switchToFrame(WebElement ele);
		
		/**
		 * This method will accept the alert opened
		 */
		public void acceptAlert();
		
		/**
		 * This method will dismiss the alert opened
		 */
		public void dismissAlert();
		
		/**
		 * This method will return the text of the alert
		 */
		public String getAlertText();
		
		/**
		 * This method will take snapshot of the browser
		 */
		public long takeSnap();
			
		/**
		 * This method will close the active browser
		 */
		public void closeBrowser();		
		
		/**
		 * This method will close all the browsers
		 */
		public void closeAllBrowsers();

}



