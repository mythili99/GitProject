
package com.scf.configreader;

import java.util.Properties;

import org.apache.log4j.Level;

import com.scf.configuration.browser.BrowserType;
import com.scf.utility.ResourceHelper;

public class PropertyFileReader{

	private Properties prop = null;

	public PropertyFileReader() {
		prop = new Properties();
		try {
			prop.load(ResourceHelper.getResourcePathInputStream("/src/main/resources/configfile/config.properties"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getUserName() {
		return prop.getProperty("Username");
	}

	public String getPassword() {
		return prop.getProperty("Password");
	}

	public String getWebsite() {
		return prop.getProperty("Website");
	}

	public int getPageLoadTimeOut() {
		return Integer.parseInt(prop.getProperty("PageLoadTimeOut"));
	}

	public int getImplicitWait() {
		return Integer.parseInt(prop.getProperty("ImplcitWait"));
	}

	public int getExplicitWait() {
		return Integer.parseInt(prop.getProperty("ExplicitWait"));
	}

	public String getDbType() {
		return prop.getProperty("DataBase.Type");
	}

	public String getDbConnStr() {
		return prop.getProperty("DtaBase.ConnectionStr");
	}

	public BrowserType getBrowser() {
		return BrowserType.valueOf(prop.getProperty("Browser"));
	}

	
}
