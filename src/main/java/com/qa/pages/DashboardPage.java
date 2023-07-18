package com.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {

	private WebDriver driver;

	// 1. By Locators: OR
	private By dashboard = By.xpath("//span[.='Dashboard']");
	private By timeAtWork = By.xpath("//p[.='Time at Work']");
	private By myActions = By.xpath("//p[.='My Actions']");
	private By quickLaunch = By.xpath("//p[.='Quick Launch']");
	private By buzzLatestPosts = By.xpath("//p[.='Buzz Latest Posts']");
	private By employeesOnLeave = By.xpath("//p[.='Employees on Leave Today']");
	private By employeeDistributionByUnit = By.xpath("//p[.='Employee Distribution by Sub Unit']");
	private By employeeDistributionByLocation = By.xpath("//p[.='Employee Distribution by Location']");
	
	// 2. Constructor of the page class:
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickOnDashboard() {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(dashboard).click();
	}
	
	public boolean isTimeAtWorkWidgetExist() {
		return driver.findElement(timeAtWork).isDisplayed();
	}
	
	public boolean isMyActionsWidgetExist() {
		return driver.findElement(myActions).isDisplayed();
	}
	
	public boolean isQuickLaunchWidgetExist() {
		return driver.findElement(quickLaunch).isDisplayed();
	}
	
	public boolean isBuzzLatestPhotosWidgetExist() {
		return driver.findElement(buzzLatestPosts).isDisplayed();
		
	}
	
	public boolean isEmployeesOnLeaveWidgetExist() {
		return driver.findElement(employeesOnLeave).isDisplayed();
	}
	
	public boolean isEmployeeDistributionByUnitWidgetExist() {
		return driver.findElement(employeeDistributionByUnit).isDisplayed();
	}
	
	public boolean isEmployeeDistributionByLocationWidgetExist() {
		return driver.findElement(employeeDistributionByLocation).isDisplayed();
	}
	
	public DashboardPage doLogin() throws InterruptedException {
		clickOnDashboard();
		Thread.sleep(2000);
		isTimeAtWorkWidgetExist();
		isMyActionsWidgetExist();
		isQuickLaunchWidgetExist();
		isBuzzLatestPhotosWidgetExist();
		isEmployeesOnLeaveWidgetExist();
		isEmployeeDistributionByUnitWidgetExist();
		isEmployeeDistributionByLocationWidgetExist();
		return new DashboardPage(driver);
	}
}
