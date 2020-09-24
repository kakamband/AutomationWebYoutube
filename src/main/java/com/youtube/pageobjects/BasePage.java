/*
 * @author Neelesh Goyal
 * 
 * @Description : In this class i have store common web elements.
 * 
 */

package com.youtube.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import lombok.Getter;

public abstract class BasePage {
	@FindBy(xpath="//div[@class='VfPpkd-RLmnJb']")
	private @Getter WebElement nxtBtn;
	
	public BasePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
