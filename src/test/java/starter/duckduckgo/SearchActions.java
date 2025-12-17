package starter.duckduckgo;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;


public class SearchActions extends UIInteractions {
    @Step("Search for '{0}'")
    public void byKeyword(String keyword) {
        $("//input[@class='searchbox_input__rnFzM']").sendKeys(keyword, Keys.ENTER);
    }
}
