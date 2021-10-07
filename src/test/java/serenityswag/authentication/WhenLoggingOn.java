package serenityswag.authentication;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import serenityswag.authentication.actions.LoginActions;
import static serenityswag.authentication.User.STANDARD_USER;
import serenityswag.inventory.InventoryPage;

import static org.assertj.core.api.Java6Assertions.assertThat;

@RunWith(SerenityRunner.class)
public class WhenLoggingOn extends UIInteractionSteps {

    @Managed
    WebDriver driver;

    @Steps
    LoginActions login;

    InventoryPage inventoryPage;


    @Test
    public void usersCanLogOnViaTheHomePage() {

        login.as(STANDARD_USER);

        // should see product catalog
        Serenity.reportThat("The inventory page should be displayed with the correct title", () ->
                assertThat(inventoryPage.getHeading()).isEqualToIgnoringCase("Products")
        );


        login.testingStep();

    }

}
