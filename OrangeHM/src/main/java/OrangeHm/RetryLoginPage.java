package OrangeHm;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by SHRADHA on 20/08/2017.
 */
public class RetryLoginPage extends BaseMain{


   @FindBy(id="txtUsername")
    private WebElement usernameField;


    @FindBy(id="txtPassword")
    private WebElement passwordField;

    @FindBy(id="btnLogin")
    private WebElement retryloginButton;



   public void setUsername(String username) throws InterruptedException {
        usernameField.clear();
        usernameField.sendKeys(username);
    }

   public void setPassword(String password) throws InterruptedException {
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public void retryLoginbutton() {
       Assert.assertTrue(retryloginButton.isDisplayed());
        retryloginButton.click();
    }

}
