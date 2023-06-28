package lt.techin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractPage {

    @FindBy(xpath = "//input[@name='username']")
    private WebElement userName;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement password;

    @FindBy(xpath = "//button[text()='Prisijungti']")
    private WebElement loginButton;

    @FindBy(xpath = "//a[@href='/registruoti']")
    private WebElement registerNewUserLink;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void setUserName(String userName) {
        this.userName.sendKeys(userName);
    }

    public void setPassword(String password) {
        this.password.sendKeys(password);
    }

    public void registerNewUser() {
        registerNewUserLink.click();
    }

    public void login() {
        loginButton.click();
    }
}
