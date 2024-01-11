package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ProductDetailPage {

    public ProductDetailPage() {
        PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath = "//span[@class=\"otherBuyOptions\"]")
    public WebElement otherBuyOptions;

    @FindBy(id="//button[@id=\"addToCart\"]")
    public WebElement addToCart;

    @FindBy(xpath = "//span[@class=\"checkoutui-ProductOnBasketHeader-nOvp_U8bHbLzgKbSUFaz\"]")
    public WebElement urunSepetinizdeText;

    @FindBy(xpath = "//a[@class=\"checkoutui-Modal-iHhyy79iR28NvF33vKJb\"]")
    public WebElement closeButton;
}
