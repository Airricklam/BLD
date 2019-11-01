package testfps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;

public class AutomationFPS {
	
	static WebDriver driver;
	static WebElement we;
	static OperaOptions options;
	static JavascriptExecutor js;
	static String projectLocation = System.getProperty("user.dir");
	
	public static void main (String[] args) {
		try {
			setBrowser("Chrome");
			driver.manage().window().maximize();
			driver.get("https://www.letsbld.com/bld/step4?price=1000&draft=8989477152");
			Thread.sleep(3000);
//			Method for Intel CPU
			js = (JavascriptExecutor) driver;
			driver.findElement(By.cssSelector("#psu-tab-button")).click(); //Go to PSU tab
			Thread.sleep(3000);
			driver.findElement(By.cssSelector("#single-button > a")); //Select Best PSU to avoid pop-up message
			Thread.sleep(3000);
			js.executeScript("arguments[0].click();", driver.findElement(By.cssSelector("#single-button > a"))); //Select Best PSU to avoid pop-up message
			Thread.sleep(3000);
			driver.findElement(By.cssSelector("#configure-tabs > li:nth-child(6) > a")).click(); //Go to CPU tab
			Thread.sleep(3000);
			js.executeScript("arguments[0].click();", driver.findElement(By.cssSelector("#single-button > a"))); //Select 1st cpu
			Thread.sleep(3000);
			driver.findElement(By.cssSelector("#gpu-tab-button")).click(); //Go to GPU tab
			Thread.sleep(3000);
			js.executeScript("arguments[0].click();", driver.findElement(By.cssSelector("#double-select-button > a")));
//			driver.findElement(By.cssSelector("#hero > div > div > div > div > div.text-wrapper-mid > a")).click();
//			for (int i = 0; i < 21; i = (i + 3)) {
//				System.out.println(i);
//				Thread.sleep(2000);
//				driver.findElement(By.xpath("//*[@id=\"game-0\"]/img")).click();
//				Thread.sleep(2000);
//				driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[1]/div[2]/div/div[1]/div[1]/div/div[" + i+1 + "]/a/img")).click();
//				Thread.sleep(2000);
//				driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[1]/div[2]/div/div[1]/div[1]/div/div[" + i+2 + "]/a/img")).click();
//				Thread.sleep(1000);
//				driver.findElement(By.xpath("//*[@id=\"link-step2\"]")).click();
//				Thread.sleep(1000);
//				driver.navigate().back();
//			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void setBrowser(String browser) {
		if (browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver" , projectLocation + "/libs/chromedriver/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (browser.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", projectLocation + "/libs/geckodriver/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if (browser.equals("Opera")) {
			options = new OperaOptions();
	        options.setBinary("C:\\Users\\Eric\\AppData\\Local\\Programs\\Opera\\64.0.3417.73\\opera.exe"); //Set binary path to executable. Varies from machine
			System.setProperty("webdriver.opera.driver", projectLocation + "/libs/operadriver/operadriver.exe");
			driver = new OperaDriver(options); //Pass binary path as an argument
		}
		else {
			System.out.println("Invalid browser argument.");
			System.exit(0);
		}
	}
	
	public static void compareFPS() {
		
	}
}