package lt.techin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CalculatorTest extends BaseTest {


    @Test
    public void testCalculatorPositiveScenario() {
        LoginPage loginPage = new LoginPage(driver);
        CalculatorPage calculatorPage = new CalculatorPage(driver);

        assertEquals("Prisijungimas", driver.getTitle());
        loginPage.setUserName("User5089");
        loginPage.setPassword("User123");
        loginPage.login();

        calculatorPage.setNumber1("10");
        calculatorPage.setNumber2("15");
        calculatorPage.setOperation("+");
        calculatorPage.calculate();
        assertEquals("Skaičiuoti", driver.getTitle());

    }
    @Test
    public void testCalculatorNegativeScenario() {
        LoginPage loginPage = new LoginPage(driver);
        CalculatorPage calculatorPage = new CalculatorPage(driver);

        assertEquals("Prisijungimas", driver.getTitle());
        loginPage.setUserName("User5089");
        loginPage.setPassword("User123");
        loginPage.login();
        calculatorPage.setNumber1("-1");
        calculatorPage.setNumber2("-1");
        calculatorPage.setOperation("/");
        calculatorPage.calculate();
        assertTrue(calculatorPage.hasErrors());

    }

    }

