package browserInitialisation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	public WebDriver driver;
	public void frame() {
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		WebElement element1=driver.findElement(By.xpath("//iframe[@id='a077aa5e']"));
		driver.switchTo().frame(element1);
		WebElement element=driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		element.click();
		
	}

	public static void main(String[] args) {
		Frames frames=new Frames();
		frames.frame();

	}

}
