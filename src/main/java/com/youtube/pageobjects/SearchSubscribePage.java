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

public class SearchSubscribePage {
	@FindBy(xpath="//yt-formatted-string[@class='style-scope ytd-subscribe-button-renderer']")
	private @Getter WebElement subscribeBtn;
	
	public SearchSubscribePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
