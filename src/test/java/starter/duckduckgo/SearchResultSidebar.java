package starter.duckduckgo;

import net.serenitybdd.core.pages.PageComponent;
import org.openqa.selenium.By;

public class SearchResultSidebar extends PageComponent {
    public String heading() {
        return $("[data-testid=about] h2").getText();
    }
}
