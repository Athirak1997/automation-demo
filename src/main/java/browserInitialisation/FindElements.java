package browserInitialisation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FindElements extends Base{
public void finding() {
	driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
	List<WebElement> element1 =driver.findElements(By.xpath("//input[@type='text']"));
	for(WebElement element:element1) {
		element.sendKeys("hello");
	}
}
//find elements assignment
public void checkbox() {
	driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
	List<WebElement> element2=driver.findElements(By.xpath("//input[@class='check-box-list']"));
	for(WebElement element:element2) {
		element.click();
	}

}
	public static void main(String[] args) {
		
		FindElements find=new FindElements();
		find.initialisation();
		//find.finding();
		find.checkbox();

	}

}
