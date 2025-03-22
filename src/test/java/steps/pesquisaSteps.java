package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import io.cucumber.java.pt.Então;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.HomePage;

public class pesquisaSteps {
    private WebDriver driver;
    private HomePage homePage;

    @Dado("que estou na página inicial da Amazon")
    public void que_estou_na_página_inicial_da_amazon() {
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        homePage.abrirHomePage();
    }
    @Quando("digito {string} na barra de pesquisa")
    public void digito_na_barra_de_pesquisa(String termoBusca) {
        homePage.entrarTermoPesquisa(termoBusca);
    }
    @Então("vejo sugestões relacionadas ao termo {string}")
    public void vejo_sugestões_relacionadas_ao_termo(String termoBusca) {
        Assert.assertTrue(homePage.sugestoesExibidas(), "As sugestões não foram exibidas.");
        driver.quit();
    }

    @Então("não vejo sugestões exibidas")
    public void não_vejo_sugestões_exibidas() {
        Assert.assertFalse(homePage.sugestoesExibidas(), "Sugestões foram exibidas incorretamente.");
        driver.quit();
    }
}
