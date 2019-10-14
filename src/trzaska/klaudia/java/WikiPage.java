package trzaska.klaudia.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class WikiPage {
    protected static final int SHORT_WAIT = 3;
    WebDriverWait shortWait;
    WebDriver driver;

    public WikiPage (){
        String driverPath = "./chromedriver";
        System.setProperty("webdriver.chrome.driver", "./chromedriver");
        driver = new ChromeDriver();
        shortWait = new WebDriverWait(driver, SHORT_WAIT); // for explicit wait only
    }

    public void quit () {
        driver.close();
        driver.quit();
    }

    // follow a link via linkText and return new page title
    public void followLink (String linkText) {
        WebElement linkElement = driver.findElement(By.linkText(linkText));
        linkElement.click();
    }

    public void waitForArticleToLoad () {
        By articleTitleLocator = By.id("firstHeading");
        WebElement element = shortWait.until(
                ExpectedConditions.visibilityOfElementLocated(articleTitleLocator));
    }

    public String getArticleTitle () {
        return driver.findElement(By.id("firstHeading")).getText();
    }

    public String getCategoryText () {
        WebElement categoryElement = driver.findElement(By.cssSelector("[title^=Kategoria]"));
        return categoryElement.getText();
    }
}
