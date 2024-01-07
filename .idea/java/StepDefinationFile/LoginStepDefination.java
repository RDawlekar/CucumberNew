package StepDefinationFile;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class LoginStepDefination {

    WebDriver driver;


    @Given("the User is on user login page")
    public void launchlogin() {
        File path = new File(System.getProperty("user.dir") + "\\Resources\\chrome-win64\\chrome-win64\\chromedriver.exe");
        System.setProperty("driver.chrome.driver", path.toString());
        driver = new ChromeDriver();
        driver.get("https://vm-cdcf476b-22ff-4b6b-a401-b724d4964ac1-8000.in-vmprovider.projects.hrcdn.net/login.html");
    }

    @When("the user enters the email as {string} and password as {string}")
    public void launchlogin(String username, String pwd) {
        driver.findElement(By.xpath("//*[@id='email']")).sendKeys(username);
        driver.findElement(By.xpath("//*[@id='password']")).sendKeys(pwd);
        driver.findElement(By.xpath("//*[@value='Login']")).click();
    }

    @Then("Login is successfully")
    public void loginSuccess() {
        if (driver.findElement(By.xpath("//*[@value='login successul']")).getText().equals("login successul")) {
            System.out.println("login successfull");
        }
        driver.close();
        driver.quit();
    }
}


