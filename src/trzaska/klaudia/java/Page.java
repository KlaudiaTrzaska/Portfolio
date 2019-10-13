package trzaska.klaudia.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class Page {
    WebDriver driver;

    public Page (){

        String driverPath = "./chromedriver";
        System.setProperty("webdriver.chrome.driver", "./chromedriver");
        driver = new ChromeDriver();
    }

    public void quit() {
        driver.close();
        driver.quit();
    }


}
