package com.example.demo.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HomePage {
    private static final Logger logger = LoggerFactory.getLogger(HomePage.class);

   // WebDriver driver;
    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver,this);

    }
    @FindBy(xpath = "*//div[@class='FPdoLc lJ9FBc']/center/input[@class='gNO89b']")
    private WebElement googleSearch;

    @FindBy(name ="q" )
    private WebElement searB;

    @FindBy(xpath ="*//textarea[@id='APjFqb']")
    private WebElement textArea;

    public void navigatetoGoogle(WebDriver driver,String engine){
        driver.get(engine);
        driver.findElement(By.xpath("//*[@id=\"L2AGLb\"]")).click();
    }

    public void performAction() throws InterruptedException {
        Thread.sleep(9000);
   //     driver.findElement(By.xpath("*//textarea[@id='APjFqb']")).sendKeys("Tester");
        textArea.sendKeys("Hellow");
        googleSearch.submit();
        logger.info("Hel");
    }

}
