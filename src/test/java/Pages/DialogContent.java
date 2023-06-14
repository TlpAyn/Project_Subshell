package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends Parent {
    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "(//a[@data-toggle='dropdown'])[2]")
    public WebElement aboutButton;
    @FindBy(xpath = "//figcaption[contains(text(),'Gewinner')]")
    public WebElement labDayPhotoTextD;
    @FindBy(linkText = "Lab Day")
    public WebElement labDay;
    @FindBy(linkText = "Team subshell")
    public WebElement subshellTeam;
    @FindBy(xpath = "//h4[text()='Scrum at subshell']")
    private WebElement scrumLink;
    @FindBy(xpath = "//img[@alt='subshell Labcup Winners']")
    private WebElement labDayPhoto;
    @FindBy(xpath = "//figcaption[contains(text(),'Labcup Winners')]")
    private WebElement labDayPhotoText;
    @FindBy(linkText = "Start")
    private WebElement start;




    public WebElement getWebElement(String strButton) {

        switch (strButton) {

            case "scrumLink":
                return scrumLink;
            case "labDayPhotoText":
                return labDayPhotoText;
            case "start":
                return start;
                case "labDayPhoto":
                return labDayPhoto;
        }
        return null;
    }
}



