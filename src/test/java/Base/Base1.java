package Base;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Home.Landing;
import My.Scratch.LandingTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base1 {
	
	protected WebDriver driver;
	public WebDriver initializeDriver() throws IOException 
	{
		Properties prop= new Properties();
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\My\\Scratch\\Main.properties");
		prop.load(file);
		String browserName=prop.getProperty("browser");
		
		if (browserName.contains("chrome")) {
			driver=new ChromeDriver();
		} else if (browserName.contains("firefox")) {
			driver=new FirefoxDriver();
		} else if (browserName.contains("edge")) {
			driver= new EdgeDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		return driver;
	}
	
	public WebDriver getDriver() throws IOException
	{
		return initializeDriver();
	}
	@BeforeMethod
	public void goTo() throws IOException
	{
		driver=getDriver();
		driver.get("https://www.facebook.com/login/");
    }
	
	@AfterMethod
	public void close()
	{
		driver.close();
	}
}
