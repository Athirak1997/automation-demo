package browserInitialisation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableHandling extends Base{
	public void fullTable() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement element=driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		System.out.println(element.getText());
	}
	public void rawtable() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement element=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[2]"));
		System.out.println(element.getText());
	}
public void selectParticularElement() {
	driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
	WebElement element=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[3]/td[1]"));
	System.out.println(element.getText());
}
public void columnselect() {
	driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
	List<WebElement> element=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[3]"));
	for(WebElement element1:element) {
		System.out.println(element1.getText());
	}
}
public void checkelement() {
	driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
	String input="61";
	List<WebElement> element=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[4]"));
	for(WebElement element2:element) {
		if(element2.getText().equals(input)) {
			System.out.println(element2.getText());
		}
	}
}
	public static void main(String[] args) {
		
		TableHandling tablehandling=new TableHandling();
		tablehandling.initialisation();
		//tablehandling.fullTable();
		System.out.println("#######");
		//tablehandling.rawtable();
		//System.out.println("#######");
		//tablehandling.selectParticularElement();
		//System.out.println("@@@@@");
//	tablehandling.columnselect();
		//System.out.println("@@@");
	tablehandling.checkelement();
		
	}

}
