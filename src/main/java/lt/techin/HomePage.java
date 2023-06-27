package lt.techin;

import lt.techin.utils.WaitUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage {
    @FindBy(xpath = "//a[text()='MP3 Players']")
    private WebElement showNavigate;
    @FindBy(xpath = "//a[text()='Show All MP3 Players']")
    private WebElement showAllMP3Links;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void showNavigate() {
        showNavigate.click();
        WaitUtils.waitForJs(driver);
    }
    public void showALLM3() {
        showAllMP3Links.click();
    }

}





