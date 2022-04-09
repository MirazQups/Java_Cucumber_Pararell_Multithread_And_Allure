package stepDefinitions.testCRS;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.TestCRSPage;
import utils.TestContextSetup;

public class TestCRSStep {

    TestContextSetup testContextSetup;
    TestCRSPage testCRSPage;

    public TestCRSStep(TestContextSetup testContextSetup)
    {
        this.testContextSetup=testContextSetup;
        this.testCRSPage =testContextSetup.pageObjectManager.getTestCRSPage();
    }

    @Given("user Enter username {string}")
    public void user_enter_username(String username) {
        testCRSPage.setUserName(username);

    }

    @And("user Enter password {string}")
    public void user_enter_password(String password) {
        testCRSPage.setPassword(password);
    }

    @Then("click on login button")
    public void click_on_login_button() throws InterruptedException {
        testCRSPage.setLogin().click();
        Thread.sleep(5000);
    }

    @When("click on all budget")
    public void clickOnAllBudget() throws InterruptedException {

        Thread.sleep(5000);
    }

    @Then("validation of page title")
    public void validationOfPageTitle() {
        Assert.assertEquals("SPOLNET", testCRSPage.getPageTitle());
    }


    @Given("click budget option from left menu")
    public void clickBudgetOptionFromLeftMenu() {

    }
}
