package OrangeHm;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by SHRADHA on 17/08/2017.
 */
public class NavigateToPage extends BaseMain{

    @FindBy(xpath=".//*[@id='menu_pim_viewPimModule']")
    WebElement navigate2pimpage;

    @FindBy(xpath=".//*[@id='menu_pim_addEmployee']")
    WebElement navigate2employeepage;

}
