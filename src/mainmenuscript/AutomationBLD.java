package mainmenuscript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;

public class AutomationBLD {
	
	static WebDriver driver;
	static WebElement we;
	static JavascriptExecutor js;
	static OperaOptions options;
	static String projectLocation = System.getProperty("user.dir");
	
	public static void main (String[] args) {

//		setBrowser("Chrome");
//		homePage();
//		driver.close();
		
//		setBrowser("Chrome");
//		menuBar();
//		driver.close();

		setBrowser("Chrome");
		chatBox();
		driver.close();
		
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
	
	public static void homePage() {
		try {
			openBLD();
			driver.findElement(By.cssSelector("#hero > div > div > div > div > div.text-wrapper-mid > a")).click(); //Get Started
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("#app-body > div.container-fluid > div:nth-child(1) > section > div > div:nth-child(1) > section > div.prebuild-section-content > button")).click(); //Starter PC
			Thread.sleep(3000);
			driver.navigate().back();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("#app-body > div.container-fluid > div:nth-child(1) > section > div > div:nth-child(2) > section > div.prebuild-section-content > button")).click(); //Starter PC Plus
			Thread.sleep(3000);
			driver.navigate().back();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("#app-body > div.container-fluid > div:nth-child(1) > section > div > div:nth-child(3) > section > div.prebuild-section-content > button")).click(); //Streaming PC
			Thread.sleep(3000);
			driver.navigate().back();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("#app-body > div.container-fluid > div:nth-child(1) > section > div > div:nth-child(4) > section > div.prebuild-section-content > button")).click(); //Creator PC
			Thread.sleep(3000);
			driver.navigate().back();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("#app-body > div.container-fluid > div:nth-child(3) > div:nth-child(1) > a:nth-child(1) > div > img")).click(); //Equipped To Win - AMD Ryzen
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("#app-body > div.container-fluid > div:nth-child(3) > div:nth-child(1) > a:nth-child(2) > div > img")).click(); //Get Call of Duty: Modern Warfare
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("#app-body > div.container-fluid > div:nth-child(3) > div:nth-child(2) > a:nth-child(1) > div > img")).click(); //Limited Edition PUBG Case
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("#app-body > div.container-fluid > div:nth-child(3) > div:nth-child(2) > a:nth-child(2) > div > img")).click(); //Ninja's Build
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("#app-body > div.container-fluid > div.row.pos-r.bg-white.section-global > div > div > div > div > div.text-wrapper-wide > a")).click(); //Built By Experts, With An Eye For Design
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("#app-body > div.container-fluid > div.row.refurbished-builds-section.bg-green > div > div > div > a")).click(); //Built By Experts, With An Eye For Design
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void runTest() {
		try {
			openBLD();
			driver.findElement(By.xpath("//*[@id=\"hero\"]/div/div/div/div/div[2]/a")).click();
			Thread.sleep(1000);
			driver.navigate().back();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"hero\"]/div/div/div/div/div[2]/a")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"game-0\"]/img")).click();
			driver.findElement(By.xpath("//*[@id=\"game-1\"]/img")).click();
			driver.findElement(By.xpath("//*[@id=\"game-2\"]/img")).click();
			driver.findElement(By.xpath("//*[@id=\"link-step2\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"price1\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"parts-select-modal\"]/div/div/div[2]/div/div[2]/div")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"nextArrow\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"app-body\"]/div[2]/div[1]/div/div/div[2]/div[2]/div/div/div[2]/div/div/div/div[2]/div[2]/div[2]/a[1]")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//*[@id=\"app-body\"]/div[2]/div[1]/div/div[1]/div[1]/div/div/ul[2]/li/a")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"overlay-checkout-btn\"]")).click();	
			Thread.sleep(6000);
			we = driver.findElement(By.xpath("//*[@id=\"checkout_email\"]"));
			we.sendKeys("eric.lam@nzxt.com");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void menuBar() {
		try {
			openBLD();
			js = (JavascriptExecutor) driver;
			driver.findElement(By.cssSelector("#collapse-bar > ul.nav.navbar-nav.navbar-left > li:nth-child(1) > a")).click();//What is BLD
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("#app-body > div.container-fluid > div.row.service-package.section-global > div > div > div > div > div.text-wrapper-mid > a")).click();
			Thread.sleep(1000);
			driver.navigate().back();
			Thread.sleep(1000);
			preBuilt("#collapse-bar > ul.nav.navbar-nav.navbar-left > li:nth-child(2) > a", true, true, true, false);
			preBuilt("#collapse-bar > ul.nav.navbar-nav.navbar-left > li:nth-child(3) > a", true, false, true, false);
			preBuilt("#collapse-bar > ul > li:nth-child(4) > a", false, false, true, true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void preBuilt(String cssSelect, boolean reviews, boolean model, boolean color, boolean storage) {
		try {
			js = (JavascriptExecutor) driver;
			driver.findElement(By.cssSelector(cssSelect)).click();//Goes to desired pre-built page
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"app-body\"]/div[2]/section[1]/div/div/div[2]/div/div[2]/div/div[2]/div/img")).click();//Gallery 2
			Thread.sleep(000);
			driver.findElement(By.xpath("//*[@id=\"app-body\"]/div[2]/section[1]/div/div/div[2]/div/div[2]/div/div[3]/div/img")).click();//Gallery 3
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"app-body\"]/div[2]/section[1]/div/div/div[2]/div/div[2]/div/div[4]/div/img")).click();//Gallery 4
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"app-body\"]/div[2]/section[1]/div/div/div[2]/div/div[2]/div/div[5]/div/img")).click();//Gallery 5
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"app-body\"]/div[2]/section[1]/div/div/div[2]/div/div[2]/div/div[6]/div/img")).click();//Gallery 6
			Thread.sleep(1000);		
			if (reviews) { //Click on Reviews if available
				driver.findElement(By.cssSelector("#app-body > div.starter-pc > section.starter-pc-hero-section > div > div > div:nth-child(1) > div > div.starter-pc-review > a")).click(); //Clicks on reviews
				Thread.sleep(2000);
				js.executeScript("window.scrollTo(0, 0)");
				Thread.sleep(2000);
			}		
			if (model) { //Go through model functions if available
				driver.findElement(By.cssSelector("#app-body > div.starter-pc > section.starter-pc-hero-section > div > div > div:nth-child(1) > div > div.model-picker-container > a")).click(); //See Specs
				Thread.sleep(2000);
				js.executeScript("window.scrollTo(0, 0)");
				Thread.sleep(2000);
				driver.findElement(By.cssSelector("#app-body > div.starter-pc > section.starter-pc-hero-section > div > div > div:nth-child(1) > div > div.model-picker-container > div > div:nth-child(2)")).click();
				Thread.sleep(1000);
				driver.findElement(By.cssSelector("#app-body > div.starter-pc > section.starter-pc-hero-section > div > div > div:nth-child(1) > div > div.model-picker-container > div > div:nth-child(1)")).click();
				Thread.sleep(1000);
			}
			if (color) { //Go through color functions if available
				if (!model) { //Go through this portion if model doesn't exist and color does
					driver.findElement(By.cssSelector("#app-body > div.starter-pc > section.starter-pc-hero-section > div > div > div:nth-child(1) > div > div.color-picker-hero > div.color-picker-heading > a")).click();
					Thread.sleep(2000);
					js.executeScript("window.scrollTo(0, 0)");
					Thread.sleep(2000);
				}
				driver.findElement(By.cssSelector("#app-body > div.starter-pc > section.starter-pc-hero-section > div > div > div:nth-child(1) > div > div.color-picker-hero > div.color-picker > div:nth-child(2)")).click();
				Thread.sleep(1000);
				driver.findElement(By.cssSelector("#app-body > div.starter-pc > section.starter-pc-hero-section > div > div > div:nth-child(1) > div > div.color-picker-hero > div.color-picker > div:nth-child(1)")).click();
				Thread.sleep(1000);
			}
			if (storage) { //Go through storage functions if available
				driver.findElement(By.cssSelector("#app-body > div.starter-pc > section.starter-pc-hero-section > div > div > div:nth-child(1) > div > div:nth-child(4) > div.hard-drive-select-heading > a")).click();
				Thread.sleep(2000);
				js.executeScript("window.scrollTo(0, 0)");
				Thread.sleep(2000);
				driver.findElement(By.cssSelector("#app-body > div.starter-pc > section.starter-pc-hero-section > div > div > div:nth-child(1) > div > div:nth-child(4) > div.hard-drive-select > div > div.multiselect__tags > span")).click();
				Thread.sleep(1000);
				driver.findElement(By.cssSelector("#app-body > div.starter-pc > section.starter-pc-hero-section > div > div > div:nth-child(1) > div > div:nth-child(4) > div.hard-drive-select > div > div.multiselect__content-wrapper > ul > li:nth-child(2) > span > span")).click();
				Thread.sleep(1000);
				driver.findElement(By.cssSelector("#app-body > div.starter-pc > section.starter-pc-hero-section > div > div > div:nth-child(1) > div > div:nth-child(4) > div.hard-drive-select > div > div.multiselect__tags > span")).click();
				Thread.sleep(1000);
				driver.findElement(By.cssSelector("#app-body > div.starter-pc > section.starter-pc-hero-section > div > div > div:nth-child(1) > div > div:nth-child(4) > div.hard-drive-select > div > div.multiselect__content-wrapper > ul > li:nth-child(3) > span > span")).click();
				Thread.sleep(1000);
				driver.findElement(By.cssSelector("#app-body > div.starter-pc > section.starter-pc-hero-section > div > div > div:nth-child(1) > div > div:nth-child(4) > div.hard-drive-select > div > div.multiselect__tags > span")).click();
				Thread.sleep(1000);
				driver.findElement(By.cssSelector("#app-body > div.starter-pc > section.starter-pc-hero-section > div > div > div:nth-child(1) > div > div:nth-child(4) > div.hard-drive-select > div > div.multiselect__content-wrapper > ul > li:nth-child(1) > span > span")).click();
				Thread.sleep(1000);
			}
			driver.findElement(By.cssSelector("#app-body > div.starter-pc > section.starter-pc-hero-section > div > div > div:nth-child(1) > div > button")).click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			js.executeScript("window.scrollTo(0, 0)");
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void chatBox() {
		try {
			js = (JavascriptExecutor) driver;
			openBLD();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("#launcher")).click();
			Thread.sleep(2000);
//			js.executeScript("arguments[0].click();", driver.findElement(By.cssSelector("#Embed > div > div > div > div > div > div.sc-bwzfXH.khlUqR > div > button")));
//			driver.findElement(By.cssSelector("#Embed > div > div > div > div > div > div.sc-bwzfXH.khlUqR > div > button")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void openBLD() {
		try {
			driver.manage().window().maximize();
			driver.get("https://www.letsbld.com/");
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}