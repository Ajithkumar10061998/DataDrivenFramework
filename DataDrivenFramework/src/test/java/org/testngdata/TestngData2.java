package org.testngdata;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestngData2 {
	@Parameters({"userName","password"})
		@Test
		private void tc102(String s1,String s2) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions ops = new ChromeOptions();
			ops.addArguments("--remote-allow-origins=*");
			WebDriver driver = new ChromeDriver(ops);
			driver.get("https://adactinhotelapp.com/");
			driver.findElement(By.id("username")).sendKeys(s1);
			driver.findElement(By.id("password")).sendKeys(s2);
		    driver.findElement(By.name("login")).click();
			driver.quit();

		}
}
