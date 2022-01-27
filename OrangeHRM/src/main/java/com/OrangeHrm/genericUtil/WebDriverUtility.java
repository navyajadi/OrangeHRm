package com.OrangeHrm.genericUtil;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtility {
	public WebDriver driver;

	public WebDriverUtility(WebDriver driver) {
		this.driver = driver;
	}

	public void maximizeWindow() {
		driver.manage().window().maximize();

	}

	public void refresh() {
		driver.navigate().refresh();
	}

	public void pageloadWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	public void selectFromDropdown(WebElement element, String value) {
		Select sel = new Select(element);
		sel.selectByValue(value);
	}

	public void selectFromDropdown(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}

	public void selectFromDropdown(String text, WebElement element) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}

	public void mouseHover(WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).build().perform();
	}

	public void rightClick(WebElement element) {
		Actions actions = new Actions(driver);
		actions.contextClick();
	}

	public void switchToWindow(int index) {
		driver.switchTo().frame(index);
	}

	public void switchToWindowByID(int id) {
		driver.switchTo().frame(id);
	}

	public void switchToWindow(String name) {
		driver.switchTo().frame(name);
	}

	public void acceptAlertPopups() {
		driver.switchTo().alert().accept();
	}

	public void dismissAlertPopups() {
		driver.switchTo().alert().dismiss();
	}

	public void sendKeys(WebElement element, String keysToSend) {
		element.sendKeys(keysToSend);
	}

	public void scrollToElement(WebElement element) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView();", element);
	}

	public void scrollByPosition(int x, int y) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(" + x + "," + y + ")");
	}

	public void switchWindowHandle(String title) {
		Set<String> allwndws = driver.getWindowHandles();
		for (String id : allwndws) {
			String currenttitle = driver.switchTo().window(id).getTitle();
			System.out.println(currenttitle);
			if (currenttitle.contains(title)) {
				break;
			}
		}
	}

}
