package com.bridgelabz.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.bridgelabz.base.TestBase;
import org.testng.annotations.Test;

public class WhatsappWebAppTest extends TestBase {
	
    @Test 
	public void Test() throws IOException, InterruptedException {
        System.out.println("testing ");

		//driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div/div[1]/div/label")).click();
  
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div/div[3]/div/div[1]/div/label"))).click();		
		WebElement search = driver.findElement(By.xpath("//input[@title='Search or start new chat']"));
		search.sendKeys("mom" + "\n");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@title='" + "mom" + "']")).click();
		
		WebElement sendMessage = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[4]/div/footer/div[1]/div[2]/div/div[2]"));
		sendMessage.sendKeys("Hi its a just testing msg  \n");
	    // attaching 
		driver.findElement(By.xpath("//div[@title='Attach']")).click();
		
		WebElement uploadElement = driver.findElement(By.xpath("//li[1]//button[1]//input[1]"));
		
		uploadElement.sendKeys("//home//admin106//Documents//image.jpg");
		Thread.sleep(2000);

		driver.findElement(By.cssSelector(
				"body.web:nth-child(2) div._1FKgS.app-wrapper-web.bFqKf div.app._3dqpi.two:nth-child(6) div.MZIyP:nth-child(2) div._3q4NP._1Iexl:nth-child(2) span._2JThb div._2vPAk span._3rsak div._2fq0t._1drQ-.copyable-area div._2sNbV._3ySAH div.NuJ4j:nth-child(1) div._3Mxes div._18KIe div.TI3qN._2Mg6D div.CzI8E div._3F6QL.bsmJe._1ZxJu > div._2S1VP.copyable-text.selectable-text"))
				.click();
		/*
		 * WebElement msg = driver.findElement(By.cssSelector(
		 * "body.web:nth-child(2) div._1FKgS.app-wrapper-web.bFqKf div.app._3dqpi.two:nth-child(6) div.MZIyP:nth-child(2) div._3q4NP._1Iexl:nth-child(2) span._2JThb div._2vPAk span._3rsak div._2fq0t._1drQ-.copyable-area div._2sNbV._3ySAH div.NuJ4j:nth-child(1) div._3Mxes div._18KIe div.TI3qN._2Mg6D div.CzI8E div._3F6QL.bsmJe._1ZxJu > div._2S1VP.copyable-text.selectable-text"
		 * )); msg.sendKeys("Good Night \n");
		 */		Thread.sleep(2000);
	}
     
}
