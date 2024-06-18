package Utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GenericUtils {
	WebDriver driver;
	
	public GenericUtils(WebDriver driver)
	{
		this.driver= driver;
	}
	
	public void SwitchToChildWindow()
	{
		Set<String> s1=driver.getWindowHandles();
		Iterator<String> it= s1.iterator();
		String parentWidow=it.next();
		String childwindow=it.next();
		driver.switchTo().window(childwindow);
	}
	
	public void CloseBrowser()
	{
		driver.close();
		driver.quit();
	}
	
	public void SelectByValue(WebElement WELE, String Val)
	{
		Select sel= new Select(WELE);
		sel.selectByValue(Val);
	}

}
