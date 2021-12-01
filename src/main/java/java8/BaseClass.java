package java8;

import org.openqa.selenium.WebDriver;

import static java8.DriverFactory.getDriver;

public class BaseClass {
    protected WebDriver driver;
    public void setDriver(String browserName) {
        driver = getDriver(browserName);
    }
}
