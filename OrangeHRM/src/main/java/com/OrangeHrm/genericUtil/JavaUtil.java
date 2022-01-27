package com.OrangeHrm.genericUtil;

import java.util.Random;

import com.github.javafaker.Faker;

public class JavaUtil {
	
	public JavaUtil() {

	}
   public static JavaUtil ObjforJavaUtil() {
	   JavaUtil ju = new JavaUtil();
	   return ju;
	   
   }
   
   public int getRandomNumber() {
	   Random random = new Random();
	   return random.nextInt(1000);
   }
   public String getFirstName() {
		Faker faker = new Faker();
		return faker.name().firstName();
	}
   public String getFullName() {
		Faker faker = new Faker();
		return faker.name().fullName();
	}
	
}
