package lt.techin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalculatorPage extends AbstractPage {

    @FindBy(css = "form#logoutForm + a")
    private WebElement logout;

    @FindBy(xpath = "//input[@value='skaičiuoti']")
    private WebElement calculate;

    @FindBy(xpath = "//input[@name='zenklas']")
            private WebElement operatorChose;

    @FindBy (css = "#sk1")
    private WebElement firstNumberToEnter;

    public CalculatorPage(WebDriver driver) {
        super(driver);
    }

    public void logout() {
        logout.click();
    }
    public void calculateSum(){
        calculate.click();
    }
    public void devision(){
        operatorChose.click();
    }
}
