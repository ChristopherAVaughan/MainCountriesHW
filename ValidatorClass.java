package MainCountriesHW;

public class ValidatorClass {

	protected Boolean menuSelection = true;
	protected Boolean countryValidAddition = false;
	protected String addCountryName = null;

	public ValidatorClass(Boolean menuSelection, Boolean countryValidAddition, String addCountryName) {
		this.menuSelection = menuSelection;
		this.countryValidAddition = countryValidAddition;
		this.addCountryName = addCountryName;
	}

	public ValidatorClass() {
	}

	public Boolean getMenuSelection() {
		return menuSelection;
	}

	public void setMenuSelection(Boolean menuSelection) {
		this.menuSelection = menuSelection;
	}

	public Boolean getCountryValidAddition() {
		return countryValidAddition;
	}

	public void setCountryValidAddition(Boolean countryValidAddition) {
		this.countryValidAddition = countryValidAddition;
	}

	public String getAddCountryName() {
		return addCountryName;
	}

	public void setAddCountryName(String addCountryName) {
		this.addCountryName = addCountryName;
	}

}
