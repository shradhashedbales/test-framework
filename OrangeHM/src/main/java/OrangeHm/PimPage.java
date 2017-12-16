package OrangeHm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;

/**
 * Created by SHRADHA on 21/08/2017.
 */
public class PimPage extends BaseMain {

    @FindBy(linkText = "PIM")
    private WebElement pimMenu;
    @FindBy(css = "#menu_pim_addEmployee > span.left-menu-title")
    private WebElement addEmployee;
    @FindBy(id = "pimAddEmployeeForm")
    private WebElement addEmployeeText;
    @FindBy(id = "firstName")
    private WebElement firstName;
    @FindBy(id = "lastName")
    private WebElement lastName;
    @FindBy(id = "employeeId")
    private WebElement employeeId;
    @FindBy(css = "#hasLoginDetails + label")
    private WebElement checkBox;
    @FindBy(id = "username")
    private WebElement newUserName;
    @FindBy(id = "password")
    private WebElement newUserPassword;
    @FindBy(id = "confirmPassword")
    private WebElement confirmNewUserPassword;
    @FindBy(css = "div[id='status_inputfileddiv'] input")
    //@FindBy (id="status")
    private WebElement newUserStatus;
    //cssSelector("div.settings-padding > span"))
    @FindBy(xpath = ".//*[@id='location_inputfileddiv']/label")
    private WebElement newUserLocation;
    @FindBy(id = "btnSave")
    private WebElement newUserSaveBtn;
    @FindBy(id = "systemUserSaveBtn")
    private WebElement systemUserButton;

    @FindBy(css = "div[id='status_inputfileddiv'] ul[id*='select-options-'] li[class] span")
    private List<WebElement> status_choice;

    public void navigateToAddEmployee() {

        pimMenu.click();
        addEmployee.click();

    }

    public String checkAdminIsInAddEmployeePage() {
        String addEmpText = addEmployeeText.getText();
        return addEmpText;
    }

    public void provideEmployeeDetails() {
        firstName.sendKeys("Sheley");
        lastName.sendKeys("Jones");
        employeeId.clear();
        employeeId.sendKeys(Integer.toString(new Random().nextInt()));
        checkBox.click();
        newUserName.sendKeys("she" + Integer.toString(new Random().nextInt()));
        newUserPassword.sendKeys("jontest");
        confirmNewUserPassword.sendKeys("jontest");
    }

    public void selectFromList(WebElement element, String text) {
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }
    public void selectStatus()
    {
        newUserStatus.click();
        selectFromList(newUserStatus, "Enabled");
    }


    /* public void selectStatus(String nameOfStatus)  {

            if (newUserStatus.isEnabled()) {
                newUserStatus.click();
                //Thread.sleep(2000);
                //selectFromList(newUserStatus, "Enabled");

                for (WebElement choice : status_choice) {
                    if (choice.getText().equalsIgnoreCase(nameOfStatus)) {
                        choice.click();
                        //Thread.sleep(20000);

                    }


                }
            }
            //newUserStatus.click();
            selectFromList(newUserStatus, "Enabled");

        }


/*try{
        if(in.available()!=0){
            // ------
        }
    }catch(EOFException eof){
        //
    }catch(Exception e){
        //
    }
}*/
        public void selectLocation() {

            selectFromList(newUserLocation,"Indian Development Center");
        }

        public void newUserSave() {
            newUserSaveBtn.click();
        }

        public boolean isUserOnPIPage() {
            return systemUserButton.isDisplayed();
        }
    }


