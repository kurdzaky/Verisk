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
import java.util.regex.*;

public class ContactPage {

    private WebDriver driver;

    public ContactPage(WebDriver driver) {
        this.driver = driver;


    }

    private By NameLabel = By.cssSelector("div[class=' umbraco-forms-field name shortanswer mandatory']");
    private By nameError = By.id("dc603b19-d76f-4338-f83f-fa7738f17b8b-error");
    private By CookiesAcceptButton = By.cssSelector("button[class='button bg-radical-blue block w-full py-2 cc-cookies-accept']");
    private By CompanyLabel = By.cssSelector("div[class=' umbraco-forms-field company shortanswer mandatory alternating']");
    private By companyError = By.id("c6edb25c-efa1-4bfa-8b1d-0893d1bfdd42-error");
    private By EmailLabel = By.cssSelector("div[class=' umbraco-forms-field emailaddress shortanswer mandatory alternating']");
    private By emailError = By.id("00ae2855-e87d-40b8-fbaa-a8ae183c7350-error");
    private By ProvideValidEmail = By.cssSelector("span[id='00ae2855-e87d-40b8-fbaa-a8ae183c7350-error']");

    private By EmailField = By.id("00ae2855-e87d-40b8-fbaa-a8ae183c7350");
    private By MessageLabel = By.cssSelector("div[class=' umbraco-forms-field message longanswer mandatory alternating']");
    private By messageError = By.id("8e426ffc-5583-4b6a-9009-8a64a2b41b86-error");
    private By InquiryLabel = By.cssSelector("div[class=' umbraco-forms-field enquirytype dropdown mandatory']");
    private By InquiryDropdown = By.id("648e5301-4f3a-4bd7-c5cd-2013d20483d5");
    private By OptSequelHub = By.cssSelector("option[value='Sequel Hub']");
    private By OptSales = By.cssSelector("option[value='Sales']");
    private By OptStartups = By.cssSelector("option[value='Start ups']");
    private By OptRecruitment = By.cssSelector("option[value='Recruitment']");
    private By OptEvents = By.cssSelector("option[value='Events/Marketing']");
    private By OptOther = By.cssSelector("option[value='Other']");
    private By inquiryError = By.id("648e5301-4f3a-4bd7-c5cd-2013d20483d5-error");
    private By CaptchaLabel = By.cssSelector("div[class=' umbraco-forms-field recaptcha recaptcha2 mandatory']");
    private By CaptchaButton = By.cssSelector("div[class='recaptcha-checkbox-border']");
    private By SubmitButton = By.cssSelector("input[type='submit']");

    public void CheckSpecialCharacters() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(9));
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(CookiesAcceptButton));

        driver.findElement(CookiesAcceptButton).click();
        String nameLabel = driver.findElement(NameLabel).getText();
        String companyLabel = driver.findElement(CompanyLabel).getText();
        String messageLabel = driver.findElement(MessageLabel).getText();
        String emailLabel = driver.findElement(EmailLabel).getText();
        String inquiryLabel = driver.findElement(InquiryLabel).getText();
        String captchaLabel = driver.findElement(CaptchaLabel).getText();
        String[] AllLabels = {nameLabel, companyLabel, messageLabel, emailLabel, inquiryLabel, captchaLabel};


        System.out.println(nameLabel);
        boolean nameLabelContain = nameLabel.contains("*");
        boolean companyLabelContain = companyLabel.contains("*");
        boolean messageLabelContain = messageLabel.contains("*");
        boolean emailLabelContain = messageLabel.contains("*");
        boolean inquiryLabelContain = inquiryLabel.contains("*");
        boolean captchaLabelContain = captchaLabel.contains("*");


        if (nameLabelContain && companyLabelContain && messageLabelContain && emailLabelContain && inquiryLabelContain && captchaLabelContain) {
            System.out.println("Success: each label of mandatory textField works properly");
        } else {
            System.out.println("Fail");
        }

    }

    public void CheckError() {
        driver.findElement(SubmitButton).click();
        boolean nameErrorAppear = driver.findElement(nameError).isDisplayed();
        boolean companyErrorAppear = driver.findElement(companyError).isDisplayed();
        boolean emailErrorAppear = driver.findElement(emailError).isDisplayed();
        boolean messageErrorAppear = driver.findElement(messageError).isDisplayed();
        boolean inquiryErrorAppear = driver.findElement(inquiryError).isDisplayed();

        if (nameErrorAppear && companyErrorAppear && emailErrorAppear && messageErrorAppear && inquiryErrorAppear) {
            System.out.println("Success: Error messages works properly while trying to submit without data!");
        } else {
            System.out.println("Fail");
        }

    }
public void InvalidEmailFormatError() {
        driver.findElement(EmailField).sendKeys("asdn@mfdf@");
        String invalidEmail1 = driver.findElement(ProvideValidEmail).getText();
    System.out.println(invalidEmail1);
boolean InvalidEmailError = driver.findElement(ProvideValidEmail).isDisplayed();
if (InvalidEmailError) {
    System.out.println("Success: Error Message works properly!");
}else{
    System.out.println("Fail: Error Message doesn't work properly");
}


}

public void DropdownCheck() {
        driver.findElement(InquiryDropdown).click();
        boolean Opt1Check = driver.findElement(OptSequelHub).isDisplayed();
        boolean Opt2Check = driver.findElement(OptEvents).isDisplayed();
        boolean Opt3Check = driver.findElement(OptSales).isDisplayed();
        boolean Opt4Check = driver.findElement(OptStartups).isDisplayed();
        boolean Opt5Check = driver.findElement(OptRecruitment).isDisplayed();
        boolean Opt6Check = driver.findElement(OptOther).isDisplayed();

        if (Opt1Check&&Opt2Check&&Opt3Check&&Opt4Check&&Opt5Check&&Opt6Check) {
            System.out.println("Success: All elements of dropdown are displayed");
        }else{
            System.out.println("Fail: dropdown elements are not displayed");
        }
}

}
