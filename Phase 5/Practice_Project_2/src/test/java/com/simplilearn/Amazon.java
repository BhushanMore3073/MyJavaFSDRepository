package com.simplilearn;

import org.testng.annotations.Test; 

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.support.ui.ExpectedConditions; 
import org.openqa.selenium.support.ui.WebDriverWait; 
import org.testng.annotations.AfterTest; 
import org.testng.annotations.BeforeTest; 
import org.testng.annotations.Test; 
 
//sel->drivers ->generalized->maven->pom.xml 
public class Amazon { 
 WebDriver wd; 
 
 @BeforeTest 
 public void inti() { 
  String driver_path = "C:\\Users\\HP\\Desktop\\assignments_submission\\Phase 5\\Download\\chromedriver.exe"; 
  System.setProperty("webdriver.chrome.driver", driver_path); 
  wd = new ChromeDriver(); 
  wd.manage().window().maximize(); 
 } 
 
 /* 
  * @Test public void test1() { wd.get("https://www.irctc.co.in/"); } 
  */ 
 @Test 
 public void test2() { 
  // Sign In 
  wd.get("https://www.amazon.in"); 
//  wd.findElement(By.id("nav-link-accountList-nav-line-1")).click(); 
//  wd.findElement(By.id("ap_email")).sendKeys("bikkishaw@gmail.com"); 
//  wd.findElement(By.id("continue")).click(); 
//  wd.findElement(By.id("ap_password")).sendKeys("bikki@123"); 
//  wd.findElement(By.id("signInSubmit")).click(); 
  // Search Product 
  wd.findElement(By.id("twotabsearchtextbox")).sendKeys("iPhone13"); 
  wd.findElement(By.id("nav-search-submit-button")).submit(); 
  wd.findElement(By.linkText("Apple iPhone 13 (512GB) - Starlight")).click(); 
 
//  wd.findElement(By.id("a-size-medium a-color-base a-textnormal")).click(); 
//  wd.findElement(By.id("add-to-cart-button")).click(); 
//  wd.findElement(By.linkText("Apple iPhone 13 (512GB) - Starlight")).submit(); 
//  wd.findElement(By.id("nav-cart-count-container")).click(); 
//  wd.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click(); 
//  wd.findElement(By.id("submit.add-to-cart-announce")).click(); 
//  wd.close(); 
   
 } 
 /* 
  * @Test public void test3() { 
  * wd.get("https://mphasis.lms.simplilearn.com/dashboard"); } 
  */ 
 @AfterTest 
 public void closing() { 
//wd.close(); 
 } 
}