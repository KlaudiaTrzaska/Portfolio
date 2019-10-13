package trzaska.klaudia.java;

import org.openqa.selenium.By;

public class WikiFront extends Page{

    public WikiFront (){
        super();
        driver.manage().window().maximize();
        driver.get("https://pl.wikipedia.org");

    }

    public void search(String searchItem) {

        driver.findElement(By.id("searchInput"));
        driver.findElement(By.name("search"));
        driver.findElement(By.className("searchButton"));

    }
}
