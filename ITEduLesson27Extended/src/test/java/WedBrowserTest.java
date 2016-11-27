
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.log4testng.Logger;

/**
 * Created by Billy on 10/30/2016.
 */
public class WedBrowserTest {
    static WebDriver webDriver;
    Logger log = Logger.getLogger(WedBrowserTest.class);

    @BeforeClass
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        log.info("Project is running!");
    }

    @Test(dataProvider = "Extra")
    public void openStartPageTest(String url) throws Exception {
        webDriver.get(url);
        Thread.sleep(2000);
        Assert.assertEquals(webDriver.getCurrentUrl(), url, "Error");
    }

    @DataProvider(name = "Extra")
    public static Object[][] urlArray() {
        return new Object[][]{new Object[]{"https://www.youtube.com/"},
                new Object[]{"https://www.google.com.ua/?gfe_rd=cr&ei=HLkVWPX8Go6D3AOMnIT4Bw"}};
    }

    @AfterClass
    public void tearDown() throws Exception {
        if (webDriver != null)
            webDriver.quit();
    }
}
