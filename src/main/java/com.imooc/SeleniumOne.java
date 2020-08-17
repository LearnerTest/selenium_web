package com.imooc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumOne {

    WebDriver driver;

    public void InitDriver() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("http://www.imooc.com");
        Thread.sleep(3000);
    }

    public void GetElement(){
        driver.get
    }
    public static void main(String[] args) throws InterruptedException {


    }

}