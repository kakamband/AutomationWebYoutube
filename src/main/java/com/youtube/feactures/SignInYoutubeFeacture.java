/*
 * 
 * @author Neelesh Goyal
 */
package com.youtube.feactures;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;

import com.youtube.pageobjects.SignInGooglePage;
import com.youtube.pageobjects.SignInGooglePasswordPage;
import com.youtube.pageobjects.YoutubeHomePage;

public class SignInYoutubeFeacture {
	WebDriver driver;
	YoutubeHomePage yhp;
	SignInGooglePage sigp;
	SignInGooglePasswordPage sigpp;
	
	
	public SignInYoutubeFeacture(WebDriver driver) {
		this.driver=driver;
		yhp=new YoutubeHomePage(driver);
		sigp=new SignInGooglePage(driver);
		sigpp=new SignInGooglePasswordPage(driver);
	}
	
	public void SignInYoutube(String emailId, String emailPassword) {
		yhp.getSignInBtn().click();
		try {
			sigp.getEmailOrPhoneTextField().sendKeys(emailId);
			sigp.getNxtBtn().click();
			sigpp.getPswrdTxtField().sendKeys(emailPassword);
			JavascriptExecutor je=(JavascriptExecutor)driver;
			je.executeScript("arguments[0].click();", sigp.getNxtBtn());
			
		}
		
		catch(StaleElementReferenceException e) {
			sigp.getEmailOrPhoneTextField().sendKeys(emailId);
			sigp.getNxtBtn().click();
			sigpp.getPswrdTxtField().sendKeys(emailPassword);	
			JavascriptExecutor je=(JavascriptExecutor)driver;
			je.executeScript("arguments[0].click();", sigp.getNxtBtn());
		}
		
	}
	
}
