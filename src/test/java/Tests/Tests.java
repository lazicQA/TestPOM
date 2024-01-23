package Tests;

import Base.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tests extends BaseTest {
@BeforeMethod
    public void pageSetUp() {
    driver.navigate().to("https://the-internet.herokuapp.com/");
}

@Test
    public void verifyThatDeleteButtonIsVisibleAfterAddingObject() {

    homePage.getAddRemoveObjectLink().click();
    addObjectPage.getAddButton().click();
    Assert.assertTrue(addObjectPage.getRemoveButton().isDisplayed());

}

@Test
    public void verifyThatDeleteButtonIsNoLongerVisibleAfterRemovingObject() {

    homePage.getAddRemoveObjectLink().click();
    addObjectPage.getAddButton().click();
    addObjectPage.getRemoveButton().click();
    try
    {
        Assert.assertFalse(addObjectPage.getRemoveButton().isDisplayed());
    }
    catch (Exception e) {
        System.out.println(e);
    }
}

}


