
package com.scf.configuration.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.scf.utility.ResourceHelper;

public class ChromeBrowser {

	public ChromeOptions getChromeCapabilities() {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("start-maximized");
		return option;
	}

	public WebDriver getChromeDriver(ChromeOptions option) {
		if (System.getProperty("os.name").contains("Mac")){
			System.setProperty("webdriver.chrome.driver", ResourceHelper.getResourcePath("/src/main/resources/drivers/chromedriver"));
			return new ChromeDriver();
		}
		else if(System.getProperty("os.name").contains("Window")){
			System.setProperty("webdriver.chrome.driver", ResourceHelper.getResourcePath("/src/main/resources/drivers/chromedriver.exe"));
			return new ChromeDriver(option);
		}
		return null;
	}
}
