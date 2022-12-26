import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class All_Tests extends BaseTest{
    HomePage homePage;
    AllProductPage allProductPage;
    CartPage cartPage;
    @Test
    @Order(1)
    public void homePageChecked() {
        Assertions.assertEquals(baseUrl,driver.getCurrentUrl(),"Different Web pages");
    }
    @Test
    @Order(2)
    public void goToTopSellerPage(){
        homePage=new HomePage(driver);
        homePage.passCookie();
        homePage.topSellerProduct();
        Assertions.assertEquals(homePage.topSellerProductPage,driver.getCurrentUrl(),"Different Web Pages");

        allProductPage=new AllProductPage(driver);
        allProductPage.getProduct();


        cartPage=new CartPage(driver);
        cartPage.goToCardPage();
        cartPage.removeCard();

    }
    
    @Test
    @Order(3)
    public void goToHomePage(){
        cartPage=new CartPage(driver);
        cartPage.goToHomepage();
        Assertions.assertEquals(baseUrl,driver.getCurrentUrl(),"Different Web Pages");
    }

}
