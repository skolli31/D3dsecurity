package d3dCom;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
//        Below syntax is for only particular scenario files which has tags to run
//        (format = {"pretty"},features = "src/test/resources/",glue ="com.stepdefinition",tags={"@Sign_Valid,@Signin_Invalid,@Whyd3dDisplay_header"}
//        Below is to run the whole feature file which has a number of scenarios in it.
        (format = {"pretty"},features = "src/test/resources/",tags={"@Signin_Valid"}


//        (format = {"pretty"},features = "src/test/resources/",glue ="com.stepdefinition",tags={"@Sri"}
//       * In the above step there is no feature file of that particular name or if there is any spelling wrong in the
//         feature files given then the following errors occur
//                None of the features at [src/test/resources/] matched the filters: [@Sri]
//                0 Scenarios
//                0 Steps
//                0m0.000s
)



public class RunCukesTest {
}
