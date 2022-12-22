package My.Scratch;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.Base1;
import Home.Landing;

public class LandingTest extends Base1{
	Landing l;
	@Test
	public void userLogin() throws IOException
	{
		driver=getDriver();
		l=new Landing(driver);
		l.login();
	}
	
	/*@Test
	public void validation() throws IOException
	{
		driver=getDriver();
		String word=l.verification();
		Assert.assertEquals(word,"Log in to Facebook");
		
	}*/
	
	

}
