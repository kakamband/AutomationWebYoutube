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

public class YoutubeHomePage {
	
	@FindBy(xpath="//ytd-button-renderer[contains(@class,'style-scope ytd-masthead style-suggestive')]//yt-formatted-string[@id='text']")
	private @Getter WebElement signInBtn;
	
	@FindBy(xpath="//input[@id='search']")
	private @Getter WebElement searchField;
	
	@FindBy(xpath="//yt-icon[contains(@class,'style-scope ytd-searchbox')]")
	private @Getter WebElement searchBtn;
	
	public YoutubeHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
