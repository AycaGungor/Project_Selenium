import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeOptions;


public class ProductTest {

    WebDriver driver;
    public static String loginUrl = "https://www.trendyol.com/";

    @Test

    public void startWebDriver(){


        //Start Browser
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.trendyol.com/");

        Assert.assertEquals(driver.getTitle(), "trendyol");

        ChromeOptions options = null;
        options.addArguments("--disable-notifications");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();


        WebElement username=driver.findElement(By.id("e-mail"));
        WebElement password=driver.findElement(By.id("password"));
        WebElement login=driver.findElement(By.xpath("//button[text()='loginSubmit']"));
        username.sendKeys("example@gmail.com"); password.sendKeys("password");
        login.click(); String actualUrl="https://www.trendyol.com/";
        String expectedUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl); }   }

        
         @Test


          public void testProductSearch() {
             WebElement searchElement = driver.findElement(By.className("search-box"));
             searchElement.sendKeys("iPhone");
             searchProduct(driver, By.className("search-icon"));

         }

    private void searchProduct(WebDriver driver, By by) {
        driver.findElement(by).click();driver.quit();
    }


        WebElement loginLink = driver.findElement(By.linkText("Login"));

        driver.findElement(By.id("email")).sendKeys("ab@gmail.com");
        driver.findElement(By.id("password")).sendKeys("xxx");
        driver.findElement(By.id("loginbutton")).click();


        // Object Oriented Code
        ProductTest.UserNameInput(driver).sendKeys("ayca");
        ProductTest.PasswordInput(driver).sendKeys("******");
        ProductTest.LoginButton(driver).click();

        driver.quit();

     }

}
