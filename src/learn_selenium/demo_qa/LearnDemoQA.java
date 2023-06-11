package learn_selenium.demo_qa;

import learn_selenium.Browser;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LearnDemoQA {

    static WebDriver driver;
    final String URL = "https://demoqa.com/";

    /*
    Test Case #1
        1. Navigate to application (https://demoqa.com/)
        2. Click on `Elements` button
        3. Click on `Text Box` button
        4. In `Full Name` input field, enter first name and last name
        5. In `Email` input field, enter valid email which includes an @ character
        6. In `Current Address` input field, enter street address
        7. In `Permanent Address` input field, enter street address
        8. Click `Submit` button
        9. Validate the full name, email address, current & permanent address in the output
     */

    @Before
    public void setUp(){
        driver = getDriver(Browser.CHROME);
        WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get(URL);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
    }

    @After
    public void tearDown(){
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void testSubmitContactForm() {
        WebElement elementsButton = driver.findElement(By.xpath("//div[@class='category-cards']/div[1]"));
        elementsButton.click();

        WebElement textBoxButton = driver.findElement(By.xpath("//li[span[contains(text(), 'Text Box')]]"));
        textBoxButton.click();

        String fullName = "Abdullah Noor";
        WebElement fullNameInputField = driver.findElement(By.id("userName"));
        fullNameInputField.sendKeys(fullName);

        String emailAddress = "Abdullah@gmail.com";
        WebElement emailInputField = driver.findElement(By.id("userEmail"));
        emailInputField.sendKeys(emailAddress);

        String address = "555 Main Street, Anywhere USA 10001";
        WebElement currentAddressInputField = driver.findElement(By.id("currentAddress"));
        currentAddressInputField.sendKeys(address);

        WebElement permanentAddressInputField = driver.findElement(By.id("permanentAddress"));
        permanentAddressInputField.sendKeys(address);

        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();

        WebElement resultName = driver.findElement(By.id("name"));
        WebElement resultEmail = driver.findElement(By.id("email"));
        WebElement resultCurrentAddress = driver.findElement(By.xpath("//p[@id='currentAddress']"));
        WebElement resultPermanentAddress = driver.findElement(By.xpath("//p[@id='permanentAddress']"));

        String resultNameText = resultName.getAttribute("innerHTML");
        String resultEmailText = resultEmail.getText();
        String resultCurrentAddressText = resultCurrentAddress.getText();
        String resultPermanentAddressText = resultPermanentAddress.getText();

        Assert.assertEquals(fullName, resultNameText.split(":")[1]);
        Assert.assertEquals(emailAddress, resultEmailText.split(":")[1]);
        Assert.assertEquals(address, resultCurrentAddressText.split(":")[1]);
        Assert.assertEquals(address, resultPermanentAddressText.split(":")[1]);

        // Alternate way to perform this assertion
//        Assert.assertTrue(resultNameText.contains(fullName));
//        Assert.assertTrue(resultEmailText.contains(emailAddress));
//        Assert.assertTrue(resultCurrentAddressText.contains(address));
//        Assert.assertTrue(resultPermanentAddressText.contains(address));

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
