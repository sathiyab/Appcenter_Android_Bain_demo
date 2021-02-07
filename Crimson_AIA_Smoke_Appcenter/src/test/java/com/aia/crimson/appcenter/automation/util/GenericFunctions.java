package com.aia.crimson.appcenter.automation.util;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.microsoft.appcenter.appium.EnhancedAndroidDriver;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class GenericFunctions {

	public static MobileElement mobileElement;

	public static boolean waitForPresence(EnhancedAndroidDriver<MobileElement> driver, By targetElementLocator) {

		boolean isElementPresent;
		try {
			mobileElement = driver.findElement(targetElementLocator);
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.visibilityOf(mobileElement));
			isElementPresent = mobileElement.isDisplayed();
			return isElementPresent;
		} catch (Exception e) {
			isElementPresent = false;
			System.out.println(e.getMessage());
			return isElementPresent;
		}

	}
	
	public static boolean waitForPresence(EnhancedAndroidDriver<MobileElement> driver, String text) {

		boolean isElementPresent;
		try {
			MobileElement mobileElement=driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()" + ".scrollable(true)).scrollIntoView("
					+ "new UiSelector().text(\""+text+"\"));"));
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.visibilityOf(mobileElement));
			isElementPresent = mobileElement.isDisplayed();
			return isElementPresent;
		} catch (Exception e) {
			isElementPresent = false;
			System.out.println(e.getMessage());
			return isElementPresent;
		}

	}	
}
