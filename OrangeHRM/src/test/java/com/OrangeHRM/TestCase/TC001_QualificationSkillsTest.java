package com.OrangeHRM.TestCase;

import org.testng.annotations.Test;

import com.OrangeHrm.POMClasses.CreateSkills;
import com.OrangeHrm.POMClasses.HomePageHrm;
import com.OrangeHrm.genericUtil.BaseClass;
import com.OrangeHrm.genericUtil.JavaUtil;


public class TC001_QualificationSkillsTest extends BaseClass{
	@Test
	public void createQualificationSkillsTest() throws Throwable {
		HomePageHrm Hp = new HomePageHrm(driver);
		Hp.getAdmin().click();
		
		CreateSkills Cskills = new CreateSkills(driver);
		Thread.sleep(3000);
		Cskills.getQualifications().click();
		Cskills.getSkills().click();
		Cskills.getAddSkills().click();	
		String SkillsNames = JavaUtil.ObjforJavaUtil().getFirstName()+JavaUtil.ObjforJavaUtil().getRandomNumber();
		Cskills.getSkillsName().sendKeys(SkillsNames);
		Cskills.getSaveBtn().click();
		Hp.getLogoutImg().click();
		Hp.getSigout().click();
		
		
	}
	
}