package login.pages;

import common.base.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends CommonMethods {
    @FindBy(xpath = "//input[@id='user-name']")
    private WebElement username;
    @FindBy(xpath = "//input[@id='password']")
    private WebElement password;
    @FindBy(xpath = "//input[@id='login-button']")
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
