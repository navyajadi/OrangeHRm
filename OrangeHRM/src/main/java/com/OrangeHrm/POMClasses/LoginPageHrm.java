package com.OrangeHrm.POMClasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OrangeHrm.genericUtil.FileUtil;

public class LoginPageHrm {
	WebDriver driver;
	
	@FindBy(name="txtUsername")
	private WebElement username;
	
	@FindBy(id="txtPassword")
	private WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement Login;

	public WebElement getUsername() {
		return username;
		
	}
	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return Login;
	}

	public LoginPageHrm (WebDriver driver) {
		this.driver=driver;
       PageFactory.initElements(driver, this);
	}
	
	public void LoginOrgHrm() throws IOException {
		username.sendKeys(FileUtil.ObjectFiletil().readDataFromPropFile("username"));
		password.sendKeys(FileUtil.ObjectFiletil().readDataFromPropFile("password"));
		Login.click();
		
	}

}
