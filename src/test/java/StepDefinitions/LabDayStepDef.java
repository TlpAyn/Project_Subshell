package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class LabDayStepDef {


    DialogContent dc = new DialogContent();
    @Given("Navigate to Subshell HomePages")
    public void navigateToSubshellHomePages() {
        GWD.getDriver().get("https://subshell.com/");
        GWD.getDriver().manage().window().maximize();
    }

    @And("Click About and Lab Day button")
    public void clickAboutAndLabDayButton() {
        dc.clickFunction(dc.aboutButton);
        dc.clickFunction(dc.labDay);

    }

    @Then("user must approve Lab Day image")
    public void userMustApproveLabDayImage() {

        //Assert.assertTrue(dc.labDayFoto.isDisplayed());
      dc.verifyContainsTextFunction(dc.labDayPhotoTextD,"Gewinner");

    }
}
