package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
WebDriver driver;
WebElement addRemoveObjectLink, basicAuth, checkBox, entryAd;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }


    public WebElement getAddRemoveObjectLink() {
        return driver.findElement(By.linkText("Add/Remove Elements"));
    }


    public WebElement getBasicAuth() {
        return driver.findElement(By.linkText("Basic Auth"));
    }

    public WebElement getCheckBox() {
        return driver.findElement(By.linkText("Checkboxes"));
    }


    public WebElement getEntryAd() {
        return driver.findElement(By.linkText("Entry Ad"));
    }
}
