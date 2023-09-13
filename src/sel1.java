import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sel1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","/Documents/chromedriver.exe");
            WebDriver driver= new ChromeDriver();
            driver.get("https://rahulshettyacademy.com");
            System.out.println(driver.getTitle());
            System.out.println(driver.getCurrentUrl());
            System.out.println("hello");
            
            System.out.println("hi");
            System.out.println("hij");
            System.out.println("hjhgi");
            System.out.println("hmmmjhgi");
	}

}
