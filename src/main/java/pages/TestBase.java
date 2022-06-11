package pages;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	//WebDriver is an Interface, driver is reference object of an interface //
	public static WebDriver driver;
	
	public static void initDriver() {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(999, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(999, TimeUnit.SECONDS);

	}
	
	public void takeScreenshot(WebDriver driver) {
		TakesScreenshot ts = (TakesScreenshot)driver;
		ts.getScreenshotAs(OutputType.FILE);
		
		SimpleDateFormat formatter = new SimpleDateFormat("MMddyy_Hhmmss");
		Date date = new Date();
		String label = formatter.format(date);

		try {
			FileUtils.copyFile(ts.getScreenshotAs(OutputType.FILE), new File(System.getProperty("user.dir") + "/screnshot/" + System.currentTimeMillis() + ".png"));
		} catch (WebDriverException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}	
		
	}

}
