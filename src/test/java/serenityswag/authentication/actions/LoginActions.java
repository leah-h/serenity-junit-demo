package serenityswag.authentication.actions;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.seleniumhq.jetty9.server.Authentication;
import serenityswag.authentication.User;

public class LoginActions extends UIInteractionSteps {

    @Step("Log in as {0}")
    public void as(User user) {

        openUrl("https://www.saucedemo.com");

        //find("[data-test='username']").sendKeys("standard_user");
        find(By.name("user-name")).sendKeys(user.getUsername());
        //find("[data-test='password']").sendKeys("secret_sauce");
        find(By.name("password")).sendKeys(user.getPassword());
        // css expression
        //$("[name=password]").sendKeys(user.getPassword);
        //find("[data-test='login-button']").click();
        find(By.name("login-button")).click();
    }

    @Step("Testing a step list")
    public void testingStep() {
        System.out.println("This is a step test");
    }
}
