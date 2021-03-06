package techCircle_OrangeHRM.tests;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import techCircle_OrangeHRM.pages.AddUsersPage;
import techCircle_OrangeHRM.pages.LandingPage;
import techCircle_OrangeHRM.pages.LoginPage;
import techCircle_OrangeHRM.pages.MyInfoPage;
import techCircle_OrangeHRM.pages.UsersPage;
import techCircle_OrangeHRM.testbase.ConfigurationReader;
import techCircle_OrangeHRM.testbase.Driver;
import techCircle_OrangeHRM.utilities.Constants;

public class SampleTests {

	LoginPage login = new LoginPage();
	LandingPage landingPage = new LandingPage();
	MyInfoPage myInfoPage = new MyInfoPage();
	UsersPage usersPage = new UsersPage();
	AddUsersPage addUser = new AddUsersPage();

	@BeforeMethod
	public void beforeMethod() {
		Driver.getDriver().get(ConfigurationReader.getProperty("url"));
		Driver.getDriver().manage().window().maximize();
		Driver.getDriver().manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT_TIME, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void afterMethod() {
		Driver.closeDriver();
	}

	@BeforeTest
	public void beforeTest() {

	}

	@AfterTest
	public void afterTest() {

	}

//	@Test(groups = "Login")
//	public void loginWithValidCredentials() {
//		login.login_ValidCredentials();
//		landingPage.logout();
//	}

	@Test
	public void createAUser() {
		login.login_ValidCredentials();
		landingPage.adminTab.click();
		usersPage.createAUser();
		addUser.empName.sendKeys("");
		addUser.password.sendKeys("");
		addUser.confirmPassword.sendKeys("");
		addUser.saveBtn.click();
	//	addUser.empName.sendKeys(.);
		
	}

//
//	@Test(groups = "Login")
//	public void loginWithInvalidCredentials() {
//		login.login_ValidCredentials();
//		landingPage.logout();
//	}

//	@Parameters({ "blankUsername" })
//	@Test(groups = "Login", enabled = true)
//	public void loginWithBlankUsernameValidPassword(String blankUsername) {
//		CommonMethods.sendText(login.username, blankUsername);
//		CommonMethods.sendText(login.password, ConfigurationReader.getProperty("validPassword"));
//		login.loginBtn.click();
//	}

//	@Parameters({ "blankPassword" })
//	@Test(groups = "Login", enabled = true)
//	public void loginWithValidUsernameBlankPassword(String blankPassword) {
//		CommonMethods.sendText(login.username, ConfigurationReader.getProperty("validUsername"));
//		CommonMethods.sendText(login.password, blankPassword);
//		login.loginBtn.click();

	// login.login(ConfigurationReader.getProperty("validUsername"), blankPassword);
//		login.username.clear();
//		login.username.sendKeys(ConfigurationReader.getProperty("validUsername"));
//		login.password.clear();
//		login.password.sendKeys(blankPassword);
//		login.loginBtn.click();
//	}

//	@Test(groups = "MyInfo")
//	public void addFullName_MyInfo() {
//		login.login_ValidCredentials();
//
//		myInfoPage.myInfoTab.click();
//		myInfoPage.editBtn.click();
//		CommonMethods.sendText(myInfoPage.firstName, ConfigurationReader.getProperty("firstName"));
//		CommonMethods.sendText(myInfoPage.lastName, ConfigurationReader.getProperty("lastName"));
//		myInfoPage.saveBtn.click();
//
//		myInfoPage.attachmentBtn.click();
//		myInfoPage.cancelBtn.click();
//
//	}

//	@Test
//	public void 

	public static void main(String[] args) throws SQLException {
		String url = "jdbc:oracle:thin:@18.208.119.28:1521:XE";
		String username = "hr";
		String password = "hr";

		Connection conn = DriverManager.getConnection(url, username, password);

		Statement stm = conn.createStatement();

		String query = "select * from employees";

		ResultSet rs = stm.executeQuery(query);

		rs.close();
		stm.close();
		conn.close();
		
		
	}

}