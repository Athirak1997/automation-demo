package browserInitialisation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDown extends Base {
	public void drop() {
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement dropdown=driver.findElement(By.id("single-input-field"));
		Select select=new Select(dropdown);
		//select.selectByVisibleText("Red");
		//select.selectByValue("Red");
		select.selectByIndex(2);
	}
public void java() {
	driver.navigate().to("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
	WebElement javadrop=driver.findElement(By.id("dropdowm-menu-1"));
	Select select1=new Select(javadrop);
	select1.selectByIndex(2);
}
	public static void main(String[] args) {
		DropDown droppdown=new DropDown();
		droppdown.initialisation();
		//droppdown.drop();
		droppdown.java();
	}

}
