package pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser{
	
	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.get("http://hwww.naukri.com");
		
		
	}
	
	
}



