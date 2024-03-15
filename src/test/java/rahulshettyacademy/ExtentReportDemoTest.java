package rahulshettyacademy;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class ExtentReportDemoTest {
    @BeforeTest
    public void config() {
        //we nee from two classes. They are very helpful
        //ExtentReports and ExtentSparkReporter
        String path = System.getProperty("user.dir") + "\\reports\\index.htmo";
        ExtentSparkReporter reporter = new ExtentSparkReporter(path);
    }
    @Test
    public void initialDemo() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/client/");
        System.out.println("Title: " + driver.getTitle());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


    }
}
