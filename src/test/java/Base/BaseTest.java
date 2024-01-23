package Base;

import Pages.AddObjectPage;
import Pages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    public WebDriver driver;
    public HomePage homePage;
    public AddObjectPage addObjectPage;

    @BeforeClass
    public void SetUp() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
        addObjectPage = new AddObjectPage(driver);
    }
}
