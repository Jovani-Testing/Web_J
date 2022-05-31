package Tests;

import Confing.confing;
import Pages.HomePage;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class TestsHomePage {
    private WebDriver driver;

    @Before
    public void criarDriver() {
        confing wdriver = new confing();
        driver = wdriver.WebDriver();
    }

    @org.junit.Test
    public void teste_01() {
        HomePage homePage = new HomePage(driver);

        //Tests
        homePage.clicarEmOne();
        homePage.clicaEmTwo();
        homePage.clicarEmFor();

        // Informações descritas na HomePge

        //homePage.validarElementoOne();
        //homePage.validarElementoTwo();
        //homePage.validarElementoFour();

    }

    @org.junit.Test
    public void teste_02() {
        HomePage homePage = new HomePage(driver);

        //Tests

        homePage.scrollPage();
        homePage.clicarEmIBOne();
        homePage.clicaEmIBTwo();
        homePage.clicarEmIBFor();


    }

    @org.junit.Test
    public void teste_03() {
        HomePage homePage = new HomePage(driver);
        String texto ="Jovani Miguel Custódio";

        //Tests

        homePage.preencherInformacao(texto);
        homePage.clicarEmOne();
        homePage.selecionarOpcaoThree();
        homePage.abrirSelectBox();
        homePage.selecionarSelectBoxExampleTwo();
        homePage.closeSelectBox();


    }
}
