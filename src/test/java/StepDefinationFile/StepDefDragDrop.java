package StepDefinationFile;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class StepDefDragDrop {

  @Given("the user is on the index page at {string}")
    public void theUserIsOnTheIndexPage(String url) {
            Hooks.driver.get(url);
    }

    @When("selenium should drag the element whose ID is draggable into the element whose ID is droppable")
    public void seleniumShouldDragTheElementWhoseIDIsDraggableIntoTheElementWhoseIDIsDroppable() {


//        Hooks.driver.switchTo().frame(Hooks.driver.findElement(By.xpath("//iframe[contains(@src,'test.html')]")));
        Hooks.driver.switchTo().frame(Hooks.driver.findElement(By.xpath("//iframe[contains(@class,'demo-frame')]")));
        WebElement source=Hooks.driver.findElement(By.xpath("//*[@id='draggable']"));
        WebElement destination=Hooks.driver.findElement(By.xpath("//*[@id='droppable']"));
        Actions ac=new Actions(Hooks.driver);
        ac.dragAndDrop(source, destination).build().perform();
    }

    @Then("should check the contents of drop-status")
    public void shouldCheckTheContentsOfDropStatus() {
        WebElement status=Hooks.driver.findElement(By.xpath("//*[@id='droppable']"));
        if(status.isDisplayed())
        {
            System.out.println(status.getAttribute("text"));
        }
        else
            System.out.println("no text displayed");
    }
    @Then("selenium should drag the element whose ID is draggable into the element whose ID is droppable should check the contents of drop-status")
    public void seleniumShouldDragTheElementWhoseIDIsDraggableIntoTheElementWhoseIDIsDroppableShouldCheckTheContentsOfDropStatus() {
        Hooks.driver.switchTo().frame(Hooks.driver.findElement(By.xpath("//iframe[contains(@class,'demo-frame')]")));
        WebElement source=Hooks.driver.findElement(By.xpath("//*[@id='draggable']"));
        WebElement destination=Hooks.driver.findElement(By.xpath("//*[@id='droppable']"));
        Actions ac=new Actions(Hooks.driver);
        ac.dragAndDrop(source, destination).build().perform();
        WebElement status=Hooks.driver.findElement(By.xpath("//*[@id='droppable']"));
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
}
