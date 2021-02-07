package com.aia.crimson.appcenter.automation.page;

import org.openqa.selenium.By;
import com.aia.crimson.appcenter.automation.base.PropManager;
import com.aia.crimson.appcenter.automation.util.Constants;
import com.microsoft.appcenter.appium.EnhancedAndroidDriver;

import io.appium.java_client.MobileElement;

/**
 * 
 * @author Balaji
 *
 */
public class GroupPage  {

	By Groups=By.xpath("//android.widget.TextView[@text='Groups']");
	By NewGroups=By.xpath("//android.widget.TextView[@text='Discover new groups']");
	By GroupsMenu=By.xpath("//android.widget.TextView[@text='Groups']");
	
	private EnhancedAndroidDriver<MobileElement> driver;
	
	public GroupPage(EnhancedAndroidDriver<MobileElement> driver) {
		this.driver = driver;
	}
	
	public void Verify_Group_Page() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(GroupsMenu).click();
		
	}

}


