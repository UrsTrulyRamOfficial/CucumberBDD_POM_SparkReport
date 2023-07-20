/**
 * @author RameshReddy.K
 * @gitHub https://github.com/UrsTrulyRamOfficial
 *
 **/
package com.qa.steps;

import org.junit.Assert;

import com.qa.factory.DriverFactory;
import com.qa.pages.DashboardPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class DashboardSteps {

	private DashboardPage dashboardPage = new DashboardPage(DriverFactory.getDriver());

	@And("user click on dashboard")
	public void user_click_on_dashboard() {
		dashboardPage.clickOnDashboard();
	}

	@Then("first widget should be {string}")
	public void first_widget_should_be(String expectedWidget) {
		dashboardPage.isTimeAtWorkWidgetExist();
		Assert.assertTrue(dashboardPage.isTimeAtWorkWidgetExist());
	}

	@And("second widget should be {string}")
	public void second_widget_should_be(String expectedWidget) {
		dashboardPage.isMyActionsWidgetExist();
		Assert.assertTrue(dashboardPage.isMyActionsWidgetExist());
	}

	@And("third widget should be {string}")
	public void third_widget_should_be(String expectedWidget) {
		dashboardPage.isQuickLaunchWidgetExist();
		Assert.assertTrue(dashboardPage.isQuickLaunchWidgetExist());
	}

	@Then("fourth widget should be {string}")
	public void fourth_widget_should_be(String expectedWidget) {
		dashboardPage.isBuzzLatestPhotosWidgetExist();
		Assert.assertTrue(dashboardPage.isBuzzLatestPhotosWidgetExist());
	}

	@And("fifth widget should be {string}")
	public void fifth_widget_should_be(String expectedWidget) {
		dashboardPage.isEmployeesOnLeaveWidgetExist();
		Assert.assertTrue(dashboardPage.isEmployeesOnLeaveWidgetExist());
	}

	@And("sixth widget should be {string}")
	public void sixth_widget_should_be(String expectedWidget) {
		dashboardPage.isEmployeeDistributionByUnitWidgetExist();
		Assert.assertTrue(dashboardPage.isEmployeeDistributionByUnitWidgetExist());
	}

	@And("seventh widget should be {string}")
	public void seventh_widget_should_be(String expectedWidget) {
		dashboardPage.isEmployeeDistributionByUnitWidgetExist();
		Assert.assertTrue(dashboardPage.isEmployeeDistributionByUnitWidgetExist());
	}
}
