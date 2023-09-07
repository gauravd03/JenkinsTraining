package com.selenium.JenkinsTrainingSeleProject1;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class  Assesment2_QUe2_sele {
	
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  driver=new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  Thread.sleep(3000);
	  String actualtitle = "OrangeHRM";
	  String expectedtitle = driver.getTitle(); 
	  assert expectedtitle.equals(actualtitle):"login page is not loaded";
  }
  
  
  @Test(dependsOnMethods = { "f" })
  	public void logout() throws Exception {
	  //Login
      WebElement username =driver.findElement(
      By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
      username.sendKeys("Admin");
      WebElement pass =driver.findElement(
      By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
      pass.sendKeys("admin123");
       WebElement login =driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
       login.click();
       
       //Wait
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
       
       // Log out 
       driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/img")).click();
       Thread.sleep(3000);
       driver.findElement(By.xpath("//*[contains(@href,'/web/index.php/auth/logout')]")).click();
 	  Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

  }
  
  
}
