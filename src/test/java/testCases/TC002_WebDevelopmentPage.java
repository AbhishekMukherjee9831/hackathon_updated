package testCases;

import java.io.IOException;
import java.util.ArrayList;

import org.testng.annotations.Test;

import pageObjects.WebDevelopmentPage;
import utilityFiles.ScreenShots;

public class TC002_WebDevelopmentPage extends TC001_SearchHomePage {
	
	
	@Test(priority = 2,groups= {"regression","Master"})
	public void levelSelector() throws InterruptedException {
		wp = new WebDevelopmentPage(driver);

		wp.selectLevel();
		logger.info("---//Level Selected//---");
	}
	
	@Test(priority = 3,groups= {"regression","Master"})
	public void languageSelect() throws InterruptedException {
		wp = new WebDevelopmentPage(driver);
		Thread.sleep(4000);
		wp.selectLanguage();
		Thread.sleep(2000);
		logger.info("---//Language Selected//---");
	}
	
	WebDevelopmentPage wp = null;
	
	@Test(priority =4,groups= {"Smoke","Master"})
	public void Result() throws InterruptedException {
		wp = new WebDevelopmentPage(driver);
		Thread.sleep(2000);
		wp.searchResult();
	}
	
	@Test(priority = 6,groups= {"regression","Master"})
	public void deatilsFirstCard() throws InterruptedException, IOException, ArrayIndexOutOfBoundsException {
		ScreenShots ss = new ScreenShots(driver);
		wp = new WebDevelopmentPage(driver);
		wp.FirstNameRatingTime();
		wp.SecondNameRatingTime();
		ss.screenshot("Courses");
//		wp.FirstCardsPage();
	}
	
	
	
	@Test(priority = 7,groups= {"Smoke","Master"})
	public void Headings() throws InterruptedException {
		wp = new WebDevelopmentPage(driver);

		wp.clickLogo();
	}
	

	


}
