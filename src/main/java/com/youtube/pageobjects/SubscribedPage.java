/*
 * @author Neelesh Goyal
 * 
 */

package com.youtube.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

public class SubscribedPage {
	@FindBy(xpath="//yt-formatted-string[@id='channel-user-state']/ancestor::div//yt-img-shadow[@class='style-scope ytd-channel-renderer no-transition']//img[@class='style-scope yt-img-shadow']")
	private @Getter WebElement Userimage;
	
	public SubscribedPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
