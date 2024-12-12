package browserInitialisation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class InputForm extends Base {
	public void showMessage() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement messageField=driver.findElement(By.id("single-input-field"));
		messageField.sendKeys("hello world");
		WebElement showMessage=driver.findElement(By.id("button-one"));
		showMessage.click();
	}
	
	public static void main(String[] args) {
		InputForm inputform=new InputForm();
		
		inputform.initialisation();
		inputform.showMessage();
	
	
	}

}
