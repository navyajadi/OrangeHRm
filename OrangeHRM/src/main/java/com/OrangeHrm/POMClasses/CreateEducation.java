package com.OrangeHrm.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateEducation {
	public WebDriver driver;
	
	@FindBy(xpath="//a[text()='Education']")
	private WebElement EducationClick;
	
	@FindBy(id="btnAdd")
	private WebElement AddBtn;
	
	@FindBy(id="education_name")
	private WebElement AddEduName;
	
	@FindBy(id="btnSave")
	private WebElement SaveBtn;

	public WebElement getEducationClick() {
		return EducationClick;
	}

	public WebElement getAddBtn() {
		return AddBtn;
	}

	public WebElement getAddEduName() {
		return AddEduName;
	}

	public WebElement getSaveBtn() {
		return SaveBtn;
	}
	
	public void CreateEducation(WebDriver driver) {
		this.driver=driver;
	}
	

}
