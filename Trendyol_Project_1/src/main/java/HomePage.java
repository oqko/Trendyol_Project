import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }
 private final By enCokSatanUrunler=By.xpath("//*[@id=\"browsing-gw-homepage\"]/div/div/div/article[2]/div/div/div/div/a[1]/img");
    private final By cookie1=By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]");
    String topSellerProductPage="https://www.trendyol.com/sr?fl=sepetteurunler";

    public void topSellerProduct(){
        clickElement(enCokSatanUrunler);
    }

    public void passCookie(){
    clickElement(cookie1);
    }


}
