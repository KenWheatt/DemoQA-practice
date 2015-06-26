package pageObjects;

import org.openqa.selenium.By;

public class AutoCompletePage extends FramesAndWindowsPage {
	public AutoCompletePage(){}
	
	public final By AUTOCOMPLET_INPUT = By.id("tagss");
	public final By EXPECTED_AUTOCOMPLETE_RETURN = By.xpath(".//*[@id='ui-id-1']/li[contains(.,'ActionScript')]");
}
