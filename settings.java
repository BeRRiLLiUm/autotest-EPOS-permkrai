package LoginSite;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Settings {

    public ChromeDriver driver;
    public WebDriverWait wait;
    //String currentWindow = driver.getWindowHandle();

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "/Users/maxtall/Downloads/chromedriver");
        driver = new ChromeDriver();
        System.out.println("chrome webdriver start");
    }
    @After
    public void end() {
        System.out.println("test end");
        driver.quit();
    }



}
