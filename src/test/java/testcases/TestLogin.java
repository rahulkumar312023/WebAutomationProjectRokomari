package testcases;

import org.testng.annotations.Test;
import pages.*;
import utilities.DriverSetup;

public class TestLogin extends DriverSetup {

    HomePage homePage = new HomePage();

    SignInPage signInPage = new SignInPage();

    BookPage bookPage = new BookPage();

    AuthorPage authorPage = new AuthorPage();

    AddToCartPage addToCartPage = new AddToCartPage();

    @Test
    public void testLoginWithValidCredentials() throws InterruptedException {
        getBrowser().get(homePage.homePageUrl);
        homePage.clickOnElement(homePage.signInButton);
        signInPage.writeOnElement(signInPage.emailOrPhoneField, signInPage.email);
        signInPage.clickOnElement(signInPage.nextButton);
        Thread.sleep(60000);
        signInPage.clickOnElement(signInPage.logInButton);


    }

    @Test
    public void testHover() throws InterruptedException {
        getBrowser().get(bookPage.bookPageUrl);
        bookPage.hoverOnElement(bookPage.authorSelection);
        Thread.sleep(10000);
        bookPage.clickOnElement(bookPage.selectedAuthor);

    }

    @Test
    public void testScroll() throws InterruptedException {
        getBrowser().get(authorPage.authorPageUrl);
        authorPage.scrollToElement(authorPage.scrollToCategories);
        authorPage.clickOnElement(authorPage.filterCategories);
        authorPage.scrollToElement(authorPage.scrollToNextPage);
//        authorPage.clickOnElement(authorPage.nextPage);
        Thread.sleep(10000);
    }

    @Test
    public void testAddToCart(){
        getBrowser().get(addToCartPage.addToCartPageUrl);
        addToCartPage.scrollToElement(addToCartPage.scrollToBook);
        addToCartPage.clickOnElement(addToCartPage.selectBook);
        getBrowser().get(addToCartPage.addToCartBookSelect);
        addToCartPage.clickOnElement(addToCartPage.selectedBook);


    }

    @Test
    public void testCartAndShippingInfo() throws InterruptedException {
        getBrowser().get(addToCartPage.addToCartPageUrl);
        addToCartPage.clickOnElement(addToCartPage.addToCartIcon);
        authorPage.clickOnElement(addToCartPage.placeOrder);
        addToCartPage.writeOnElement(addToCartPage.fullName, addToCartPage.name);
        addToCartPage.writeOnElement(addToCartPage.phoneNumber, addToCartPage.phone);
        addToCartPage.clickOnElement(addToCartPage.selectCity);
        addToCartPage.dropDownSelection(addToCartPage.selectCity);
//        addToCartPage.dropDownSelection(addToCartPage.selectArea);
        addToCartPage.writeOnElement(addToCartPage.address, addToCartPage.addressName);
        addToCartPage.scrollToElement(addToCartPage.paymentMethodScroll);
//        addToCartPage.clickOnElement(addToCartPage.placeOrder);
        Thread.sleep(10000);
    }
}
