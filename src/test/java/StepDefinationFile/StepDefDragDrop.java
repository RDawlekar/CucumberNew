package StepDefinationFile;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class StepDefDragDrop {

    @Given("the user is on the index page at {string},Selenium should drag the element whose ID is {string} into the element whose ID is {string} Then should check the contents of {string}")
    public void theUserIsOnTheIndexPageAtInterlink(String interlink,String drgObj,String dropObj,String dropStatusObj) {
        Hooks.driver.get(interlink);
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
          Hooks.driver.switchTo().frame(Hooks.driver.findElement(By.xpath("//iframe[contains(@class,'demo-frame')]")));
          WebElement source=Hooks.driver.findElement(By.xpath("//*[@id='"+drgObj+"']"));
          WebElement destination=Hooks.driver.findElement(By.xpath("//*[@id='"+dropObj+"']"));
          Actions ac=new Actions(Hooks.driver);
          ac.dragAndDrop(source, destination).build().perform();
        WebElement status=Hooks.driver.findElement(By.xpath("//*[@id='"+dropStatusObj+"']"));
        if(status.isDisplayed())
        {
            System.out.println(status.getText());
        }
        else
            System.out.println("no text displayed");

    }

    @Given("sample feature file is ready")
    public void sampleFeatureFileIsReady() {
        System.out.println("in GIven statement");
    }

    @When("I run the feature file")
    public void iRunTheFeatureFile() {
        System.out.println("in When statement");
    }

    @Then("run should be successful")
    public void runShouldBeSuccessful() {
        System.out.println("in Then statement");
    }



    public void theUserIsOnTheIndexPageAtSeleniumShouldDragTheElementWhoseIDIsIntoTheElementWhoseIDIs(String arg0, String arg1, String arg2) {
    }
}
