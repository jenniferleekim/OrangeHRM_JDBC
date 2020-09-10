package techCircle_OrangeHRM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import techCircle_OrangeHRM.testbase.Driver;

public class UsersPage {

	public UsersPage() {
		PageFactory.initElements(Driver.getDriver(), this);

	}

	@FindBy(xpath = "//*[@id=\"btnAdd\"]")
	public WebElement addBtn;
	
	
	
	
	

	public void createAUser() {
		UsersPage createAUser = new UsersPage();
		createAUser.addBtn.click();
	}

}