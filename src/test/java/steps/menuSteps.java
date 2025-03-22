package steps;

import io.cucumber.java.pt.Quando;
import io.cucumber.java.pt.Então;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.HomePage;
import pages.MenuPage;

public class menuSteps {
    private WebDriver driver;
    private HomePage homePage;
    private MenuPage menuPage;

    @Quando("altero o tamanho da janela para {string}")
    public void altero_o_tamanho_da_janela_para(String tamanhoJanela) {
        if (tamanhoJanela.equals("mobile")) {
            driver.manage().window().setSize(new Dimension(375, 812)); // Simula um iPhone X
        } else if (tamanhoJanela.equals("tablet")) {
            driver.manage().window().setSize(new Dimension(768, 1024)); // Simula um iPad
        }
    }

    @Então("o menu é exibido corretamente")
    public void o_menu_é_exibido_corretamente() {
        menuPage.abrirMenu();
        Assert.assertTrue(menuPage.isCategoriesListDisplayed(), "O menu não foi exibido corretamente.");
        driver.quit();
    }
}
