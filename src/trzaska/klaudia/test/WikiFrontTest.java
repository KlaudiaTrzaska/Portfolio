package trzaska.klaudia.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import trzaska.klaudia.java.Page;
import trzaska.klaudia.java.WikiFront;

import static org.junit.Assert.*;

public class WikiFrontTest {
    WikiFront page;

    @Before
    public void setUp() throws Exception {
        page = new WikiFront();
    }

    @After
    public void tearDown() throws Exception {
        page.quit();
    }

    @Test
    public void search() {
        page.search("blblbl");
    }
}