package lt.techin;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;


    @Suite
    @SelectClasses({LoginAndRegisterPageTest.class , CalculatorTest.class})
    public class SuiteTest {
    }

