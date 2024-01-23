package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddObjectPage {
    public AddObjectPage(WebDriver driver) {
        this.driver = driver;
    }

    WebDriver driver;
    WebElement addButton;
    WebElement removeButton;

    public WebElement getAddButton() {
        return driver.findElement(By.xpath("/html/body/div[2]/div/div/button"));
    }

    public WebElement getRemoveButton() {
        return driver.findElement(By.className("added-manually"));
    }
}
