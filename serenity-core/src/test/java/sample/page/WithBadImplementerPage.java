package sample.page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import sample.elements.HasBadImplementer;

public class WithBadImplementerPage extends PageObject{

	@FindBy(css = "#firstname")
	public HasBadImplementer intefaceNotImplementedByClass;

	public WithBadImplementerPage(WebDriver driver) {
		super(driver);
	}

}
