package com.OrangeHrm.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OrangeHrm.genericUtil.WebDriverUtility;

public class CreateSkills {
	WebDriver driver;

	@FindBy(xpath = "//a[text()='Qualifications']")
	private WebElement Qualifications;

	@FindBy(xpath = "//a[text()='Skills']")
	private WebElement Skills;

	@FindBy(id = "btnAdd")
	private WebElement AddSkills;

	@FindBy(id = "skill_name")
	private WebElement SkillsName;

	@FindBy(id = "btnSave")
	private WebElement SaveBtn;

	public WebElement getQualifications() {
		return Qualifications;
	}

	public WebElement getSkills() {
		return Skills;
	}

	public WebElement getAddSkills() {
		return AddSkills;
	}

	public WebElement getSkillsName() {
		return SkillsName;
	}

	public WebElement getSaveBtn() {
		return SaveBtn;
	}

	public CreateSkills(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	public void CreateSkillsPage(String Skills, String SkillsNames) throws Throwable {
		WebDriverUtility Webutil = new WebDriverUtility(driver);
		Webutil.mouseHover(Qualifications);
		Thread.sleep(2000);
		Webutil.selectFromDropdown(Skills, AddSkills);
		
		SaveBtn.click();

	}

}
