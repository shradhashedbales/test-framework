package OrangeHm;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by SHRADHA on 17/08/2017.
 */
public class Employee extends BaseMain{


    @FindBy(xpath=".//*[@id='firstName']")
    private WebElement firstNameField;

    @FindBy(xpath=".//*[@id='middleName']")
    private WebElement middleNameField;

    @FindBy(xpath=".//*[@id='lastName']")
    private WebElement lastNameField;

    @FindBy(xpath=".//*[@id='employeeId']")
    private WebElement employeeIdField;

    @FindBy(xpath=".//*[@id='photofile']")
    private WebElement addPhotoButton;

    @FindBy(xpath=".//*[@id='btnSave']")
    private WebElement addEmployeeSaveButton;




}


