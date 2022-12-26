import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class CartPage extends BasePage{
    public CartPage(WebDriver driver) {
        super(driver);
    }

   WebDriver wait;
    private final By cardPageLocator=By.xpath("//a[@class='link account-basket']");
    private final By removeButton= By.xpath("//i[@class='i-trash']");
    private final By silAlert=By.xpath("//button[@type='button'][2]");
    private  final  By trendyolButton=By.id("logo");
    public void goToCardPage() {
        clickElement(cardPageLocator);
    }

    public void removeCard() {
        clickElement(removeButton);

        clickElement(silAlert);
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(removeButton));
        clickElement(removeButton);
        clickElement(silAlert);
        wait.until(ExpectedConditions.elementToBeClickable(removeButton));
        clickElement(removeButton);
        clickElement(silAlert);
    }
    public void goToHomepage(){
        clickElement(trendyolButton);
    }
}

