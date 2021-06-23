package com.ecom.webapp.amazon;



import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonHomePageTest {
	

	final String siteURL = "http://www.amazon.com/";

	final String driverPath="/Users/Shared/Previously Relocated Items/Security/CalTech/Phase5/Selenium-junit-test/driver/chromedriver";
	WebDriver driver;

	

	@BeforeEach
	void setUp() {
		System.setProperty("webdriver.chrome.driver", driverPath);

		driver = new ChromeDriver();
		
	
		driver.get(siteURL);
	}
	
	@Test
	
void testAmazonHomePage() {
		String expectedTitle = "Amazon.com. Spend less. Smile more.";
		String actualTitle = driver.getTitle();
		assertEquals(expectedTitle, actualTitle);
		if(expectedTitle.contentEquals(driver.getTitle())) {
			System.out.println("---Test is Passed---");
		}else {
			System.out.println("---Test is Failed!---");
			
		}
		
	}
	@Test
	void testSourceURL() {
		assertEquals(siteURL, driver.getCurrentUrl());
	}
	
//	@Test
//	
//	@DisplayName("Amazon Test : "Mobile link verification")
//	void testMobileLinkNavigation(){
////		findMobile LInk
//		WebElement mobileLink = driver.findElement(By.\cssSelector(""#nav-xshop > a:nth-child(3)"));"
//				//test web element exist
//				assertTrue(mobileLink.isDisplayed());
//				assertTrue(mobileLink.isEnabled());
////				click
//				mobileLink.click();
//				String expected = "Mobile Phones: Buy New Mobiles Online at Best Prices in India";
//				assertEquals(expected, driver.getTitle());
//	}
	@AfterEach
	void cleanUp() {
		
		driver.close();
	}
}
