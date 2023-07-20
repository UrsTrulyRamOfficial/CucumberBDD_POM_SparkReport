/**
 * @author RameshReddy.K
 * @gitHub https://github.com/UrsTrulyRamOfficial
 *
 **/
package com.qa.steps;

import com.qa.factory.DriverFactory;
import com.qa.pages.RecruitmentPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RecruitmentSteps {

	private RecruitmentPage recruitPage = new RecruitmentPage(DriverFactory.getDriver());

	@Then("user select recruitment tab")
	public void user_select_recruitment_tab() throws InterruptedException {
		recruitPage.selectRecruitmentTab();
	}
	
	@And("user enters first name {string}")
	public void user_enter_first_name(String fName) throws InterruptedException {
		recruitPage.enterFirstName(fName);
	}

	@And("user enter middle name {string}")
	public void user_enter_middle_name(String mName) {
		recruitPage.enterMiddleName(mName);
	}

	@And("user enters last name {string}")
	public void user_click_on_dashboard(String lName) {
		recruitPage.enterLastName(lName);
	}

	@And("user select vacancy dropdown {string}")
	public void user_select_vacancy_dropdown(String vacancyDropVal) {
		recruitPage.selectVacancyDropdown(vacancyDropVal);
	}

	@And("user enters email address {string}")
	public void user_enter_email_address(String email) {
		recruitPage.enterEmailaddress(email);
	}

	@And("user enter contact number {string}")
	public void user_enter_contact_number(String cNbr) {
		recruitPage.enterContactNumber(cNbr);
	}

	@And("user click on browse and select resume {string}")
	public void user_click_on_browse_and_select_resume(String fileName) throws InterruptedException {
		recruitPage.browseAndSelecteResume(fileName);
	}

	@And("user enter keywords {string}")
	public void user_enter_keywords(String keywords) {
		recruitPage.enterKeyWords(keywords);
	}

	@And("user enter notes {string}")
	public void user_enter_notes(String notes) {
		recruitPage.enterNotes(notes);
	}

	@When("user select concent checkbox")
	public void user_select_concent_checkbox() throws InterruptedException {
		recruitPage.selectConcentCheckBox();
	}

	@Then("user click on save button")
	public void user_click_on_save_button() {
		recruitPage.clickOnSaveButton();
	}
}

