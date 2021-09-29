import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestCases extends BaseTest {
    LoginPage loginPage;


    @Test
    public void loginp() throws InterruptedException {
        homePage.getLoginPage();


    }

    @Test
    public void type_mailpassword() throws InterruptedException {
        loginPage = new LoginPage(driver);
        loginPage.enterLoginForm();


    }

    @Test
    public void search_product() throws InterruptedException {
        homePage = new HomePage(driver);
        homePage.searchComputer();


    }

    @Test
    public void select_a_product() throws InterruptedException {
        productsPage = new ProductsPage(driver);
        productsPage.selectaProduct(1);

    }

    @Test
    public void add_to_cart() {
        productsPage.addToCart();

    }

    @Test
    public void price_check() {
        productsPage.priceCheck();
        Assertions.assertTrue(basketPage.isPricesSame(),
                "Prices is not same.");

    }

    @Test
    public void plus_quantity() {
        basketPage.plusQuantity();

    }

    @Test
    public void delete_basket() {
        basketPage.deleteBasket();
        Assertions.assertTrue(basketPage.isBasketEmpty(),
                "Basket is not empty.");

    }

*/

}
