package Home;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Landing {
	
	 public WebDriver driver;
	public Landing(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="email")
	WebElement email;

	@FindBy(id="pass")
	WebElement Password;
	
	@FindBy(css="div[class='_9axz']")
	WebElement pic;
	
	public void login()
	{
		email.sendKeys("sumo@gmail.com");
		Password.sendKeys("Badrinath@3400",Keys.ENTER);
	}
	
	public String verification()
	{
		String text=pic.getText();
		return text;
	}


}
