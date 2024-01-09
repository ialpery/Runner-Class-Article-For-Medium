package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {

       public HomePage(){PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath = "//*[text()=\"Login\"]")
    public WebElement loginButton;

    @FindBy(name = "username")
    public WebElement usernameBox;

    @FindBy(name = "password")
    public WebElement passwordBox;

    @FindBy(id = "nvscoreLoginSubmitButton")
    public WebElement loginSubmitButton;

    @FindBy(xpath = "(//button[@class=\"registered-menu-button\"])[1]")
    public WebElement registeredUserMenu;




}
