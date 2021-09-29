import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {


    private static final By LOGIN = By.xpath("//div[@name='profile']");
    private static final By LOG_BUTTON = By.linkText("Giriş Yap");
    private By search = By.name("k");
    private By secondPage = By.xpath("//*[@data-testid='paginationNext']");


    public HomePage(WebDriver driver) {
        super(driver);


    }


    public void getLoginPage() throws InterruptedException {

        driver.findElement(LOGIN).click();
        Thread.sleep(1000);
        driver.findElement(LOG_BUTTON).click();
        Thread.sleep(1000);


    }

    public WebElement element(By Locator) {
        return driver.findElement(Locator);
    }

    public void acceptCookies() {
    }

    public void searchComputer() throws InterruptedException {
        Thread.sleep(1000);
        WebElement searchSpace = driver.findElement(search);
        searchSpace.click();
        Thread.sleep(1000);
        searchSpace.sendKeys("bilgisayar");


        WebElement searchBSpace = driver.findElement(By.xpath("//*[@id=\"main-header\"]/div[3]/div/div/div/div[2]/form/div/div[2]/button"));
        searchBSpace.click();
        Thread.sleep(4000);

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 5000)");
        Thread.sleep(2000);
        WebElement searchSecondSpace = driver.findElement(secondPage);

        Thread.sleep(4000);
        searchSecondSpace.click();
        Thread.sleep(2000);


    }


}
