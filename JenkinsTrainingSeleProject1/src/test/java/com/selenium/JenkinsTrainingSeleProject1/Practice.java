package com.selenium.JenkinsTrainingSeleProject1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice {
  private static final CharSequence KEYS_ENTER = null;

@Test
  public void f() {
	//  WebDriverManager.chromedriver().setup();
	 WebDriver driver=new ChromeDriver();
	 
	 driver.get("https://www.google.com/");
			 
		driver.findElement(By.id("APjFqb")).sendKeys("selenium",Keys.ENTER);
  }

}
