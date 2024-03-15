package rahulshettyacademy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class ExtentReportDemo {
    @Test
    public void initialDemo() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/client/");
        System.out.println("Title: " + driver.getTitle());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


    }
}
