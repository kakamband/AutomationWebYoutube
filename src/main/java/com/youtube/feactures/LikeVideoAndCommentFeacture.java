/*
 * @author Neelesh Goyal
 * 
 */
package com.youtube.feactures;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import com.youtube.pageobjects.SubscribeUserNamePage;
import com.youtube.pageobjects.SubscribedPage;
import com.youtube.pageobjects.YoutubeHomePage;
import com.youtube.pageobjects.YoutubeVideoPlayPage;

public class LikeVideoAndCommentFeacture {
	WebDriver driver;
	YoutubeHomePage yhp;
	SubscribedPage sp;
	SubscribeUserNamePage sunp;
	YoutubeVideoPlayPage yvpp;
	
	public LikeVideoAndCommentFeacture(WebDriver driver) {
			this.driver=driver;
			yhp=new YoutubeHomePage(driver);
			sp=new SubscribedPage(driver);
			sunp=new SubscribeUserNamePage(driver); 
			yvpp=new YoutubeVideoPlayPage(driver);
	}
	
	public void likeAndCommentVideo(String subscribedChannelName, String commentText) throws InterruptedException {
		yhp.getSearchField().sendKeys(subscribedChannelName);
		yhp.getSearchBtn().click();
		sp.getUserimage().click();
		sunp.getVideosBtn().click();
		//Thread.sleep(5000);
		JavascriptExecutor je=(JavascriptExecutor)driver;
		je.executeScript("arguments[0].click();", sunp.getFirstChanelClick());
		//System.out.println("hi");
		yvpp.getLikeBtn().click();
		Thread.sleep(5000);
		JavascriptExecutor je1=(JavascriptExecutor)driver;
		je.executeScript("window.scrollBy(0,400)","");
		//Thread.sleep(5000);
		/*yvpp.getCommentField().click();
		yvpp.getCommentField().sendKeys(commentText);
		System.out.println("comment added");
		JavascriptExecutor je2=(JavascriptExecutor)driver;
		je.executeScript("arguments[0]", yvpp.getCommentBtn());
		yvpp.getCommentBtn().click();*/
		
	}
}
