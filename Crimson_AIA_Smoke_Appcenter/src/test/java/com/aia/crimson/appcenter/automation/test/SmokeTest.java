package com.aia.crimson.appcenter.automation.test;

import java.io.IOException;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aia.crimson.appcenter.automation.base.TestBase;
import com.aia.crimson.appcenter.automation.page.ContentPage;
import com.aia.crimson.appcenter.automation.page.GroupPage;
import com.aia.crimson.appcenter.automation.page.HomePage;
import com.aia.crimson.appcenter.automation.page.IntroPage;
import com.aia.crimson.appcenter.automation.page.LiveEventsPage;
import com.aia.crimson.appcenter.automation.page.LoginPage;
import com.aia.crimson.appcenter.automation.page.MomentsLogPage;
import com.aia.crimson.appcenter.automation.page.ProfilePage;
import com.aia.crimson.appcenter.automation.page.TalkToDoctorOrNursePage;
import com.aia.crimson.appcenter.automation.util.GenericFunctions;
//import com.mobileAutomation.SmokePage;

/**
 * This Class holds all the test cases, and executed in the order
 * 
 * @author Balaji
 *
 */


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SmokeTest extends TestBase{
	
	@Test()
	public void Test01_Verify_App_gets_launched() throws Exception {
		if (GenericFunctions.waitForPresence(driver, "Allow AIA Wellness to take pictures and record video?"))
		{
		Assert.assertTrue("Allow AIA Wellness to take pictures and record video?", GenericFunctions.waitForPresence(driver, "Allow AIA Wellness to take pictures and record video?")); 
	
		}
		else
		{
		Assert.assertTrue("Allow AIA Wellness to take pictures and record video?", GenericFunctions.waitForPresence(driver, "Allow AIA Wellness to take pictures and record video?")); 
		}
	}
	
	@Test()
	public void Test02_Verify_Intro_screens() throws IOException, InterruptedException {
		IntroPage iPage = new IntroPage(driver);
		
		//Android 9
		iPage.AllowBtn_Addtl();
		iPage.AllowBtn_Addtl();
		iPage.AllowBtn_Addtl();
			
		//Android 10
		if (GenericFunctions.waitForPresence(driver, "While using the app"))
		{
		iPage.ClickWhileUsingTheApp();
		iPage.ClickWhileUsingTheApp();
		iPage.ClickAllow();
		}
		
		if (GenericFunctions.waitForPresence(driver, "Skip"))
		{
		Assert.assertTrue("Skip", GenericFunctions.waitForPresence(driver, "Skip"));
		iPage.buttonSkip();
		}
		else
		{
		Assert.assertTrue("Skip", GenericFunctions.waitForPresence(driver, "Skip"));
	    }
	
	}

	@Test()
	public void Test03_Verify_email_login_is_Successful() throws InterruptedException {
		
				
		LoginPage lpage = new LoginPage(driver);
		lpage.Verify_emailLogin();
		
		if (GenericFunctions.waitForPresence(driver, "Live events"))
		{
		Assert.assertTrue("Live events", GenericFunctions.waitForPresence(driver, "Live events"));
	
		}
		else
		{
			Assert.assertTrue("Live events", GenericFunctions.waitForPresence(driver, "Live events"));
		}
		
	}	
	

	@Test()
	public void Test04_Verify_Home_Page_is_loaded() throws InterruptedException
	{
		HomePage HP=new HomePage(driver);
		HP.Verify_HomePage();
	    if (GenericFunctions.waitForPresence(driver, "Get care from our family wellness providers"))
		{
		Assert.assertTrue("Get care from our family wellness providers", GenericFunctions.waitForPresence(driver, "Get care from our family wellness providers"));
	
		}
		else
		{
		Assert.assertTrue("Get care from our family wellness providers", GenericFunctions.waitForPresence(driver, "Get care from our family wellness providers"));
			
		}
		
	}
	
	
	
	
	@Test()
	public void Test05_Verify_Group_Page_is_loaded() throws InterruptedException
	{
		GroupPage GP=new GroupPage(driver);
		GP.Verify_Group_Page();
		if (GenericFunctions.waitForPresence(driver, "Groups"))
		{
		Assert.assertTrue("Groups", GenericFunctions.waitForPresence(driver, "Groups"));
	
		}
		else
		{
			Assert.assertTrue("Groups", GenericFunctions.waitForPresence(driver, "Groups"));
			
		}
	    
	    if (GenericFunctions.waitForPresence(driver, "Discover new groups"))
		{
		Assert.assertTrue("Discover new groups", GenericFunctions.waitForPresence(driver, "Discover new groups"));
	
		}
		else
		{
			Assert.assertTrue("Discover new groups", GenericFunctions.waitForPresence(driver, "Discover new groups"));
			
		}
	  
	}
	

	@Test()
	public void Test06_Verify_Content_Page_is_loaded() throws InterruptedException
	{
		ContentPage CP=new ContentPage(driver);
		CP.Verify_Content_Page();
		if (GenericFunctions.waitForPresence(driver, "Specially curated for you and your family"))
		{
		Assert.assertTrue("Specially curated for you and your family", GenericFunctions.waitForPresence(driver, "Specially curated for you and your family"));
	
		}
		else
		{
			Assert.assertTrue("Specially curated for you and your family", GenericFunctions.waitForPresence(driver, "Specially curated for you and your family"));
			
		}
	    
	    
	}
	
	@Test()
	public void Test07_Verify_LiveEvents_Page_is_loaded() throws InterruptedException
	{
		LiveEventsPage LP=new LiveEventsPage(driver);
		HomePage HP=new HomePage(driver);
		HP.Verify_HomePage();
		if (GenericFunctions.waitForPresence(driver, "Get care from our family wellness providers"))
		{
		Assert.assertTrue("Get care from our family wellness providers", GenericFunctions.waitForPresence(driver, "Get care from our family wellness providers"));
	
		}
		else
		{
		Assert.assertTrue("Get care from our family wellness providers", GenericFunctions.waitForPresence(driver, "Get care from our family wellness providers"));
			
		}
		LP.Verify_LiveEvents_Page();
		  if (GenericFunctions.waitForPresence(driver, "Add more interests"))
			{
			Assert.assertTrue("Add more interests", GenericFunctions.waitForPresence(driver, "Add more interests"));
		
			}
			else
			{
				Assert.assertTrue("Add more interests", GenericFunctions.waitForPresence(driver, "Add more interests"));
				
			}
	}
	
	@Test()
	public void Test08_Verify_Profile_Page_is_loaded() throws InterruptedException
	{
		HomePage HP=new HomePage(driver);
		HP.Verify_HomePage();
		ProfilePage PP=new ProfilePage(driver);
		PP.Verify_Profile_Page();
		if (GenericFunctions.waitForPresence(driver, "ACCOUNT"))
		{
		Assert.assertTrue("Groups", GenericFunctions.waitForPresence(driver, "ACCOUNT"));
	
		}
		else
		{
			Assert.assertTrue("Groups", GenericFunctions.waitForPresence(driver, "ACCOUNT"));
			
		}
		
		if (GenericFunctions.waitForPresence(driver, "Manage profiles"))
		{
		Assert.assertTrue("Groups", GenericFunctions.waitForPresence(driver, "Manage profiles"));
	
		}
		else
		{
			Assert.assertTrue("Groups", GenericFunctions.waitForPresence(driver, "Manage profiles"));
			
		}
		
	}
	

	@Test()
	public void Test09_Verify_Moments_Log_Page_is_loaded() throws InterruptedException
	{
		HomePage HP=new HomePage(driver);
		HP.Verify_HomePage();
		MomentsLogPage MP=new MomentsLogPage(driver);
		MP.Verify_Moments_Log_Page();
		if (GenericFunctions.waitForPresence(driver, "Moments log"))
		{
		Assert.assertTrue("Moments log", GenericFunctions.waitForPresence(driver, "Moments log"));
	
		}
		else
		{
			Assert.assertTrue("Moments log", GenericFunctions.waitForPresence(driver, "Moments log"));
			
		}
		    
	}
	
	@Test()
	public void Test10_Verify_Talk_to_Doctor_or_Nurse_Page_is_loaded() throws InterruptedException
	{
		HomePage HP=new HomePage(driver);
		Thread.sleep(3000);
		HP.Verify_HomePage();
		Thread.sleep(1000);
		TalkToDoctorOrNursePage TDN=new TalkToDoctorOrNursePage(driver);
		TDN.Verify_Talk_to_Doctor_or_Nurse_Page();
		if (GenericFunctions.waitForPresence(driver, "Get advice from specialist doctors and nurses"))
		{
		Assert.assertTrue("Get advice from specialist doctors and nurses", GenericFunctions.waitForPresence(driver, "Get advice from specialist doctors and nurses"));
	
		}
		else
		{
			Assert.assertTrue("Get advice from specialist doctors and nurses", GenericFunctions.waitForPresence(driver, "Get advice from specialist doctors and nurses"));
			
		}
	}	

}
