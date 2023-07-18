package com.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;

	// 1. By Locators: OR
	private By userName = By.xpath("//div[@class='orangehrm-login-slot-wrapper']//div[1]/div//input[@name='username']");
	private By password = By.xpath("//div//input[@name='password']");
	private By signInButton = By.xpath("//button[@type='submit']");
	private By forgotPwdLink = By.xpath("//p[.='Forgot your password? ']");
	private By layoutEnter = By.xpath("//div[@id='app']/div[@class='oxd-layout']//div[@class='oxd-layout-context']");
	
	// 2. Constructor of the page class:
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// 3. page actions: features(behavior) of the page the form of methods:
	public String getLoginPageTitle() {
		return driver.getTitle();
	}

	public boolean isForgotPwdLinkExist() {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		return driver.findElement(forgotPwdLink).isDisplayed();
	}

	public void enterUserName(String username) {
		driver.findElement(userName).sendKeys(username);
	}

	public void enterPassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}

	public void clickOnLogin() {
		driver.findElement(signInButton).click();
	}

	public void clickOnEnter() {
		driver.findElement(layoutEnter).sendKeys(Keys.chord(Keys.ENTER));
	}
	
	public LoginPage doLogin(String user, String pass) {
		System.out.println("login with: " + user + " and " + pass);
		enterUserName(user);
		enterPassword(pass);
		clickOnLogin();
		clickOnEnter();
		return new LoginPage(driver);
	}
}
