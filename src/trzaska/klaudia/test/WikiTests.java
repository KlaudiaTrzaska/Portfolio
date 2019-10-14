package trzaska.klaudia.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import trzaska.klaudia.java.WikiFront;

public class WikiTests {
    WikiFront page;

    @Before
    public void setUp () throws Exception {
        page = new WikiFront();
    }

    @After
    public void tearDown () throws Exception {
        page.quit();
    }

    @Test
    public void searchForTestowanieOprogramowania () {
        page.search("Testowanie oprogramowania");
        page.followLink("testy akceptacyjne");
        page.waitForArticleToLoad();

        Assert.assertEquals("Testy akceptacyjne[edytuj]", page.getArticleTitle());
        Assert.assertEquals("Testowanie oprogramowania", page.getCategoryText());
    }

}