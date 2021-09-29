import org.openqa.selenium.WebDriver;

public class BasketPage extends BasePage{
    public BasketPage(WebDriver driver) {
        super(driver);
    }

    public void plusQuantity() {
    }

    public boolean isPricesSame() {
        return true;
    }

    public void deleteBasket() {
    }

    public boolean isBasketEmpty() {
        return true;
    }
}
