package com.imooc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SeleniumOne {

    WebDriver driver;

    public void InitDriver() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("http://www.imooc.com");
        Thread.sleep(3000);
    }

    public void GetElement() throws InterruptedException {
        driver.findElement(By.id("js-signin-btn")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("email")).sendKeys("18806525771");
        driver.findElement(By.className("js-loginPassword")).sendKeys("ljfe119900701");
        //层级定位
        WebElement NodeElement = driver.findElement(By.className("rlf-autoin"));
        NodeElement.findElement(By.tagName("input")).click();
        //list定位
        List<WebElement> ButtonElement = driver.findElements(By.className("rlf-group"));
        ButtonElement.get(4).click();
        driver.findElement(By.linkText("找回密码")).click();
        driver.findElement(By.partialLinkText("无法登录")).click();
        driver.findElement(By.xpath("//*[@id=\"signin\"]/div[3]/div[1]/span")).click();
        //通过css
        driver.findElement(By.cssSelector("#signup-form > div.rlf-group.pr.phoneVerityBox > p.reSend.pa.active.js-phonecode-box > span")).click();
        Thread.sleep(3000);
        driver.close();
    }
    public static void main(String[] args) throws InterruptedException {
        SeleniumOne one = new SeleniumOne();
        one.InitDriver();
        one.GetElement();
    }

}