import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    private By email = By.id("L-UserNameField");
    private By password = By.id("L-PasswordField");
    private By login = By.xpath("//*[@id=\"gg-login-enter\"]");

    public LoginPage(WebDriver driver) {
        super(driver);

    }


    public void enterLoginForm() throws InterruptedException {
        WebElement emailSpace = driver.findElement(email);
        emailSpace.click();
        Thread.sleep(1000);
        emailSpace.sendKeys("nomenbjk1@gmail.com");
        WebElement passwordSpace = driver.findElement(password);
        passwordSpace.click();
        Thread.sleep(1000);
        passwordSpace.sendKeys("KqRxMqxuW4G8LE5");
        WebElement loginSpace = driver.findElement(login);
        loginSpace.click();
        Thread.sleep(1000);


    }

    public WebElement element(By Locator) {
        return driver.findElement(Locator);
    }
}
