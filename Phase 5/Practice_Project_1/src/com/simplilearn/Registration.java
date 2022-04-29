package com.simplilearn; 
 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.chrome.ChromeDriver; 
 
public class Registration { 
 
  
 public static void main(String[] args) { 
  String path= "C:\\Users\\HP\\Desktop\\assignments_submission\\Phase 5\\Download\\chromedriver.exe"; 
  System.setProperty("webdriver.chrome.driver",path); 
   
  ///initiate the driver 
  WebDriver driver= new ChromeDriver(); 
  ///step:2 base url 
  String base_url= "https://www.shine.com/registration/parser/"; 
  ///step:3 launching shine.com 
  driver.get(base_url); 
   
  WebElement name = driver.findElement(By.id("id_name")); 
  name.sendKeys("Bhusahn More"); 
   
  WebElement email = driver.findElement(By.id("id_email")); 
  email.sendKeys("bhushan123456@gmail.com"); 
   
  WebElement cell = driver.findElement(By.id("id_cell_phone")); 
  cell.sendKeys("9457837583"); 
   
  WebElement pass = driver.findElement(By.id("id_password")); 
  pass.sendKeys("Bhushan123@"); 
   
  WebElement register = driver.findElement(By.id("registerButton")); 
  register.click(); 
 
 } 
}