package resources;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;


public class baseclass {
	public static WebDriver driver;
	public Properties prop;

	public void initializeDriver() throws IOException {

		// This will access the properties file
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir")+"\\src\\main\\java\\resources\\data.properties");
		// Read the file-

		 prop = new Properties();

		prop.load(fis);

		String browserName = prop.getProperty("browser");

		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();

		} else if (browserName.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();

		} else if (browserName.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();

		} else {
			System.out.println("please choose valid browser to run your scripts");
		}

	}
	@BeforeMethod
	public void launchbrowser() throws IOException {
        initializeDriver();
		String url=prop.getProperty("url");
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		}
	
/*	@AfterMethod
	public void quit() {
		driver.quit();
	}
	*/
	 @BeforeTest
	 public void ExtentReport() {
	  extentmanager.setup();
	 }

	 
	 @AfterTest
	 public void endReport() {
	  extentmanager.endReport();
	 }
	//To take the screenshot and store in one folder-
	 public static String screenShot(WebDriver driver, String filename) {
	  String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
	  TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
	  File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
	  //String destination = System.getProperty("user.dir") + "\\ScreenShot\\" + filename + "_" + dateName + ".png";
	  String destination = System.getProperty("E:\\JavaWorkspace\\naveenautomation\\ScreenShot");
	  File finalDestination = new File(destination);
	  try {
	   FileUtils.copyFile(source, finalDestination);
	  } catch (Exception e) {
	   e.getMessage();
	  }
	  return destination;
	 }

	}




