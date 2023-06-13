package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends Parent {
    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//*[@slot='profile'] ")
    public WebElement userBtn;
    @FindBy(xpath = "(//dds-masthead-profile-item[@role='listitem'])[1]")
    public WebElement meineIbm;
    @FindBy(id = "username")
    public WebElement username;
    @FindBy(id = "continue-button")
    public WebElement continueBtn;
    @FindBy(id = "password")
    public WebElement password;
    @FindBy(id = "signinbutton")
    public WebElement signinbutton;
    @FindBy(linkText = "IBMid: talipayan6035@gmail.com")
    public WebElement IbmText;
    @FindBy(xpath = "(//img[@loading='lazy'])[10]")
    public WebElement karriere;
    @FindBy(xpath = "(//a[@class='bx--link bx--link-with-icon bx--link-with-icon--inline-icon bx--link--lg'])[1]")
    public WebElement softwareEngineer;
    @FindBy(linkText = "IBM - das Richtige für dich")
    public WebElement ibmRichtig;
    @FindBy(linkText = "Karrieremöglichkeiten bei IBM entdecken")
    private WebElement karrierMoglichen;
    @FindBy(id = "truste-consent-button")
    private WebElement AlleAkzeptieren;
    @FindBy(xpath = "(//div[@class='bx--card__content CarbonCardCustom_cardContent__uhkFt'])[8]")
    private WebElement softWareTester;


    public WebElement getWebElement(String strButton) {

        switch (strButton) {

            case "softWareTester":
                return softWareTester;
            case "AlleAkzeptieren":
                return AlleAkzeptieren;
            case "karrierMoglichen":
                return karrierMoglichen;
        }
        return null;
    }
}



