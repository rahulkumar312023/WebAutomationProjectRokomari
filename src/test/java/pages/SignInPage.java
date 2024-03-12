package pages;

import org.openqa.selenium.By;

public class SignInPage extends BasePage{

    public String email = "jijem46412@molyg.com";

    //    public String otp = "";
    public By emailOrPhoneField = By.xpath("//input[@placeholder='Email or phone']");

    public By nextButton= By.xpath("//button[@id='js--btn-next']");



    public By logInButton = By.xpath("//form[@id='otp-login-form']//button[@type='submit'][normalize-space()='Login']");
}
