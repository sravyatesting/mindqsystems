package pack;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {

	public WebDriver openBrowser() {

		WebDriver driver = new FirefoxDriver();
		return driver;
	}

	public void openURL(WebDriver driver, String url) {

		driver.get(url);

	}

	public void CloseWindow(WebDriver driver, String titletoclose) {

		Set<String> Windowids = driver.getWindowHandles();
		for (String Windowid : Windowids) {
			driver.switchTo().window(windowid);
			String title = driver.getTitle();
			if (title.contains(titletoclose)) {
				driver.close();

			}
		}
	}

	public static void main(String[] args) {

		Test t = new Test();
		WebDriver driver = t.openBrowser();
		t.openURL(driver, "http://naukri.com");
		t.CloseWindow(driver, "GBT");
	}

}
