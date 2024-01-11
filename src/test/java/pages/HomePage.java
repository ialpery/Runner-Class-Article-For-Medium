package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {

       public HomePage(){PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(id = "login")
    public WebElement loginButtonHomepage;

    @FindBy(id = "myAccount")
    public WebElement myAccountDropdown;

    @FindBy(id = "register")
    public WebElement registerButton;

    @FindBy(xpath = "//div[@class=\"searchBoxOld-M1esqHPyWSuRUjMCALPK\"]/div[2]/input")
    public WebElement searchBar;

    @FindBy(xpath = "//div[contains(text(),'ARA')]")
    public WebElement searchButton;

    @FindBy(xpath = "//div[@class=\"searchBoxOld-SMf_9OYwoalnpLfDYGRG\"]/i")
    public WebElement searchIcon;


}
