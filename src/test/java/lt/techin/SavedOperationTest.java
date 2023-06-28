package lt.techin;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class SavedOperationTest extends BaseTest {

    @Test
    public void testCalculatorPositiveScenario() {
        LoginPage loginPage = new LoginPage(driver);
        CalculatorPage calculatorPage = new CalculatorPage(driver);
      SavedOperationPage savedOperationPage = new SavedOperationPage(driver);

        loginPage.setUserName("User5089");
        loginPage.setPassword("User123");
        loginPage.login();

        calculatorPage.setNumber1("10");
        calculatorPage.setNumber2("15");
        calculatorPage.setOperation("+");
        calculatorPage.calculate();
        assertEquals("Skaičiuoti", driver.getTitle());

        savedOperationPage.clickOnSavedOperation();
        assertEquals("Skaičiai", driver.getTitle());
        savedOperationPage.getResults();
        assertTrue(savedOperationPage.getResults().contains("25"));

    }

}
