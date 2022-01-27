package com.OrangeHrm.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.OrangeHrm.genericUtil.WebDriverUtility;

public class HomePageHrm {
	WebDriver driver;
	@FindBy(xpath = "//b[text()='Admin']")
	private WebElement Admin;

	@FindBy(xpath = "//a[text()='Qualifications']")
	private WebElement Qualifications;

	@FindBy(xpath = "//a[text()='Skills']")
	private WebElement Skills;

	@FindBy(id = "welcome")
	private WebElement LogoutImg;

	@FindBy(xpath = "//a[text()='Logout']")
	private WebElement Signout;

	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getAdmin() {
		return Admin;
	}

	public WebElement getQualifications() {
		return Qualifications;
	}

	public WebElement getSkills() {
		return Skills;
	}

	public WebElement getLogoutImg() {
		return LogoutImg;
	}

	public WebElement getSigout() {
		return Signout;
	}

	public HomePageHrm(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void logOutfromApp() throws InterruptedException {
		WebDriverUtility WebUtil = new WebDriverUtility(driver);
		WebUtil.mouseHover(LogoutImg);
		Thread.sleep(3000);
		Signout.click();
	}

}
