package login.pages;

import common.base.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends CommonMethods {
    @FindBy(xpath = "//input[@placeholder='Username']")
    private WebElement username;
    @FindBy(xpath = "//input[@placeholder='Password']")
    private WebElement password;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement loginButton;

    public void username (String username){
        addText(username, this.username);
    }
    public void password (String password){
        addText(password, this.password);
    }
    public void pressButton (){
        click(loginButton);
    }
}
