package lt.techin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.stream.Collectors;

public class SavedOperationPage extends AbstractPage{

    @FindBy(xpath = "//a[@href='/skaiciai']")
    private WebElement savedOperation;

    @FindBy(css="table tbody tr td:nth-child(4)")
    private List<WebElement> resultsColumn;


    public SavedOperationPage(WebDriver driver) {
        super(driver);
    }
    public void clickOnSavedOperation() {
        savedOperation.click();
    }

    public List<String> getResults() {
        return resultsColumn.stream().map(e -> e.getText()).collect(Collectors.toList());
    }


}
