package java8;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class DriverFactory {
    public static final Supplier<WebDriver> CHROME=()->{
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    };
    public static final Supplier<WebDriver> FIREFOX=()->{
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
    };

    private static final Map<String, Supplier<WebDriver>> MAP=new HashMap<>();

    static {
        MAP.put("chrome", CHROME);
        MAP.put("edge", FIREFOX);
    }
    public static WebDriver getDriver(String browserName) {
        return MAP.get(browserName).get();
    }
}
