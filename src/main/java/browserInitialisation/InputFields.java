package browserInitialisation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class InputFields extends Base {
	public void enterInput() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement inputfield1=driver.findElement(By.id("value-a"));
		inputfield1.sendKeys("20");
		WebElement inputfield2=driver.findElement(By.id("value-b"));
		inputfield2.sendKeys("10");
		WebElement getTotal=driver.findElement(By.id("button-two"));
		getTotal.click();
		
	}

	public static void main(String[] args) {
		InputFields inputFields=new InputFields()	;
		inputFields.initialisation(); 
		inputFields.enterInput();
		
	}

}
