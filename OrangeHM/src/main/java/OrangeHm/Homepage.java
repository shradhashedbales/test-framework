package OrangeHm;

/**
 * Created by SHRADHA on 06/08/2017.
 */
public class Homepage extends BaseMain {


    public void checkTitle(){
        String title= driver.getTitle();
        System.out.println(" The title of the page is -->>" + title);
        //webdriver.findElement(By.xpath("//img[@alt=\"nopCommerce demo store\"]"));
    }


}
