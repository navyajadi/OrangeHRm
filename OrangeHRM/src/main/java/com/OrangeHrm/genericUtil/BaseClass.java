package com.OrangeHrm.genericUtil;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import com.OrangeHrm.POMClasses.HomePageHrm;
import com.OrangeHrm.POMClasses.LoginPageHrm;

public class BaseClass {
	public WebDriver driver;
	public LoginPageHrm loginhrm;
	public static WebDriver sdriver;

	@BeforeSuite
	public void ConnectDataBase() {
		System.out.println("Connect with data base");
	}

	@BeforeClass
	public void LauchBrowser() throws IOException {
		//String Browser = System.getProperty("Browser");
		String Browser = FileUtil.ObjectFiletil().readDataFromPropFile("Browser");
		if (Browser.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		} else if (Browser.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		} else {
			driver = new ChromeDriver();
		}
		WebDriverUtility WebDriver = new WebDriverUtility(driver);
		WebDriver.maximizeWindow();
		WebDriver.pageloadWait();
		driver.get(FileUtil.ObjectFiletil().readDataFromPropFile("url"));
		 loginhrm = new LoginPageHrm(driver);
		 sdriver = driver;
	}

	@BeforeMethod
	public void LoginHrm() throws IOException {
		loginhrm.LoginOrgHrm();
	}

	@AfterMethod
	public void logOutfromAppp() throws InterruptedException {
		HomePageHrm LO = new HomePageHrm(driver);
		LO.logOutfromApp();
	}

	@AfterClass
	public void closeBrowser() {
		driver.close();
	}

	@AfterSuite
	public void disconnectedfromDB() {
		System.out.println("Disconnected");
	}

}
