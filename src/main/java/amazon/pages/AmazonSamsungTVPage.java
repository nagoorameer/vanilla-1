package amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import helperMethods.ProjectMethods;

public class AmazonSamsungTVPage extends ProjectMethods {

	public AmazonSamsungTVPage() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(how=How.XPATH,using="//span[text()='Featured']/..")
	private WebElement eleFeatured;

	@FindBy(how=How.XPATH,using="//a[text()='Price: High to Low']/..")
	private WebElement eleHighToLow;

	@FindBy(how=How.XPATH,using="(//span[@class='a-price-whole'])[2]")
	private WebElement eleSecondHighestPrice;



	public AmazonSamsungTVPage assertThatSamsungTVPageTitleIsCorrect() {
		verifyTitle("Amazon.in");
		return this;
	}

	public AmazonSamsungTVPage selectSort() {
		click(eleFeatured);
		click(eleHighToLow);
		return this;
	}

	public AmazonTV_PDP_Page selectItem() {
		click(eleSecondHighestPrice);
		return new AmazonTV_PDP_Page();
	}


}
