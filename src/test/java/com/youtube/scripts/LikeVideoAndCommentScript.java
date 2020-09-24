/*
 * @author Neelesh Goyal
 * 
 */
package com.youtube.scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.youtube.feactures.LikeVideoAndCommentFeacture;
import com.youtube.feactures.SignInYoutubeFeacture;
import com.youtube.generic.BaseLib;
import com.youtube.generic.ExcelUtilities;

public class LikeVideoAndCommentScript extends BaseLib{
	
	@Test
	public void likeVideoAndComment() throws InterruptedException {
		ExcelUtilities eu=new ExcelUtilities("./TestData/testdata.xlsx");
		String emailId=eu.readData("sheet1", 1, 1);
		String emailPassword=eu.readData("sheet1", 1, 2);
		SignInYoutubeFeacture siyf=new SignInYoutubeFeacture(driver);
		siyf.SignInYoutube(emailId, emailPassword);
		LikeVideoAndCommentFeacture lvacf=new LikeVideoAndCommentFeacture(driver);
		String subscribedChannelName=eu.readData("sheet1", 2, 1);
		String commentText=eu.readData("sheet1", 3, 1);
		lvacf.likeAndCommentVideo(subscribedChannelName, commentText);
		Reporter.log("Video Like and Comment Successfully", true);
	}
}
