package com.ecom.webapp.amazon;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonNavLinkTest {
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
	@DisplayName("Amazon Test : Fashion link verification")
	
	void testFashionLinkNavigation() {
//		find fashion link
		WebElement fashionLink = driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(8)"));
		//test web element exist
		assertTrue(fashionLink.isDisplayed());
		assertTrue(fashionLink.isEnabled());
		//click
		
		fashionLink.click();
		String expected = "Amazon Fashion - Amazon.com";
		assertEquals(expected, driver.getTitle());
	}
	
	@Test
	@DisplayName("Amazon Test : Books link verification")
	
	void testBooksLinkNavigation(){
		//find books
		WebElement booksLink = driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(7)"));
		//test web element exist
		assertTrue(booksLink.isDisplayed());
		assertTrue(booksLink.isEnabled());
		//click
		booksLink.click();
		String expected = "Amazon.com: Books";
		assertEquals(expected, driver.getTitle());
	
	}
	
	@Test
	@DisplayName("Amazon Test : Pharmacy link verification")
	
	void testPharmacyLinkNavigation(){
		//find books
		WebElement pharmacyLink = driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(6)"));
		//test web element exist
		assertTrue(pharmacyLink.isDisplayed());
		assertTrue(pharmacyLink.isEnabled());
		//click
		pharmacyLink.click();
		String expected = "Amazon.com: Pharmacy";
		assertEquals(expected, driver.getTitle());
	
	}
	@AfterEach
	void cleanUp() {
		
		driver.close();
	}

}
