package objectIdentification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ebay {
	
	public static void main(String[] args) {
		
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://ebay.in");
		driver.findElement(By.id("gh-ac")).sendKeys("Laptops");
		driver.findElement(By.id("gh-btn")).click();
	}

}
