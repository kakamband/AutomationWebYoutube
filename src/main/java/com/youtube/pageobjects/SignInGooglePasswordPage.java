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

public class SignInGooglePasswordPage {
	@FindBy(xpath="//input[@name='password']")
	private @Getter WebElement pswrdTxtField;
	
	public SignInGooglePasswordPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
