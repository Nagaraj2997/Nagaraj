package org.hotel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hotel {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nagaraju\\eclipse-workspace\\AdactinHotel\\AdactinHotel\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    
    driver.get("https://adactinhotelapp.com/");
    
    WebElement a= driver.findElement(By.id("username"));
    a.sendKeys("Nagaraj");
    WebElement b= driver.findElement(By.id("password"));
    b.sendKeys("nagaraj123");
}
}
