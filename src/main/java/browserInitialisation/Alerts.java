package browserInitialisation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Alerts extends Base{
	public void alertsmanage() {
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement element=driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		element.click();
		driver.switchTo().alert().accept();
		WebElement element1=driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
		element1.click();
		driver.switchTo().alert().dismiss();
		WebElement element2=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		element2.click();
		driver.switchTo().alert().sendKeys("athira");
		driver.switchTo().alert().accept();
	}

	public static void main(String[] args) {
		Alerts alerts=new Alerts();
		alerts.initialisation();
		alerts.alertsmanage();

	}

}
