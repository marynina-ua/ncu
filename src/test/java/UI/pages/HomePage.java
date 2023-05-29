package UI.pages;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selenide.$$;

public class HomePage {

    private ElementsCollection singUpButtons = $$(byAttribute("href", "/sign-up"));

    public void clickOnSingUpButton (){
        singUpButtons.get(1).click();
    }
}
