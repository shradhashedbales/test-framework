package OrangeHm;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

//import static jdk.nashorn.internal.runtime.PropertyHashMap.findElement;
import static org.junit.Assert.assertTrue;

/**
 * Created by SHRADHA on 01/08/2017.
 */
public class LoginPage extends BaseMain{

    @FindBy(id="txtUsername")
    private WebElement usernameField;

    @FindBy(css="#spanMessage")
    private WebElement usernameError;

    @FindBy(id="txtPassword")
    private WebElement passwordField;

    @FindBy(id="btnLogin")
    private WebElement loginButton;

    public void setUsername(String username) throws InterruptedException {
         usernameField.clear();
         usernameField.sendKeys(username);
    }


    public void setPassword(String password) throws InterruptedException {
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public void submitLoginbutton() {
       Assert.assertTrue(loginButton.isDisplayed());
       loginButton.click();
    }

    public String getLoginErrorMessage()
    {
       return usernameError.getText();
    }
}

