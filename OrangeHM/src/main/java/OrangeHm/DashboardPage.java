package OrangeHm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by SHRADHA on 17/08/2017.
 */
public class DashboardPage extends BaseMain {

   LoginPage loginpage = new LoginPage();

    @FindBy(css=".page-title")
    //"div[class*='form-panel second']>input[id='Passwd']")
        WebElement pageHeader;

    @FindBy(css =".left-menu-title")
    WebElement pimpage;

    @FindBy(css = "iframe#noncoreIframe")
    WebElement dashBoardIframe;

    public WebElement welcomeUsername()
       {

        return pageHeader;
        }


        public String getPageHeader() {
            driver.switchTo().frame(dashBoardIframe);
            return pageHeader.getText();
        }

        public String checkPIMMenuTab() {
        driver.switchTo().frame(dashBoardIframe);
    WebElement mySelectElm = driver.findElement(By.xpath("//li[@id='menu_pim_viewPimModule']/a/span[2]"));
        return pimpage.getText();
            //WebElement menuTab = webdriver.findElement(By.cssSelector("#menu_pim_addEmployee > span.left-menu-title"));
        //Select dropdown = new Select(webdriver.findElement(By.id("mySelect")));
        //menuTab.findElement(By.id())
        //List<WebElement> menuTabContents = menuTab.findElements(By.cssSelector("a[class^=firstLevelMenu]"));
       // String menuTabContentsText = menuTabContents.get(1).getText();
        //System.out.println(menuTabContentsText);
        //Assert.assertEquals("PIMPage", menuTabContentsText);
    }

}

