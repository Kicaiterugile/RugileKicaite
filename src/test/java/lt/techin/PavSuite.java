package lt.techin;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({Test.class})//, ClassTwoUnitTest.class})
public class PavSuite {
}
