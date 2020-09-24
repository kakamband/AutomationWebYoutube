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

public class YoutubeVideoPlayPage {
	
	@FindBy(xpath="//yt-formatted-string[@class='style-scope ytd-commentbox']//div[@class='style-scope yt-formatted-string']")
	private @Getter WebElement commentField;
	
	@FindBy(xpath="//ytd-button-renderer[@id='submit-button']//yt-formatted-string[@id='text']")
	private @Getter WebElement commentBtn;
	
	@FindBy(xpath=" (//yt-icon-button[@class='style-scope ytd-toggle-button-renderer style-text']//button[@id='button'])[1]")
	private @Getter WebElement likeBtn;
	
	public YoutubeVideoPlayPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
