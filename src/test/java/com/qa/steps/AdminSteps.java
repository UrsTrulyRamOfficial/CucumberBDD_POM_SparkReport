package com.qa.steps;

import com.qa.factory.DriverFactory;
import com.qa.pages.AdminPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class AdminSteps {
	
	private AdminPage adminPage = new AdminPage(DriverFactory.getDriver());

	@And("user click on admin tab")
	public void user_click_on_dashboard() {
		adminPage.clickOnAdminTab();
	}
	
	@And("user click on add button")
	public void user_click_on_add_button() {
		adminPage.clickOnAddBtn();
	}
	
	@Then("user adding a user role {string}")
	public void user_adding_a_user_role(String role) {
		adminPage.addUserRole(role);
	}

	@And("user enter employee name")
	public void user_enter_employee_name() throws InterruptedException {
		adminPage.enterEmployeeName();
	}
	
	@And("user select status dropdown {string}")
	public void user_select_status_dropdown(String status) {
		adminPage.selectStatusDropdown(status);
	}
	
	@And("user entering user name")
	public void user_entering_user_name() {
		adminPage.enterUserName();
	}
	
	@And("user enter password and confirm password {string},{string}")
	public void user_enter_password_and_confirm_password(String pwd, String cnfmPass) {
		adminPage.enterPassAndConfirmPassword(pwd, cnfmPass);
	}
	
	@And("user clicks on save button")
	public void user_clicks_on_save_button() {
		adminPage.clickOnSaveButton();
	}
}
