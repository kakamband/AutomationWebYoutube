/*
 * @author Neelesh Goyal
 * 
 */
package com.youtube.scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.youtube.feactures.SignInYoutubeFeacture;
import com.youtube.feactures.SubscribeFeacture;
import com.youtube.generic.BaseLib;
import com.youtube.generic.ExcelUtilities;

public class SubscribeScript extends BaseLib{
	
	@Test (priority=1)
	public void subscribeFirstUser() {
		ExcelUtilities eu=new ExcelUtilities("./TestData/testdata.xlsx");
		String emailId=eu.readData("sheet1", 1, 1);
		String emailPassword=eu.readData("sheet1", 1, 2);
		SignInYoutubeFeacture siyf=new SignInYoutubeFeacture(driver);
		siyf.SignInYoutube(emailId, emailPassword);
		String subscriberName=eu.readData("sheet1", 2, 1);
		SubscribeFeacture sf=new SubscribeFeacture(driver);
		sf.subscribe(subscriberName);
		Reporter.log("First user successfully subscribed", true);
	}
	
	@Test(priority=2)
	public void subscriberSecondUser() {
		ExcelUtilities eu=new ExcelUtilities("./TestData/testdata.xlsx");
		String emailId=eu.readData("sheet1", 1, 1);
		String emailPassword=eu.readData("sheet1", 1, 2);
		SignInYoutubeFeacture siyf=new SignInYoutubeFeacture(driver);
		siyf.SignInYoutube(emailId, emailPassword);
		String subscriberName=eu.readData("sheet1", 2, 2);
		SubscribeFeacture sf=new SubscribeFeacture(driver);
		sf.subscribe(subscriberName);
		Reporter.log("Second user successfully subscribed", true);
	}
	
	@Test(priority=3)
	public void subscriberThirdUser() {
		ExcelUtilities eu=new ExcelUtilities("./TestData/testdata.xlsx");
		String emailId=eu.readData("sheet1", 1, 1);
		String emailPassword=eu.readData("sheet1", 1, 2);
		SignInYoutubeFeacture siyf=new SignInYoutubeFeacture(driver);
		siyf.SignInYoutube(emailId, emailPassword);
		String subscriberName=eu.readData("sheet1", 2, 3);
		SubscribeFeacture sf=new SubscribeFeacture(driver);
		sf.subscribe(subscriberName);
		Reporter.log("Third user successfully subscribed", true);
	}
	
	@Test(priority=4)
	public void subscriberFourthUser() {
		ExcelUtilities eu=new ExcelUtilities("./TestData/testdata.xlsx");
		String emailId=eu.readData("sheet1", 1, 1);
		String emailPassword=eu.readData("sheet1", 1, 2);
		SignInYoutubeFeacture siyf=new SignInYoutubeFeacture(driver);
		siyf.SignInYoutube(emailId, emailPassword);
		String subscriberName=eu.readData("sheet1", 2, 4);
		SubscribeFeacture sf=new SubscribeFeacture(driver);
		sf.subscribe(subscriberName);
		Reporter.log("Fourth user successfully subscribed", true);
	}
	
	@Test(priority=5)
	public void subscriberFifthhUser() {
		ExcelUtilities eu=new ExcelUtilities("./TestData/testdata.xlsx");
		String emailId=eu.readData("sheet1", 1, 1);
		String emailPassword=eu.readData("sheet1", 1, 2);
		SignInYoutubeFeacture siyf=new SignInYoutubeFeacture(driver);
		siyf.SignInYoutube(emailId, emailPassword);
		String subscriberName=eu.readData("sheet1", 2, 5);
		SubscribeFeacture sf=new SubscribeFeacture(driver);
		sf.subscribe(subscriberName);
		Reporter.log("Fifth user successfully subscribed", true);
	}
}

