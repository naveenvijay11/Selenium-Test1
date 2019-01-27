package com.app.tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.app.pages.BasePage;
import com.app.pages.HomePageObjects;


public class HomePageTest {

	HomePageObjects hp;
	BasePage bp;

	public HomePageTest() {
		hp = new HomePageObjects();
		bp = new BasePage();
	}
	
	@Test
	public void verifyWomenTab() {
			Assert.assertTrue(hp.getWomenTabbutton().isDisplayed());
	}
	
	@Test
	public void verifyDressesTab() {
		Assert.assertTrue(hp.getDressesTabbutton().isDisplayed());
	}
	
	@Test
	public void verifyShirtsTab() {
		Assert.assertTrue(hp.getShirtsTabbutton().isDisplayed());
	}
	
	@Test
	public void womennexttab() {
		assertequals(hp.clickonwomentab().contains("Women"));
	}
	
	
}


