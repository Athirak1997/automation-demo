package browserInitialisation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base{
	public void idLocator() {
		WebElement messageField=driver.findElement(By.id("single-input-field"));
		WebElement messagefield=driver.findElement(By.id("message-one"));
		WebElement messagefields=driver.findElement(By.id("button-one"));
		
	}
public void nameLocator() {
	WebElement element=driver.findElement(By.name("viewport"));
	WebElement element1=driver.findElement(By.name("description"));
	WebElement elementName=driver.findElement(By.name("keywords"));
}
public void classLocator() {
	WebElement elementName=driver.findElement(By.className("mt-5"));
	WebElement element1=driver.findElement(By.className("copyright"));
	WebElement element2=driver.findElement(By.className("list-group list-group-flush"));
}
public void linkTextLocator() {
	WebElement elementname=driver.findElement(By.linkText("form-submit.php"));
	WebElement elementname1=driver.findElement(By.linkText("select-input.php"));
	WebElement elementname2=driver.findElement(By.linkText("ajax-form-submit.php"));
}
public void partialLinkTestLocator() {
	WebElement elementNameee=driver.findElement(By.partialLinkText("form-sub"));
	WebElement elementname=driver.findElement(By.partialLinkText("ajax-form-sub"));
	WebElement elementnameeee=driver.findElement(By.partialLinkText("select-inp"));
}

public void cssSelector() {
	//tag#id
	WebElement elementname=driver.findElement(By.cssSelector("input#single-input-field"));
	WebElement elementname1=driver.findElement(By.cssSelector("input#value-a"));
	WebElement elementname2=driver.findElement(By.cssSelector("div#collapsibleNavbar"));
	
	//tag.class
	WebElement elementName=driver.findElement(By.cssSelector("div.mb-sec"));
	WebElement elementnamee1=driver.findElement(By.cssSelector("button.navbar-toggler"));
	WebElement elementnamee2=driver.findElement(By.cssSelector("a.navbar-brand"));
	//tag[attributetype=attributevalue]
	WebElement elementnames=driver.findElement(By.cssSelector("input[id=single-input-field]"));
	WebElement elementnames1=driver.findElement(By.cssSelector("button[id=button-one]"));
	WebElement elementnames2=driver.findElement(By.cssSelector("input[id=value-a]"));
	
	//tag.class[attributetype=attributevalue]
	WebElement elementsname=driver.findElement(By.cssSelector("input.form-control[id=single-input-field]"));
	WebElement elementnames11=driver.findElement(By.cssSelector("button.navbar-toggler[data-toggle=collapse]"));
	WebElement elementnames12=driver.findElement(By.cssSelector("input.form-control[id=value-a]"));
	///html/body/section/div/div/div[2]/div[1]/div/div[2]/form/button
	     
}
public void xPath() {
	WebElement elementname=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div[2]/form/button"));
	//relative xpath syntax //tagname[@attributetype='attributevalue']
	WebElement elementName=driver.findElement(By.xpath("//button[@class='navbar-toggler']"));
	//dynamic xpath
	WebElement elementname1=driver.findElement(By.xpath("//button[contains(@class,'navbar-toggler')]"));
	WebElement elementname2=driver.findElement(By.xpath("//button[text()='Show Message']"));
	//axes method
	WebElement elemnet=driver.findElement(By.xpath("//a[@href='index.php']//child::img[@alt='logo']"));
	
	WebElement elementname3=driver.findElement(By.xpath("//div[@class='form-group']//parent::form"));
	
	
}


	public static void main(String[] args) {
		

	}

}
