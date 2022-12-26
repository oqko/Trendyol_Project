import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AllProductPage extends BasePage{
    public AllProductPage(WebDriver driver) {
        super(driver);
    }
    List<WebElement> addToCartButtton=driver.findElements(By.xpath("//button [@class='add-to-basket-button']"));



    public void getProduct(){

       addToCartButtton.get(0).click();
       addToCartButtton.get(1).click();
       addToCartButtton.get(2).click();

    }
}
