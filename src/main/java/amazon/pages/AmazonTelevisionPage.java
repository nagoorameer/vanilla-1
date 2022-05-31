package amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import helperMethods.ProjectMethods;

public class AmazonTelevisionPage extends ProjectMethods {

	public AmazonTelevisionPage() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(how=How.XPATH,using="//span[text()='Samsung']")
	private WebElement eleBrand;



	public AmazonTelevisionPage assertThatTelevisionPageTitleIsCorrect() throws InterruptedException {
		//verifyTitle("Buy the latest LED TVs, 4K TVs and Android TVs online at Best Prices in India-Amazon.in | Shop by size, price, features and more");
		verifyPartialTitle("Amazon.in");
		return this;
	}

	public AmazonSamsungTVPage selectBrand() {
		click(eleBrand);
		return new AmazonSamsungTVPage();
	}


}
