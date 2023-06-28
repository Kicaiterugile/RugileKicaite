package lt.techin;

import lt.techin.utils.RandomUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LoginAndRegisterPageTest extends BaseTest {

    @Test
    public void testRegisterUserPositiveScenario() {
        LoginPage loginPage = new LoginPage(driver);
        RegisterUserPage registerUserPage = new RegisterUserPage(driver);

        assertEquals("Prisijungimas", driver.getTitle());

        loginPage.registerNewUser();

        assertEquals("Registracija", driver.getTitle());

        String userName = "User" + RandomUtils.randomNumber(4);

        registerUserPage.setUserName(userName);
        registerUserPage.setPassword("User123");
        registerUserPage.setPasswordConfirm("User123");

        registerUserPage.createUser();

        assertEquals("Skaičiuotuvas", driver.getTitle());
    }

    @Test
    public void testRegisterUserNegativeScenario() {
        LoginPage loginPage = new LoginPage(driver);
        RegisterUserPage registerUserPage = new RegisterUserPage(driver);

        assertEquals("Prisijungimas", driver.getTitle());

        loginPage.registerNewUser();

        assertEquals("Registracija", driver.getTitle());

        String userName = "User" + RandomUtils.randomNumber(4);

        registerUserPage.setUserName(userName);
        registerUserPage.setPassword("User123");
        registerUserPage.setPasswordConfirm("User1234");

        registerUserPage.createUser();

        assertTrue(registerUserPage.hasErrors());
    }

    @Test
    public void testLoginPositiveScenario() {
        LoginPage loginPage = new LoginPage(driver);
        RegisterUserPage registerUserPage = new RegisterUserPage(driver);
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        loginPage.registerNewUser();
        String userName = "User" + RandomUtils.randomNumber(6);
        registerUserPage.setUserName(userName);
        registerUserPage.setPassword("User123");
        registerUserPage.setPasswordConfirm("User123");
        registerUserPage.createUser();
        calculatorPage.logout();

        assertEquals("Prisijungimas", driver.getTitle());
        loginPage.setUserName(userName);
        loginPage.setPassword("User123");
        loginPage.login();

        assertEquals("Skaičiuotuvas", driver.getTitle());
    }
    @Test
    public void testLoginNegativeScenario() {
        LoginPage loginPage = new LoginPage(driver);
        RegisterUserPage registerUserPage = new RegisterUserPage(driver);
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        loginPage.registerNewUser();
        String userName = "User" + RandomUtils.randomNumber(6);
        registerUserPage.setUserName(userName);
        registerUserPage.setPassword("User123");
        registerUserPage.setPasswordConfirm("User123");
        registerUserPage.createUser();
        calculatorPage.logout();

        assertEquals("Prisijungimas", driver.getTitle());
        loginPage.setUserName(userName);
        loginPage.setPassword("User1234");
        loginPage.login();

        assertEquals("Prisijungimas", driver.getTitle());

    }
}
