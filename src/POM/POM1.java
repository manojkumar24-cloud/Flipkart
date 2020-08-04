package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM1 {
	
	@FindBy(xpath="//input[@class='_2zrpKA _1dBPDZ']")
	private WebElement em;
	@FindBy(xpath="//input[@class='_2zrpKA _3v41xv _1dBPDZ']")
	private WebElement en;
	@FindBy(xpath="//button[@class='_2AkmmA _1LctnI _7UHT_c']")
	private WebElement es;
	
	public POM1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void email(String a)
	{
		em.sendKeys(a);
	}
	public void password(String b)
	{
		en.sendKeys(b);
	}
	public void enter()
	{
		es.click();
	}

}
