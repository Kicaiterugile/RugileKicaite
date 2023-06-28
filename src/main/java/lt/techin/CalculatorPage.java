package lt.techin;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CalculatorPage extends AbstractPage {

    @FindBy(css = "form#logoutForm + a")
    private WebElement logout;

    @FindBy(css = "input#sk1")
    private WebElement number1;

    @FindBy(css = "input#sk2")
    private WebElement number2;

    @FindBy(xpath = "//input[@value='skaičiuoti']")
    private WebElement calculate;

    @FindBy(xpath = "//select[@name='zenklas']")
    private WebElement operation;

    public CalculatorPage(WebDriver driver) {
        super(driver);
    }

    public void logout() {
        logout.click();
    }

    public void calculate() {
        calculate.click();
    }

    public void setNumber1(String number1) {
        this.number1.click();
        this.number1.sendKeys(Keys.CONTROL + "a");
        this.number1.sendKeys(number1);
    }

    public void setNumber2(String number2) {
        this.number2.click();
        this.number2.sendKeys(Keys.CONTROL + "a");
        this.number2.sendKeys(number2);
    }

    public void setOperation(String operation) {
        Select select = new Select(this.operation);
        select.selectByValue(operation);
    }
}
