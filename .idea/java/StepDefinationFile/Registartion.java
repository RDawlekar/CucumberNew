package StepDefinationFile;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class Registartion {

    WebDriver driver;

    @Given("the User is on user Registration page")
    public void theUserIsOnUserRegistrationPage() {
        File path = new File(System.getProperty("user.dir") + "\\Resources\\chrome-win64\\chrome-win64\\chromedriver.exe");
        System.setProperty("driver.chrome.driver", path.toString());
        driver = new ChromeDriver();
        driver.get("https://vm-91edda25-0623-4912-b0f6-c05bf361b86d-8000.in-vmprovider.projects.hrcdn.net/login.html");

    }

    @When("user enters valid data on the page")
    public void userEntersValidDataOnThePage() {
        driver.findElement(By.xpath("//*[@id='firstname']")).sendKeys("Ken");
        driver.findElement(By.xpath("//*[@id='lastname']")).sendKeys("Adams");
        driver.findElement(By.xpath("//*[@id='email']")).sendKeys("kenadmas@gmail.com");
        driver.findElement(By.xpath("//*[@id='re-email']")).sendKeys("kenadmas@gmail.com");
        driver.findElement(By.xpath("//*[@id='password']")).sendKeys("ken@2123");
        driver.findElement(By.xpath("//*[@id='dob']")).sendKeys("02-02-2020");
        driver.findElement(By.xpath("//*[@value='Register']")).click();


    }

    @Then("user Registration is successfull.")
    public void userRegistrationIsSuccessfull() {
        if (driver.findElement(By.xpath("//*[@class='msg']")).getText().equals("login successul")) {
            System.out.println("login successfull");
        }
        driver.close();
        driver.quit();
    }

}

