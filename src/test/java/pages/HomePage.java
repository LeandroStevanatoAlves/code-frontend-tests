package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage {
    private final WebDriver driver;
    private final By searchBox = By.id("twotabsearchtextbox");
    private final By suggestionsList = By.id("sac-suggestion-row-1");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void abrirHomePage() {
        driver.get("https://www.amazon.com.br/");
    }

    public void entrarTermoPesquisa(String term) {
        driver.findElement(searchBox).sendKeys(term);
    }

    public boolean sugestoesExibidas() {
        List<WebElement> suggestions = driver.findElements(suggestionsList);
        return suggestions.length > 0;
    }
}
