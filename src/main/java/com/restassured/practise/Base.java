package com.restassured.practise;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {
    static WebDriver driver;
    public static WebDriver getDriver(String browser) {


        if(browser.equals("chrome")){
            System.setProperty("webdriver.chrome.driver",
                    "C:/Users/Saiteja_Dangudubiyya/Downloads/chromedriver_win32.exe");
            driver = new ChromeDriver();
        }else if(browser.equals("ie")){
            System.setProperty("webdriver.ie.driver",
                    "C:\\Users\\Saiteja_Dangudubiyya\\Downloads\\IEDriverServer_Win32_3.150.2.exe");
            driver = new InternetExplorerDriver();}

        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        return driver;
    }}
