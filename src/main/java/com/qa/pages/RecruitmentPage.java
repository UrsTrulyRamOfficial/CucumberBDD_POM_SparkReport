/**
 * @author RameshReddy.K
 * @gitHub https://github.com/UrsTrulyRamOfficial
 *
 **/
package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RecruitmentPage {
	
	private WebDriver driver;

	// 1. By Locators: OR
	private By RecruitmentTab = By.xpath("//span[text()='Recruitment']");
	private By addBtn = By.xpath("//div[@class='orangehrm-header-container']/button[@type='button']");
	private By firstName = By.xpath("//input[@name='firstName']");
	private By middleName = By.xpath("//input[@name='middleName']");
	private By lastName = By.xpath("//input[@name='lastName']");
	private By vacancyDrop = By.xpath("//div//div[@class='oxd-select-wrapper']/div//i");
	private By emailAddress = By.xpath("//label[text()='Email']/../..//input[@placeholder='Type here']");
	private By contactnbr = By.xpath("//label[text()='Contact Number']/../..//input[@placeholder='Type here']");
	private By browserResume = By.xpath("//input[@type='file']");
	private By keywordsWithComma = By.xpath("//input[@placeholder='Enter comma seperated words...']");
	private By notesField = By.xpath("//textarea[@placeholder='Type here']");
	private By concentChkBox = By.xpath("//span[@class='oxd-checkbox-input oxd-checkbox-input--active --label-right oxd-checkbox-input']");
	private By saveBtn = By.xpath("//button[@type='submit']");

	
	// 2. Constructor of the page class:
	public RecruitmentPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void selectRecruitmentTab() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(RecruitmentTab).click();
		Thread.sleep(2000);
		driver.findElement(addBtn).click();
	}
	
	public void enterFirstName(String fName) throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(firstName).sendKeys(fName);
	}
	
	public void enterMiddleName(String mName) {
		driver.findElement(middleName).sendKeys(mName);
	}
	
	public void enterLastName(String lName) {
		driver.findElement(lastName).sendKeys(lName);
	}
	
	public void selectVacancyDropdown(String vacancyDropVal) {
		driver.findElement(vacancyDrop).click();
		driver.findElement(By.xpath("//*[contains(text(),'"+vacancyDropVal+"')]")).click();
	}
	
	public void enterEmailaddress(String email) {
		driver.findElement(emailAddress).sendKeys(email);
	}
	
	public void enterContactNumber(String cNbr) {
		driver.findElement(contactnbr).sendKeys(cNbr);
	}
	
	public void browseAndSelecteResume(String fileName) throws InterruptedException {
		String filePath = System.getProperty("user.dir") + "/testData/"+ fileName;
		Thread.sleep(2000);
		driver.findElement(browserResume).sendKeys(filePath);
	}
	
	public void enterKeyWords(String keywords) {
		driver.findElement(keywordsWithComma).sendKeys(keywords);
	}
	
	public void enterNotes(String notes) {
		driver.findElement(notesField).sendKeys(notes);
	}
	
	public void selectConcentCheckBox() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(concentChkBox).click();
	}
	
	public void clickOnSaveButton() {
		driver.findElement(saveBtn).click();
	}
	
	public RecruitmentPage AddCandidateDetails(String fName, String mName, String lName, String vacancyDropVal, String email, String cNbr, String fileName, String keywords, String notes) throws InterruptedException {
		selectRecruitmentTab();
		enterFirstName(fName);
		enterMiddleName(mName);
		enterLastName(lName);
		selectVacancyDropdown(vacancyDropVal);
		enterEmailaddress(email);
		enterContactNumber(cNbr);
		browseAndSelecteResume(fileName);
		enterKeyWords(keywords);
		enterNotes(notes);
		selectConcentCheckBox();
		clickOnSaveButton();
		return new RecruitmentPage(driver);
	}
}
