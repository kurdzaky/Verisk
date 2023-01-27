import MainPackage.ContactPage;
import MainPackage.LandingPage;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
        import org.junit.After;
        import org.junit.Assert;
        import org.junit.Before;
        import org.junit.*;
        import org.junit.Test;
        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;

        import java.util.concurrent.TimeUnit;

public class LandingPageTest {
        private WebDriver driver;
        public static LandingPage landingPage;

        @Before
        public void setup() {

            System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver_win32\\chromedriver.exe");

            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            driver.get("https://www.verisksequel.com/");
            LandingPage landingPage = new LandingPage(driver);
        }

        @Test
        public void PageLoadedTest() {
            LandingPage landingPage = new LandingPage(driver);
landingPage.ElementsVisibility();


}
}


