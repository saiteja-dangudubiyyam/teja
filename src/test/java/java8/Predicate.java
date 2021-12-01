package java8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

public class Predicate extends BaseClass {
    private static final java.util.function.Predicate<WebElement> STARTSWITH= s->s.getText().startsWith("G");
    private static final java.util.function.Predicate<WebElement> CONTAINS= x->x.getText().contains("I");
    private static final java.util.function.Predicate<WebElement> BLANK= y->y.getText().trim().length()== 0;


    @Test
    public void test() {
        setDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.google.co.in/");

    }
    @Test(dataProvider="getData")
    public void test2(java.util.function.Predicate<WebElement> element) {
        List<WebElement> links = driver.findElements(By.tagName("a"));
        links.stream().filter(element).forEach(s->System.out.println(s.getAttribute("href")));

    }
    @DataProvider
    public Object[] getData() {
        return new Object[]{
                STARTSWITH
        };
    }
    @Test
    private void test3() throws InterruptedException {
        Thread.sleep(5000);

        driver.quit();

    }
}
