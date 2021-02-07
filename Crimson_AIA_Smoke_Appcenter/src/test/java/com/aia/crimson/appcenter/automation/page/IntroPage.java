package com.aia.crimson.appcenter.automation.page;

import org.openqa.selenium.By;

import com.microsoft.appcenter.appium.EnhancedAndroidDriver;

import io.appium.java_client.MobileElement;

/**
 * 
 * @author Balaji
 *
 */
public class IntroPage {
	
	By WhileUsingTheApp = By.xpath("//android.widget.Button[@text='While using the app']");
	By AllowBtn = By.xpath("//android.widget.Button[@text='Allow']");
	By buttonSkip = By.xpath("//android.widget.TextView[@text='Skip']");
	//By AllowBtn_Addtl = By.xpath("//android.widget.Button[@text='ALLOW']");
	By AllowBtn_Addtl = By.xpath("//android.widget.Button[@index='1']");
	
			
			
	private EnhancedAndroidDriver<MobileElement> driver;
	
	public IntroPage(EnhancedAndroidDriver<MobileElement> driver) {
		this.driver = driver;
	}	
	
	public void ClickWhileUsingTheApp()
	{
		driver.findElement(WhileUsingTheApp).click();
	}
	
	public void buttonSkip()
	{
		driver.findElement(buttonSkip).click();
	}
	
	public void ClickAllow()
	{
		driver.findElement(AllowBtn).click();		
	}	
	
	public void AllowBtn_Addtl()
	{
		driver.findElement(AllowBtn_Addtl).click();		
	}
}


