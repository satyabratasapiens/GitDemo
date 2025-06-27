package SeleniumClass;


import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

    public static void main(String[] args) {
        // Optional: Set ChromeDriver path if not set in system PATH
        // System.setProperty("webdriver.chrome.driver", "C:\\D Drive\\Personal\\Learning\\Resources\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver(); // Launch Chrome
        driver.manage().window().maximize(); // Maximize window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Implicit wait

        driver.get("http://ohisnaplinux01:8080/coresuite-zk/login"); // Open URL
        
        System.out.println("Git Practice");

	}

}
