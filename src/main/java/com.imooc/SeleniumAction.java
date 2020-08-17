package com.imooc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAction {

    static WebDriver driver;

    public void InitDriver() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("http://www.imooc.com/user/newlogin");
        Thread.sleep(3000);
    }
    public void InputElement() throws InterruptedException {
        WebElement EmailElement = driver.findElement(By.className("email"));
        //读取提示
        String UserInfo = EmailElement.getAttribute("placeholder");
        EmailElement.clear();
        EmailElement.sendKeys("18806525771");
        driver.findElement(By.name("password")).sendKeys("opoff");
        Thread.sleep(3000);
        System.out.println(UserInfo);
        String Mobile = EmailElement.getAttribute("value");
        System.out.println(Mobile);
        Boolean info = EmailElement.isEnabled();
        System.out.println(info);
        driver.close();
    }

    public static void main(String[] args) throws InterruptedException {
        SeleniumAction one = new SeleniumAction();
        one.InitDriver();
        one.InputElement();

    }
}
