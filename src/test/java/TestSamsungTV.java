import amazon.pages.AmazonHomePage;

import org.junit.jupiter.api.Tag;

import org.testng.annotations.Test;

import helperMethods.*;

public class TestSamsungTV extends ProjectMethods {

	@Tag("smokeTest")
	
	@Test
	public void AmazonE2E() throws InterruptedException {

		
		new AmazonHomePage()
		.assertThatHomePageTitleIsCorrect()
		.clickMenu()
		.selectDepartment()
		.selectSubsection()
		.assertThatTelevisionPageTitleIsCorrect()
		.selectBrand()
		.assertThatSamsungTVPageTitleIsCorrect()
		.selectSort()
		.selectItem()
		.switchToPDPPage()
		.assertThatPDPPageTitleIsCorrect()
		.checkIfDescriptionPresent()
		.getDescription();


	}

}
