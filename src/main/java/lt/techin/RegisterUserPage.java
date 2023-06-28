package lt.techin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class RegisterUserPage extends AbstractPage {
    @FindBy(xpath = "//input[@name='username']")
    private WebElement userName;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement password;

    @FindBy(xpath = "//input[@name='passwordConfirm']")
    private WebElement passwordConfirm;

    @FindBy(xpath = "//button[text()='Sukurti']")
    private WebElement createButton;

    @FindBy(xpath = "//span[contains(@id, '.errors')]")
    private List<WebElement> errors;

    public RegisterUserPage(WebDriver driver) {
        super(driver);
    }

    public void setUserName(String userName) {
        this.userName.sendKeys(userName);
    }

    public void setPassword(String password) {
        this.password.sendKeys(password);
    }

    public void setPasswordConfirm(String password) {
        passwordConfirm.sendKeys(password);
    }

    public void createUser() {
        createButton.click();
    }

    public boolean hasErrors() {
        return !errors.isEmpty();
    }
}
