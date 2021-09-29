import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class BaseTest {

    HomePage homePage;
    LoginPage loginPage;
    ProductsPage productsPage;
    BasketPage basketPage;


    protected WebDriver driver;


    @BeforeAll
    public void setUp() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        this.driver = new ChromeDriver();
        driver.get("https://www.gittigidiyor.com/");
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
    }

    @AfterAll
    public void tearDown() {
        driver.quit();
    }

}