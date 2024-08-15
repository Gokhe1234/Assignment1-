package newAssignment;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverSetup {
	private static WebDriver driver;
	public static  WebDriver getWebDriver() {
		
	
		ChromeOptions option = new ChromeOptions();
		option.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
		driver=new ChromeDriver(option);
		return driver;
		
	}

}
