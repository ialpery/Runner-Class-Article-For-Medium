package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;

public class AutomationExerciseStepDefinitions {

    HomePage homePage = new HomePage();

    @Given("Navigated to url")
    public void navigated_to_url() {
        Driver.getDriver().get(ConfigReader.getProperty("devUrl"));
    }
    @When("Verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains("home"));
    }
    @When("Click the login button")
    public void click_the_login_button() {
        homePage.loginButton.click();
    }

    @When("Type username")
    public void type_username() {
        homePage.usernameBox.sendKeys(ConfigReader.getProperty("username"));
    }

    @When("Type password")
    public void type_password() {
        homePage.passwordBox.sendKeys(ConfigReader.getProperty("password"));
    }

    @And("Click the login submit button")
    public void clickTheLoginSubmitButton() {
        homePage.loginSubmitButton.click();
    }

    @Then("Verify that user be login correctly")
    public void verify_that_user_be_login_correctly() {
        Assert.assertTrue(homePage.registeredUserMenu.isDisplayed());
    }

    @And("Wait {int} seconds")
    public void waitSeconds(int waitSeconds) {

        try {
            Thread.sleep(waitSeconds*1000);
        } catch (InterruptedException e) {

        }
    }
}


