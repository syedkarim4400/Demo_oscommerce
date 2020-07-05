package com.test.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browserfactory{
    public static WebDriver driver;
	public static Properties prop;
	
	
	public static WebElement element;
	
	public Browserfactory() {
	try {
		prop = new Properties();
		FileInputStream ip = new FileInputStream(
				System.getProperty("user.dir") + "//src//test//java//com//test//config//config.properties");

		prop.load(ip);
		}catch (FileNotFoundException e){
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void initialization() {
		//String browserName = prop.getProperty("browser");
		
	}
	public static WebDriver startBrowser(String browserName, String URL) {
		if (browserName.equals("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver","\\C:\\chromedriver_win32\\chromedriver.exe\\");
			driver= new ChromeDriver();
		}
		else if (browserName.equalsIgnoreCase("firefox")) 
		{
			System.setProperty("webdriver.Geco.driver", "path of the driver");
			driver= new FirefoxDriver();
		}
		else if (browserName.equalsIgnoreCase("internetexplorer"))
		{
			System.setProperty("webdriver.internetexplorer.driver","path of the driver");
			driver= new InternetExplorerDriver();
			
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(URL);
		return driver;
			
	}
	public static void getDriver(String URL) {
		prop.getProperty("URL");
		//driver.get(prop.getProperty("URL"));
		System.out.println(prop.getProperty("URL"));
		//System.out.println(driver.get(prop.getProperty("URL")));
	}
	
}