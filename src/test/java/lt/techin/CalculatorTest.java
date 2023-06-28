package lt.techin;

import lt.techin.utils.RandomUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest extends BaseTest {


    @Test
    public void testCalculatorPositiveScenario() {
        LoginPage loginPage = new LoginPage(driver);
        CalculatorPage calculatorPage = new CalculatorPage(driver);

        assertEquals("Prisijungimas", driver.getTitle());
        loginPage.setUserName("User5089");
        loginPage.setPassword("User123");
        loginPage.login();

        calculatorPage.calculateSum();
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


        calculatorPage.calculateSum();
        assertEquals("Skaičiuoti", driver.getTitle());
    }

    }

