package com.test.pageLocator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


import com.test.util.Browserfactory;

public class MyAccountpageLocator extends Browserfactory {
	
	public MyAccountpageLocator(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
			
		}
	@FindBy(how=How.XPATH, using="/html/body/div[1]/div[2]/div[2]/span[3]/a/span[2]")
	public WebElement clickonMyAccountLink;
	
	@FindBy(how=How.NAME, using="email_address")
	public WebElement EmailAddress;
	
	@FindBy(how=How.NAME, using="password")
	public WebElement Password;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"tdb1\"]/span[2]")
	public WebElement clickonSigninButton;
	
public void setEmailAddress(String emailAddress ) {
	EmailAddress.sendKeys(emailAddress);
}

public void setPassword(String password ) {
	Password.sendKeys(password);
}

public void clickonSigninButton() {
	clickonSigninButton.click();
}

}


