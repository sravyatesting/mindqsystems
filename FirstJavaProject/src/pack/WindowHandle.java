package pack;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandle {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://naukri.com");
		Set<String> ids = driver.getWindowHandles();
		for (String id : ids) {

			driver.switchTo().window(id);
			String title = driver.getTitle();

		}
		if (title.equals("GBT")) {

			driver.close();
		}

	}

}
