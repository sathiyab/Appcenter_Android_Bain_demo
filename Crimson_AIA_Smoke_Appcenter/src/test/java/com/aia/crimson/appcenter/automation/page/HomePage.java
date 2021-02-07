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
public class HomePage  {

	By ForYouMenu=By.xpath("//android.widget.TextView[@text='For you']");
	By homeTextMenu=By.xpath("//android.widget.TextView[@text='Get care from our family wellness providers']");
	
	private EnhancedAndroidDriver<MobileElement> driver;
	
	public HomePage(EnhancedAndroidDriver<MobileElement> driver) {
		this.driver = driver;
	}
	
	public void Verify_HomePage() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(ForYouMenu).click();
		
	}

}


