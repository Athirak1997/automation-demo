package browserInitialisation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Sample extends Base {
	public void java() {
		driver.navigate().to("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement javadrop=driver.findElement(By.id("dropdowm-menu-1"));
		Select select1=new Select(javadrop);
		select1.selectByIndex(2);
	}
	public void dropdown2() {
		driver.navigate().to("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement dropdown2=driver.findElement(By.id("dropdowm-menu-3"));
		Select select2=new Select(dropdown2);
		select2.selectByIndex(3);
		WebElement dropdown3=driver.findElement(By.id("dropdowm-menu-2"));
		Select select3=new Select(dropdown3);
		select3.selectByIndex(1);
		
		
	}
	
public void check() {
	driver.navigate().to("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
	WebElement checkbox=driver.findElement(By.xpath("//input[@value='option-1']"));
	checkbox.click();
	System.out.println(checkbox.isSelected());
}
public void selected() {
	driver.navigate().to("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
	WebElement select=driver.findElement(By.xpath("//input[@value='cabbage']"));
	select.click();
	System.out.println(select.isEnabled());
}
public void option() {
	driver.navigate().to("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
	WebElement element2=driver.findElement(By.xpath("//input[@value='option-2']"));
	System.out.println(element2.isSelected());
}
public void radiobutton() {
	driver.navigate().to("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
	WebElement radio=driver.findElement(By.xpath("//input[@value='blue']"));
	radio.click();
	System.out.println(radio.isSelected());
}
	public static void main(String[] args) {
		Sample sample=new Sample();
		sample.initialisation();
	    sample.java();
		sample.check();
		sample.radiobutton();
		sample.dropdown2();
	    sample.selected();
	    sample.option();
	}

}
