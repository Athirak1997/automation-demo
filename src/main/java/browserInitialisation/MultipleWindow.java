package browserInitialisation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindow {
	public WebDriver driver;
	public void multiplewindowHandling() {
		driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/");
		driver.manage().window().maximize();
	WebElement element=driver.findElement(By.xpath("//h1[text()='CONTACT US']"));
	element.click();
	WebElement element2=driver.findElement(By.xpath("//h1[text()='LOGIN PORTAL']"));
	element2.click();
	String parent=driver.getWindowHandle();
	System.out.println(parent);

	Set<String> allwindow=driver.getWindowHandles();
	String title="";
	for(String allwindows:allwindow) {
		if(!allwindows.equals(parent)) {
			System.out.println(allwindows);
			driver.switchTo().window(allwindows);
			title=driver.getTitle();
			//System.out.println(driver.getTitle());
			
		}
		if(title.equals("WebDriver | Login Portal")) {
			WebElement username=driver.findElement(By.xpath("//input[@type='text']"));
			username.sendKeys("athira");
			WebElement password=driver.findElement(By.id("password"));
			password.sendKeys("123");
			WebElement enter=driver.findElement(By.id("login-button"));
			enter.click();
			
		}
		if(title.equals("WebDriver | Contact Us")) {
			WebElement firstname=driver.findElement(By.xpath("//input[@name='first_name']"));
			firstname.sendKeys("athira");
			WebElement lastname=driver.findElement(By.xpath("//input[@name='last_name']"));
			lastname.sendKeys("krishnan");
			WebElement mailid=driver.findElement(By.xpath("//input[@name='email']"));
			mailid.sendKeys("atjira@gmail.com");
			WebElement comments=driver.findElement(By.xpath("//textarea[@class='feedback-input']"));
			comments.sendKeys("hello");
			WebElement submit=driver.findElement(By.xpath("//input[@type='submit']"));
			submit.click();
		}
	}
	}

	public static void main(String[] args) {
		MultipleWindow multiplewindow=new MultipleWindow();
		multiplewindow.multiplewindowHandling(); 
		

	}

}
