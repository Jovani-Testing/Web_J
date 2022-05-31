package Confing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class confing {


        public WebDriver WebDriver()
        {
            WebDriver driver = new ChromeDriver();
            driver.get("https://wj-qa-automation-test.github.io/qa-test/");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            return driver;
        }

    }
