package com.bridgelabz.testcases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.bridgelabz.base.TestBase;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.Test;

/**
 * @author swati Test to automate whatsappweb application
 */
public class WhatsappWebAppTest {

	@Test
	public void Test() throws IOException, InterruptedException, AWTException {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		Robot r = new Robot();
		driver.get("https://web.whatsapp.com/");
		Thread.sleep(15000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div/div[1]/div/label/input")).click();

		WebElement search = driver.findElement(By.xpath("//input[@title='Search or start new chat']"));
		search.sendKeys("Rima" + "\n");

		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_DOWN);
		// sending message
		WebElement sendMessage = driver
				.findElement(By.xpath("/html/body/div[1]/div/div/div[4]/div/footer/div[1]/div[2]/div/div[2]"));
		sendMessage.sendKeys("Hi its a just testing msg  \n");

		driver.findElement(By.xpath("//div[@title='Attach']")).click();
		// Uploading image
		WebElement uploadElement = driver.findElement(By.xpath("//li[1]//button[1]//input[1]"));
		uploadElement.sendKeys("//home//admin106//Documents//image.jpg");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(
				"/html/body/div[1]/div/div/div[2]/div[2]/span/div/span/div/div/div[2]/div[1]/span/div/div[2]/div/div[3]/div[1]/div[2]"))
				.click();
		WebElement msg = driver.findElement(By.xpath(
				"/html/body/div[1]/div/div/div[2]/div[2]/span/div/span/div/div/div[2]/div[1]/span/div/div[2]/div/div[3]/div[1]/div[2]"));
		msg.sendKeys("image");
		driver.findElement(
				By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/span/div/span/div/div/div[2]/span/div/div/span"))
				.click();
		driver.close();
	}

}
