package omayo_blogspot_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class Omayoblogspot_selProject 
{
	public static void main(String[] args)throws InterruptedException
	{
		System.setProperty("webdriver.chrom.driver"," D:\\Gautam\\Automation Testing 1\\Browser Extension\\chromedriver.exe");
	    
		//create object WebDriver With ChromeDriver
				
		 WebDriver driver = new ChromeDriver();
				
		//Maximize Window
		 driver.manage().window().maximize();
				
		//URL
		 driver.get("http://omayo.blogspot.com/");
		 Thread.sleep(2000);
		 
		//Scroll
		  //Step1: create object of javascriptExecuter
			JavascriptExecutor js=(JavascriptExecutor)driver;
			      
		//way1: Scrolling using pixel
		    js.executeScript("window.scrollBy(0,300)");
			Thread.sleep(2000);
				      
		//Radio options 
			driver.findElement(By.xpath("//*[@id=\"radio1\"]")).click();
			Thread.sleep(2000);	
			
		//Alert Demo
			driver.findElement(By.xpath("//*[@id=\"alert1\"]")).click();
			Thread.sleep(2000); 
		 
		//Click on Ok Button
	        driver.switchTo().alert().accept();
	     
	    //Get Prompt
			driver.findElement(By.xpath("//*[@id=\"prompt\"]")).click();
			driver.switchTo().alert().accept();
			Thread.sleep(2000); 
			
		//Get Confirmation
			 driver.findElement(By.xpath("//*[@id=\"confirm\"]")).click();
		     Thread.sleep(2000);
		 
		//Click on Ok Button
		     driver.switchTo().alert().accept();
	}

}
