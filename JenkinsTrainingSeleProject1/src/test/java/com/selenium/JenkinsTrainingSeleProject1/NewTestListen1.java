package com.selenium.JenkinsTrainingSeleProject1;

import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import org.testng.annotations.AfterMethod;

 

public class NewTestListen1 {
	WebDriver driver;

  @Test
  public void f() {
	  driver.findElement(By.name("q")).sendKeys("Selenium",Keys.ENTER);
	  Assert.assertEquals(driver.getTitle(), "Selenium - Google Search");
  }

  @BeforeMethod
  public void beforeMethod() {
	  driver = new ChromeDriver();
	  driver.get("https://google.com");
  }

 

  @AfterMethod

  public void afterMethod() {
	  driver.quit();
  }

 

}
