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

public class SubscribeUserNamePage {
	@FindBy(xpath="(//paper-tab[@class='style-scope ytd-c4-tabbed-header-renderer'])[1]")
	private @Getter WebElement videosBtn;

	@FindBy(xpath="(//a[@id='video-title'])[1]")
	private @Getter WebElement firstChanelClick;
	
	public SubscribeUserNamePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
