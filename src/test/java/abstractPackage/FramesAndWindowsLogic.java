package abstractPackage;

import java.util.ArrayList;

public class FramesAndWindowsLogic extends AutoCompleteLogic {
	public FramesAndWindowsLogic() {
	}

	public boolean switchingToNewPage() throws InterruptedException {
		goToPage(FRAMESANDWINDOWS_LINK, FRAMESANDWINDOWS_URL);
		badWait();
		clickOn(NEW_BROWSER_TAB_FAW);
		badWait();
		ArrayList<String> tabs2 = new ArrayList<String>(
				driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
		String currentUrl = driver.getCurrentUrl();
		if (currentUrl == "http://demoqa.com/frames-and-windows/#") {
			return true;
		}
		return false;
	}
}
