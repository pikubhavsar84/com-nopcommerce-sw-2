package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Check extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        // Find login link and click on login link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
//Find username  locator by id provide value by sendskeys
        WebElement userName = driver.findElement(By.id("Email"));
        userName.sendKeys("steve111@gmail.com");
        // Find password locator by name, provide value by sendkeys
        WebElement userPassWord = driver.findElement(By.className("Password"));
        userPassWord.sendKeys("steve111");
        //
        WebElement userLogIn = driver.findElement(By.xpath("//button[@class='button-1 login-button']"));
        userLogIn.click();

        WebElement userLogOut = driver.findElement(By.className("ico-logout"));

        Assert.assertEquals("text not display", "Log out", userLogOut.getText());
    }

}
