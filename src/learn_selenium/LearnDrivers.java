package learn_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LearnDrivers {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        String url = "https://www.letskodeit.com/practice";

        driver = getDriver(Browser.CHROME);

        // Implicit Wait
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Explicit Wait object
        WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Fluent Wait object
        FluentWait<WebDriver> fluentWait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);

        driver.manage().deleteAllCookies();
        driver.get(url);
        driver.manage().window().maximize();

        // Explicit Wait
//        WebElement element = explicitWait.until(ExpectedConditions.elementToBeClickable(By.id("bmwradio")));

        // Fluent Wait
        WebElement element = fluentWait.until(ExpectedConditions.elementToBeClickable(By.id("bmwradio")));
//        WebElement element = driver.findElement(By.id("bmwradio"));

        element.click();

        driver.quit();
    }

    private static WebDriver getDriver(Browser browser) {
        switch (browser.BROWSER) {
            case "firefox" -> {
                FirefoxOptions options = new FirefoxOptions();
                options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
                driver = new FirefoxDriver(options);
            }
            case "edge" -> driver = new EdgeDriver();
            case "chrome" -> driver = new ChromeDriver();
        }
        return driver;
    }

}
