package com.selenium.class4;

import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


class ShowProperties {
   public static void main(String[] args) {
       System.getProperties().list(System.out);
   }
}


public class Main {
	
	public static String url = "http://166.62.36.207/syntaxpractice/basic-select-dropdown-demo.html";

public static void main(String[] args) throws InterruptedException {
		
	
	    System.out.println(System.getProperty("os.name"));
	
	    if(System.getProperty("os.name").equalsIgnoreCase("Mac OS X")) {
	    	System.setProperty("webdriver.chrome.driver", "driversMAC/chromedriver");
	    } else if (System.getProperty("os.name").equalsIgnoreCase("WINDOWS")) {
	    	//System.setProperty("webdriver.chrome.driver", "Users/Konstantin/Desktop/Development/Selenium/driversWIN/chromedriver");
			//System.setProperty("webdriver.chrome.driver", "driversWIN/chromedriver.exe");
	    } else {
	    	System.out.println("NO Supported:" + System.getProperty("os.name"));
	    }

		
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		System.out.println(driver.getCurrentUrl());
		WebElement daysDD = driver.findElement(By.id("select-demo"));
		Select select = new Select(daysDD);

		select.selectByIndex(2);
		Thread.sleep(1000);
		select.selectByValue("Sunday");
		Thread.sleep(1000);
		select.selectByVisibleText("Monday");
		
		/*
		
		//driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.name("customer.firstName")).sendKeys("Konstantin");
		driver.findElement(By.name("customer.lastName")).sendKeys("Tsypnyatov");
		driver.findElement(By.name("customer.address.street")).sendKeys("3715 Sea Gate Ave");
		driver.findElement(By.name("customer.address.city")).sendKeys("Brooklyn");
		driver.findElement(By.name("customer.address.state")).sendKeys("New York");
		driver.findElement(By.name("customer.address.zipCode")).sendKeys("11224");
		driver.findElement(By.name("customer.phoneNumber")).sendKeys("917-242-5555");
		driver.findElement(By.name("customer.ssn")).sendKeys("123-45-6789");
		driver.findElement(By.name("customer.username")).sendKeys("Kokoko2");
		driver.findElement(By.name("customer.password")).sendKeys("password");
		driver.findElement(By.id("repeatedPassword")).sendKeys("password");
		*/
		//driver.findElement(By.cssSelector("input[value$='Register']")).click();	
		//driver.findElement(By.cssSelector("//input[value$='Register']")).click();
		
		//driver.findElement(By.className("button")).click();
		
		//Thread.sleep(3000);
		//driver.quit();
		
	}
}
