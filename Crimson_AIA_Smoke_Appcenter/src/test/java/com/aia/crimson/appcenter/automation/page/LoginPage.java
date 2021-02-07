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
public class LoginPage  {

	By buttonContinueWithEmail = By.xpath("//android.widget.TextView[@text='Continue with Email']");
	By inputEmailID = By.xpath("//android.widget.EditText[@index='0']");
	By buttonContinue = By.xpath("//android.widget.TextView[@text='Continue']");
	By inputPassword = By.xpath("//android.widget.EditText[@index='0']");
	By buttonLogin = By.xpath("//android.widget.TextView[@text='Log in']");
	
	private EnhancedAndroidDriver<MobileElement> driver;
	
	public LoginPage(EnhancedAndroidDriver<MobileElement> driver) {
		this.driver = driver;
	}
	
	public void Verify_emailLogin() throws InterruptedException
	{
		driver.findElement(buttonContinueWithEmail).click();
		
		driver.findElement(inputEmailID).sendKeys(Constants.EmailUser);
		driver.findElement(buttonContinue).click();
		Thread.sleep(5000);
		
		driver.findElement(inputPassword).sendKeys(Constants.EmailPassword);
		driver.findElement(buttonLogin).click();
	}

}


