/**
 * @author RameshReddy.K
 * @gitHub https://github.com/UrsTrulyRamOfficial
 *
 **/
package com.qa.pages;

import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminPage {
	
	private WebDriver driver;

	// 1. By Locators: OR
	private By adminTab = By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][.='Admin']");
	private By addBtn = By.xpath("//div[@class='orangehrm-header-container']/button[@type='button']");
	private By userRoleDrop = By.xpath("//div/div[1]/div/div[2]/div[@class='oxd-select-wrapper']/div//i");
	private By employeeName = By.xpath("//input[@placeholder='Type for hints...']");
	private By statusDrop = By.xpath("//label[text()='Status']/../..//div[@class='oxd-select-text-input']");
	private By userName = By.xpath("//label[text()='Username']/../../div//input[@class='oxd-input oxd-input--active']");
	private By password = By.xpath("(//label[contains(text(),'Password')])[1]/../..//input[@class='oxd-input oxd-input--active']");
	private By confirmPassword = By.xpath("//label[contains(text(),'Confirm Password')]/../..//input[@class='oxd-input oxd-input--active']");
	private By saveBtn = By.xpath("//button[@type='submit']");
	private By userLogName = By.xpath("//p[@class='oxd-userdropdown-name']");
	
	
	// 2. Constructor of the page class:
	public AdminPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickOnAdminTab() {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(adminTab).click();
	}
	
	public void clickOnAddBtn() {
		driver.findElement(addBtn).click();
	}
	
	public void addUserRole(String userRole) {
		driver.findElement(userRoleDrop).click();
		driver.findElement(By.xpath("//*[contains(text(),'"+userRole+"')]")).click();
	}
		
	public void enterEmployeeName() throws InterruptedException {
		String empName = driver.findElement(userLogName).getText();
		driver.findElement(employeeName).sendKeys(empName);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains(text(),'"+empName+"')]")).click();
		Thread.sleep(1000);
	}
	    
	public void selectStatusDropdown(String status) {
		driver.findElement(statusDrop).click();
		driver.findElement(By.xpath("//*[contains(text(),'"+status+"')]")).click();
	}
		
	public void enterUserName() {
		String generatedString = RandomStringUtils.randomAlphanumeric(10);
		System.out.println("Random use name:"  + generatedString);
		driver.findElement(userName).sendKeys(generatedString);
	}
		
	public void enterPassAndConfirmPassword(String pwd, String cnfmPass) {
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(confirmPassword).sendKeys(cnfmPass);
	}
		
	public void clickOnSaveButton() {
		driver.findElement(saveBtn).click();
	}
	
	public AdminPage userManagement(String userRole, String empName, String status, String pwd, String cnfmPass) throws InterruptedException {
		clickOnAdminTab();
		clickOnAddBtn();
		addUserRole(userRole);
		enterEmployeeName();
		selectStatusDropdown(status);
		enterUserName();
		enterPassAndConfirmPassword(pwd, cnfmPass);
		clickOnSaveButton();
		return new AdminPage(driver);
	}
}
