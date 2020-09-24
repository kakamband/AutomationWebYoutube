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

public class SignInGooglePage extends BasePage {
	@FindBy(xpath="//input[@name='identifier']")
	private @Getter WebElement emailOrPhoneTextField;
	
	
	
	public SignInGooglePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
}
