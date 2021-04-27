package org.practice;

import java.sql.Date;
import java.sql.Driver;

import org.apache.commons.lang3.time.DateUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice {
	static WebDriver driver;
	@BeforeClass
	public static void browserLaunch() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();

	}
	@AfterClass
	public static void browserClose() {
       driver.quit();

	}
	@Before
	public void before() {
		Date date = new Date(year, month, day)
		System.out.println(date);

	}
	public void after() {
		// TODO Auto-generated method stub

	}
	public void test1() {
		// TODO Auto-generated method stub

	}

}
