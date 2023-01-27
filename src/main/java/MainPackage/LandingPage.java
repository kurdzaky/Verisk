package MainPackage;
import com.github.javafaker.Faker;
import dev.failsafe.internal.util.Assert;
import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.print.attribute.Attribute;
import javax.swing.text.AttributeSet;
import java.lang.annotation.Repeatable;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;

import java.time.Duration;
import java.util.concurrent.locks.Condition;

public class LandingPage {

    private WebDriver driver;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }
    private By CookiesAcceptButton = By.cssSelector("button[class='button bg-radical-blue block w-full py-2 cc-cookies-accept']");
    private By Logo = By.id("Layer_1");
    private By ProductsButton = By.cssSelector("a[aria-label='Products']");
    private By NewsButton = By.cssSelector("a[href='/news/']");
    private By CompanyButton = By.cssSelector("a[href='/company/']");
    private By CareersButton = By.cssSelector("a[href='/careers/']");
    private By ContactButton = By.cssSelector("a[href='/contact/']");
    private By MenuBar = By.cssSelector("div[class='container mx-auto px-6']");

    public void ElementsVisibility() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(9));
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(CookiesAcceptButton));
        driver.findElement(CookiesAcceptButton).click();
        boolean LogoVisible = driver.findElement(Logo).isDisplayed();
        boolean MenuBarVisible = driver.findElement(MenuBar).isDisplayed();
        boolean ProductsButtonVisible = driver.findElement(ProductsButton).isDisplayed();
        boolean CareersButtonVisible = driver.findElement(CareersButton).isDisplayed();
        boolean ContactButtonVisible = driver.findElement(ContactButton).isDisplayed();
        boolean NewsButtonVisible = driver.findElement(NewsButton).isDisplayed();
        if (LogoVisible && MenuBarVisible && ProductsButtonVisible && CareersButtonVisible && ContactButtonVisible && NewsButtonVisible) {
            System.out.println("SUCCESS! All elements are present");
        } else {
            System.out.println("Fail! Elements are not displayed");
        }

    }




}
