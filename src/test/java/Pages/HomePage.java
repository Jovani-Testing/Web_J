package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class HomePage {

    private final WebDriver driver;

    //Construtor

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }


    //Mapping

    @FindBy(how = How.ID, using = "btn_one")
    private WebElement click_one;

    @FindBy(how = How.ID, using = "btn_two")
    private WebElement click_two;

    @FindBy(how = How.ID, using = "btn_link")
    private WebElement click_four;

    @FindBy(how = How.XPATH, using = "//*[@id=\"btn_one\"]")
    private WebElement click_IB_One;

    @FindBy(how = How.XPATH, using = "//*[@id=\"btn_two\"]")
    private WebElement click_IB_Two;

    @FindBy(how = How.XPATH, using = "//*[@id=\"btn_link\"]")
    private WebElement click_IB_Four;

    @FindBy(how = How.ID, using = "panel_body_one")
    private WebElement visible;

    @FindBy(how = How.ID, using = "first_name")
    private WebElement yourFistName;

    @FindBy(how = How.ID, using = "btn_three")
    private WebElement optionThree;

    @FindBy(how = How.ID, using = "select_box")
    private WebElement selectBox;

    @FindBy(how = How.XPATH, using = "//*[@id=\"select_box\"]/option[2]")
    private WebElement exampleTwo;

    @FindBy(how = How.ID, using = "select_box")
    private WebElement fecharSelectBox;


    //actions

    public void clicarEmOne() {
        click_one.click();
    }

    public void clicaEmTwo() {
        click_two.click();
    }

    public void clicarEmFor() {
        click_four.click();
    }

    public void clicarEmIBOne() {
        click_IB_One.click();
    }

    public void clicaEmIBTwo() {
        click_IB_Two.click();
    }

    public void clicarEmIBFor() {
        click_IB_Four.click();
    }



    public void validarElementoOne() {

        // Tentei algumas alternativas para essa validação como mostro abaixo porém sem sucesso. Independente do resultado
        // do processo seletivo, se possível gostaria de saber como é feita essa validação.

                                      // Outras tentativas.

        // WebElement visible = driver .findElement(By.id("panel_body_one[contains(text(),'One')]"));
        // boolean visivel = visible.isDisplayed();
        // boolean buttonVisibleOne = (driver.findElement(By.id("btn_one")).isDisplayed());

        boolean visibleOne = (driver.findElement(By.id("btn_one")).isDisplayed());
        if (visibleOne == true) {
            System.out.println("Botão 'One'está desativado");
        } else {
            System.out.println("Botão 'One' está presente na tela");
        }

        boolean visibleTwo = (driver.findElement(By.id("btn_one")).isDisplayed());
        if (visibleTwo == true) {
            System.out.println("Botão 'One'está desativado");
        } else {
            System.out.println("Botão 'One' está presente na tela");
        }

        boolean visibleFour = (driver.findElement(By.id("btn_one")).isDisplayed());
        if (visibleTwo == true) {
            System.out.println("Botão 'One'está desativado");
        } else {
            System.out.println("Botão 'One' está presente na tela");
        }
    }

    public void preencherInformacao(String texto){yourFistName.sendKeys(texto);}

    public void selecionarOpcaoThree() {optionThree.click();}

    public void abrirSelectBox() {selectBox.click();}

    public void selecionarSelectBoxExampleTwo() {exampleTwo.click();}

    public void closeSelectBox() {fecharSelectBox.click();}

    public void scrollPage() {
    ((JavascriptExecutor)driver).executeScript("scroll(0,800)");

        }
    }


