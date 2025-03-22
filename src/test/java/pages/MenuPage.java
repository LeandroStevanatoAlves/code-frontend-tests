package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MenuPage {
    private WebDriver driver;
    private By menuButton = By.id("nav-hamburger-menu");

    public MenuPage(WebDriver driver) {
        this.driver = driver;
    }

    public void abrirMenu() {
        driver.findElement(menuButton).click();
    }
}
