package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ProductListPage {

    public ProductListPage() {PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath = "//div[@class=\"moria-search-results-count\"]")
    public WebElement searchingResultText;

    @FindBy(xpath = "//li[@id=\"i0\"]")
    public WebElement firstProduct;

    @FindBy(xpath = "//li[@id=\"i4\"]/div/a")
    public WebElement secondRow;
}
