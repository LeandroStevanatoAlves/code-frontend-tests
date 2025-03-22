package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MenuPage {
    private WebDriver driver;
    private By menuButton = By.id("nav-hamburger-menu");
    private By categoriesList = By.cssSelector(".hmenu-visible");

    public MenuPage(WebDriver driver) {
        this.driver = driver;
    }

    public void abrirMenu() {
        driver.findElement(menuButton).click();
    }

    public boolean listaCategoriasExibido() {
        WebElement categories = driver.findElement(categoriesList);
        return categories.isDisplayed();
    }
}
