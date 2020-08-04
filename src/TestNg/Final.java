package TestNg;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Generic.*;
import POM.*;

public class Final extends Generic1 {

	@Test
	public void executeclass()
	{
		POM1 pc=new POM1(driver);
		pc.email("manojshet496@gmail.com");
		pc.password("9740188496@m");
		pc.enter();
		
		
		
	}

}
