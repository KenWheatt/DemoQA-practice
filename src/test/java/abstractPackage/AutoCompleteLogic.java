package abstractPackage;

public class AutoCompleteLogic extends SelectableLogic {
	public AutoCompleteLogic() {
	}

	public boolean validateAutoComplet() throws InterruptedException {
		goToPage(AUTOCOMPLETE_LINK, AUTOCOMPLETE_URL);
		type(AUTOCOMPLET_INPUT, "a");
		badWait();
		if (isElementvisible(EXPECTED_AUTOCOMPLETE_RETURN)) {
			return true;
		}
		return false;
	}
}
