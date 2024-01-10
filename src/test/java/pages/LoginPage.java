package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "txtUserName")
    public WebElement emailBar;

    @FindBy(id = "btnLogin")
    public WebElement loginButton;

    @FindBy(xpath = "//div[contains(text(),'eksik')]")
    public WebElement errorMessage;

    @FindBy(id = "btnSignUpSubmit")
    public WebElement continueButton;

    @FindBy(xpath = "//div[contains(text(),'gönderildi')]")
    public WebElement sentEmailSuccessMessage;

}