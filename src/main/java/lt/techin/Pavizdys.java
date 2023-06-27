package lt.techin;

import lt.techin.utils.WaitUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.stream.Collectors;

public class Pavizdys extends AbstractPage {
    @FindBy(css = "button#list-view")
    private WebElement listViewButton;

    @FindBy(css = "div.product-layout div.caption a")
    private List<WebElement> productNames;


    public Pavizdys(WebDriver driver) {
        super(driver);
    }

    public void showListView() {
        listViewButton.click();
        WaitUtils.waitForJs(driver);
    }

    public List<String> getAllProducts() {
        return productNames.stream().map(e -> e.getText()).collect(Collectors.toList());
    }

    public void selectProduct(int index) {
        productNames.get(index).click();
    }

}


