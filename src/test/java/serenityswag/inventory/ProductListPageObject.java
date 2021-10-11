package serenityswag.inventory;

import net.serenitybdd.core.pages.PageObject;
import org.assertj.core.api.AbstractBigDecimalAssert;
import org.openqa.selenium.By;

import java.util.List;

import static javax.swing.text.html.CSS.getAttribute;

public class ProductListPageObject extends PageObject {
    public List<String> titles() {
        return findAll(".inventory_item_name").textContents();

    }

    public void openProductDetailsFor(String itemName) {
        find(By.linkText(itemName)).click();


    }

    public String imageTextForProduct(String productName) {
        return $("//div[@class='inventory_item'][contains(., '" + productName + "')]//img").getAttribute("alt");
    }
}
