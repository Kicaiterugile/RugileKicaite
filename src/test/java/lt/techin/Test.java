package lt.techin;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test extends BaseTest{
    HomePage homePage;
//    ProductsPage productsPage;

//    ProductPage productPage;

    @ParameterizedTest
    @CsvFileSource(resources = "/items.csv")
    public void shoppingCartAddAndRemove(String productName, boolean exists) {
        homePage = new HomePage(driver);
//        productsPage = new ProductsPage(driver);
//        productPage = new ProductPage(driver);
        homePage.showNavigate();
        homePage.showALLM3();


////       showALLM3 List<String> mp3players = productsPage.getAllProducts();
////        int index = mp3players.indexOf(productName);
//        assertEquals(exists, index != -1);
//        if (index == -1) {
//            return;
//        }
//
//        productsPage.selectProduct(index);
//
//        productPage.addToWishList();
//
//        assertTrue(mp3players.contains(productName), "Product " + productName + " does not exist in the eshop!");
//        String expetedResult = "You must login or create an account to save " + productName + " to your wish list!\n×";
//        assertEquals(expetedResult, productPage.getAlertSuccessText(),"There is no message displayed");
//

    }
}
