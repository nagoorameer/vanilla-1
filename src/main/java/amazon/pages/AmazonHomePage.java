package amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import helperMethods.ProjectMethods;


public class AmazonHomePage extends ProjectMethods {


	public AmazonHomePage() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(how=How.ID,using="nav-hamburger-menu")
	private WebElement eleHamburgerMenu;

	@FindBy(how=How.XPATH,using="//div[text()='TV, Appliances, Electronics']")
	private WebElement eleDepartment;

	@FindBy(how=How.XPATH,using="//a[text()='Televisions']")
	private WebElement eleTelevision;



	public AmazonHomePage assertThatHomePageTitleIsCorrect() {
		verifyTitle("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
		return this;
	}

	public AmazonHomePage clickMenu() {
		click(eleHamburgerMenu);
		return this;
	}

	public AmazonHomePage selectDepartment() {
		click(eleDepartment);
		return this;
	}

	public AmazonTelevisionPage selectSubsection() {
		click(eleTelevision);
		return new AmazonTelevisionPage();
	}


}
