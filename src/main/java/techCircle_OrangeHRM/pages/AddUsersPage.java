package techCircle_OrangeHRM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import techCircle_OrangeHRM.testbase.Driver;

public class AddUsersPage {

	public AddUsersPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(xpath = "//*[@id=\"systemUser_employeeName_empName\"]")
	public WebElement empName;

	@FindBy(xpath = "//*[@id=\"systemUser_userName\"]")
	public WebElement username;

	@FindBy(xpath = "//*[@id=\"btnSave\"]")
	public WebElement saveBtn;

	@FindBy(xpath = "//*[@id=\"systemUser_password\"]")
	public WebElement password;

	@FindBy(xpath = "//*[@id=\"systemUser_confirmPassword\"]")
	public WebElement confirmPassword;
//
//@FindBy (xpath = "")
//public WebElement
//
//@FindBy (xpath = "")
//public WebElement

	public void addUser() {
		AddUsersPage addUser = new AddUsersPage();

		// for () {

	}
//	addUser.empName
//	addUser.username
//	addUser.saveBtn.click();
}
