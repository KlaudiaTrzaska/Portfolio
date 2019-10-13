package trzaska.klaudia.java;

import org.openqa.selenium.By;

public class WikiFront extends Page{

    public WikiFront (){
        driver.manage().window().maximize();
        driver.get("https://pl.wikipedia.org");

    }

    public void search(String searchItem) {

        driver.findElement(By.id("searchInput")).sendKeys(searchItem);
        driver.findElement(By.id("searchButton")).click();

    }
}
