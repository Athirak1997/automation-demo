package browserInitialisation;

public class NavigationCommands extends Base{
public void navigationCommands() {
	driver.navigate().to("https://www.amazon.in/");
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
	
}
	public static void main(String[] args) {
		
NavigationCommands navigation=new NavigationCommands();
navigation.initialisation();
navigation.navigationCommands();

	}

}
