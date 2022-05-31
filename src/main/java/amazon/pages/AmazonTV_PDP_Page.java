package amazon.pages;

import static org.testng.Assert.assertFalse;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.gargoylesoftware.htmlunit.javascript.host.Console;

import helperMethods.ProjectMethods;

public class AmazonTV_PDP_Page extends ProjectMethods {
	
	public AmazonTV_PDP_Page() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.XPATH,using="//h1[text()=' About this item ']")
	private List<WebElement> eleDescriptions;
	
	@FindBy(how=How.XPATH,using="//h1[text()=' About this item ']")
	private WebElement eleDescription;
	
	@FindBy(how=How.XPATH,using="//h1[text()=' About this item ']/following-sibling::ul")
	private WebElement eleDescriptionText;

	public AmazonTV_PDP_Page switchToPDPPage() {
		switchToNextTab();
		return this;
	}


	public AmazonTV_PDP_Page assertThatPDPPageTitleIsCorrect() {
		verifyPartialTitle("Samsung");
		return this;
	}
	
	public AmazonTV_PDP_Page checkIfDescriptionPresent() {
		assertFalse(verifyElementsIsPresent(eleDescriptions));
		//verifyDisplayed(eleDescription);	
		return this;
	}
	
	public AmazonTV_PDP_Page getDescription() {
          System.out.println(getText(eleDescriptionText));      
          return this;
	}
	
	

}
