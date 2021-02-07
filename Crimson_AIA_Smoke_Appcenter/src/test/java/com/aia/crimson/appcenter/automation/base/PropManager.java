package com.aia.crimson.appcenter.automation.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * Loads Property File
 * @author Balaji
 *
 */
public class PropManager {
	
	private static PropManager propManager = null;
	private static Properties prop;
	
	private PropManager() {
	}
	
	public PropManager getInstance() {
		if (propManager == null) {
			propManager = new PropManager();
			setProps();
			return propManager;
		}else {
			return propManager;
		}
	}

	private void setProps() {
		prop = new Properties();
		FileInputStream fs;
		try {
			fs = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/project.properties");
			prop.load(fs);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static Properties getProp() {
		return prop;
	}
	
	public static String getPropVal(String propName) {
		return prop.getProperty(propName);
	}
	
}
	
	


