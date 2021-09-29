import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage extends BasePage {

    private By computer = By.className("qjixn8-0 sc-1bydi5r-0 dGNqQc pXiHf sc-1n49x8z-3 bhXnM");
    private By addCart = By.id("add-to-basket");


    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductpage() {
        return true;
    }

    public void selectaProduct(int i) throws InterruptedException {
        Thread.sleep(2000);
        WebElement takeComputer = driver.findElement(computer);
        takeComputer.click();
        Thread.sleep(2000);


    }

    public void addToCart() {

        WebElement addShopCart = driver.findElement(addCart);
        addShopCart.click();
        Thread.sleep(2000);


    }

    public void priceCheck() {
    }

    public boolean isOnProductPage() {
        return true;
    }
}
