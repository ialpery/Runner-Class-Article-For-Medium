package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductDetailPage;
import pages.ProductListPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AutomationExerciseStepDefinitions {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    ProductListPage productListPage = new ProductListPage();

    ProductDetailPage productDetailPage = new ProductDetailPage();

    @Given("Navigated to url")
    public void navigated_to_url() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }
    @When("Verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrl,ConfigReader.getProperty("url"));
    }
    
    @And("Wait {int} seconds")
    public void waitSeconds(int waitSeconds) {

        try {
            Thread.sleep(waitSeconds*1000);
        } catch (InterruptedException e) {

        }
    }

    @And("Click to register button")
    public void clickToRegisterButton() {

        homePage.myAccountDropdown.getLocation();
        homePage.loginButtonHomepage.click();
        
    }

    @And("Type an email to email box")
    public void typeAnEmailToEmailBox() {

        loginPage.emailBar.sendKeys(ConfigReader.getProperty("email"));
        
    }

    @And("Click to continue button")
    public void clickToContinueButton() {

        loginPage.continueButton.click();
        
    }

    @And("Check if the email sent successfully message comes as {string}")
    public void checkIfTheMessage(String successMessage) {

        Assert.assertEquals(loginPage.sentEmailSuccessMessage, successMessage);
        
    }

    @And("Click to login button")
    public void clickToLoginButton() {

        loginPage.loginButton.click();
        
    }

    @Then("Check if the error message comes as {string}")
    public void checkIfTheMessageComes(String errorMessage) {

        Assert.assertEquals(loginPage.errorMessage, errorMessage);

    }

    @And("Click the search bar")
    public void clickTheSearchBar() {

        homePage.searchBar.click();

    }

    @And("Type {string}")
    public void type(String productName) {

        homePage.searchBar.sendKeys(productName);

    }

    @And("Click to search button")
    public void clickToSearchButton() {

        homePage.searchButton.click();

    }

    @And("Check if the result text include {string}")
    public void checkIfTheResultTextInclude(String productName) {

        Assert.assertTrue(productListPage.searchingResultText.getText().contains(productName));

    }

    @And("Click to first product")
    public void clickToFirstProduct() throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", productListPage.secondRow);
        Thread.sleep(500);
        productListPage.firstProduct.click();

    }

    @And("Click to add to cart button")
    public void clickToAddToCartButton() throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", productDetailPage.otherBuyOptions);
        Thread.sleep(500);
        productDetailPage.addToCart.click();

    }

    @And("Check if the successful message comes")
    public void checkIfTheSuccessfulMessageComes() {

        String successfulMessage = productDetailPage.urunSepetinizdeText.getText();
        Assert.assertTrue(successfulMessage.contains("Ürün sepetinizde"));


    }

    @Then("Click to close button")
    public void clickToCloseButton() {

        productDetailPage.closeButton.click();

    }

    @And("Click the search icon")
    public void clickTheSearchIcon() {

        homePage.searchIcon.click();

    }
}


