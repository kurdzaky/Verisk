import MainPackage.ContactPage;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

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

public class ContactPageTest {
    private WebDriver driver;
    public static ContactPage contactPage;

    @Before
    public void setup() {

        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver_win32\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.verisksequel.com/contact/");
        ContactPage contactPage = new ContactPage(driver);
    }

    @Test
    public void ContactPageForms() {
        ContactPage contactPage = new ContactPage(driver);
        contactPage.CheckSpecialCharacters();
contactPage.CheckError();
contactPage.DropdownCheck();
    }

}