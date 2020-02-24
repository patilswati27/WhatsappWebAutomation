package com.bridgelabz.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TestBase {

    protected WebDriver driver;
	public static WebDriverWait wait;
	

	@BeforeTest
	public void setup() throws IOException {
		if (driver == null) {
			Properties config = new Properties();
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir")
					+ "//src//test//java//com//bridgelabz//properties//config.properties");
			config.load(fis);

			if (config.getProperty("browser").equals("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();

			} else if (config.getProperty("browser").equals("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			}

			driver.get(config.getProperty("testsiteurl"));
			// log.info("Navigated to: " + config.getProperty("testsiteurl"));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("implicit.wait")),
					TimeUnit.SECONDS);
			
		}
		/*
		 * try { br = new BufferedReader(new FileReader(csvFile));
		 * 
		 * } catch (FileNotFoundException e) { e.printStackTrace(); }
		 */
	}

}