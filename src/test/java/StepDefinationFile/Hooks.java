package StepDefinationFile;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class Hooks {
    public static WebDriver driver;
    @Before
    public void setupDriver()
    {
        File path = new File(System.getProperty("user.dir") + "\\Resources\\chrome-win64\\chrome-win64\\chromedriver.exe");
        System.setProperty("driver.chrome.driver", path.toString());
        driver = new ChromeDriver();
    }
    @After
    public void closeDriver()
    {
        driver.close();
        driver.quit();
    }
}
