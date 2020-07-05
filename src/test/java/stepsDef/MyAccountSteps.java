/*
 * package stepsDef;
 * 
 * import com.test.pageAction.MyAccountpageAction; import
 * com.test.util.Browserfactory;
 * 
 * import cucumber.api.java.en.Given; import cucumber.api.java.en.Then; import
 * cucumber.api.java.en.When;
 * 
 * public class MyAccountSteps extends Browserfactory { MyAccountpageAction
 * action= new MyAccountpageAction();
 * 
 * 
 * @Given("^Launch \"([^\"]*)\"$") public void launch(String URL) throws
 * Throwable { getDriver(URL); }
 * 
 * @When("^user click on My Account Link$") public void
 * user_click_on_My_Account_Link() throws Throwable {
 * action.clickonMyAccountLink(); }
 * 
 * @Then("^user enter \"([^\"]*)\" and \"([^\"]*)\"$") public void
 * user_enter_and(String EmailAddress, String Password) throws Throwable {
 * action.enterusercredential(prop.getProperty("EmailAddress"),
 * prop.getProperty("Password")); }
 * 
 * @Then("^user click on Singin Button$") public void
 * user_click_on_Singin_Button() throws Throwable {
 * action.clickonSigninButton(); }
 * 
 * 
 * 
 * 
 * }
 */