package GoogleTestFramework;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class LoadFirefoxDriver {
    protected WebDriver driver;

    @BeforeMethod
    public void runPreconditions(){
        System.setProperty("webdriver.gecko.driver", "C:\\Repo\\test-vm\\dealerportal\\firefox\\geckodriver.exe");
    driver=new FirefoxDriver();
    driver.manage().deleteAllCookies();
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    driver.manage().window().maximize();
    driver.get("https://www.google.com/en");
    }
    @AfterMethod
    public void runPostConditions() {
        driver.close();
    }
}
