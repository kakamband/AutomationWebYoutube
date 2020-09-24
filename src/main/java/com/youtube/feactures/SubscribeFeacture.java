/*
 * @author Neelesh Goyal
 * 
 */
package com.youtube.feactures;

import org.openqa.selenium.WebDriver;

import com.youtube.pageobjects.SearchSubscribePage;
import com.youtube.pageobjects.YoutubeHomePage;

public class SubscribeFeacture {
	WebDriver driver;
	YoutubeHomePage yhp;
	SearchSubscribePage ssp;
	
	public SubscribeFeacture(WebDriver driver) {
		this.driver=driver;
		yhp=new YoutubeHomePage(driver);
		ssp=new SearchSubscribePage(driver);
	}
	
	public void subscribe(String subscriberName) {
		yhp.getSearchField().sendKeys(subscriberName);
		yhp.getSearchBtn().click();
		ssp.getSubscribeBtn().click();
		driver.navigate().back();
		yhp.getSearchField().clear();
	}
}
