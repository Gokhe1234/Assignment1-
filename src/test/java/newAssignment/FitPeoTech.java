package newAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;





public class FitPeoTech {
	private static WebDriver driver;


	//driver setup
		public void getDriver() {
			driver=DriverSetup.getWebDriver();
		}
		
		//Open the online shopping 
		public void getUrl() {
			driver.get("https://fitpeo.com/home");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			
		}
		public void revenueCalculaterPage() {
			driver.findElement(By.xpath("//div[contains(text(),'Revenue Calculator')]")).click();

		}
		public void revenueCalculaterSlider() {
			JavascriptExecutor js = (JavascriptExecutor) driver;
//			WebElement slider = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div/span[1]/span[3]"));
//			//WebElement sli = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div/span[1]/span[1]"));
//			js.executeScript("arguments[0].scrollIntoView();", slider);
//			Actions act = new Actions(driver);
//			act.dragAndDropBy(slider, 800, 0);
			
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		    WebElement slider = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div[1]/div[1]/div[2]/div/div/span[1]/span[3]")));
		    js.executeScript("arguments[0].scrollIntoView();", slider);
		    Actions act = new Actions(driver);
			act.dragAndDropBy(slider, 800, 0).build().perform();
			
			
			
		}
		
	
	
	
	
	public static void main(String[] args) {
		
		FitPeoTech automation = new FitPeoTech();
		  automation.getDriver();
		  automation.getUrl();
		  automation.revenueCalculaterPage();

	}

}
