package browserInitialisation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop extends Base {
	public void dragdrop() {
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement drag=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		Actions actions=new Actions(driver);
		actions.moveToElement(drag).click();
		actions.doubleClick(drag).perform();
	//	actions.contextClick(drag).perform();
		WebElement drop=driver.findElement(By.id("mydropzone"));
		actions.dragAndDrop(drag, drop).build().perform();
	}
	//draganddrop assignment
public void dragAndDrop() {
	driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
	WebElement drag1=driver.findElement(By.xpath("//span[text()='Draggable n°2']"));
	Actions actions1=new Actions(driver);
	actions1.moveToElement(drag1).click();
	actions1.doubleClick(drag1).perform();
	WebElement drop1=driver.findElement(By.id("mydropzone"));
	actions1.dragAndDrop(drag1, drop1).build().perform();
}

public void dragDrop2() {
	driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
	WebElement drag2=driver.findElement(By.xpath("//span[text()='Draggable n°3']"));
	Actions action2=new Actions(driver);
	action2.moveToElement(drag2).click();
	action2.doubleClick(drag2).perform();
	WebElement drop2=driver.findElement(By.id("mydropzone"));
	action2.dragAndDrop(drag2, drop2).build().perform();
}
public void dragdrop3() {
	driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
	WebElement drag3=driver.findElement(By.xpath("//span[text()='Draggable n°4']"));
	Actions action3=new Actions(driver);
	action3.moveToElement(drag3).click();
	action3.doubleClick(drag3).perform();
	WebElement drop3=driver.findElement(By.id("mydropzone"));
	action3.dragAndDrop(drag3, drop3).build().perform();
}
	public static void main(String[] args) {
		 DragAndDrop drag=new  DragAndDrop();
		 drag.initialisation();
		// drag.dragdrop();
		// drag.dragAndDrop();
		// drag.dragDrop2();
	drag.dragdrop3();

	}

}
