import OrangeHm.BaseMain;
import cucumber.api.java.After;
import cucumber.api.java.Before;


import java.io.IOException;

/**
 * Created by SHRADHA on 01/08/2017.
 */
public class Hooks {

    BaseMain baseMain = new BaseMain();

    @Before
    public void setUp() throws Throwable {
        baseMain.openbrowser();
    }

    @After
    public void teardown() {
        baseMain.closeBrowser();
    }
}
