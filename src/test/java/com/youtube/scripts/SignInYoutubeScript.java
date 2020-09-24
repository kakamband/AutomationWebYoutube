/*
 * @author Neelesh Goyal
 * 
 */
package com.youtube.scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.youtube.feactures.SignInYoutubeFeacture;
import com.youtube.generic.BaseLib;
import com.youtube.generic.ExcelUtilities;

public class SignInYoutubeScript extends BaseLib {
	
	@Test
	public void SignInYoutube() {
		ExcelUtilities eu=new ExcelUtilities("./TestData/testdata.xlsx");
		String emailId=eu.readData("sheet1", 1, 1);
		String emailPassword=eu.readData("sheet1", 1, 2);
		SignInYoutubeFeacture siyf=new SignInYoutubeFeacture(driver);
		siyf.SignInYoutube(emailId, emailPassword);
		Reporter.log("Sign in successfully", true);
	}
}
