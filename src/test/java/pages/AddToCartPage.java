package pages;

import org.openqa.selenium.By;

public class AddToCartPage extends BasePage {

    public String addToCartPageUrl = "https://www.rokomari.com/book";

    public String addToCartBookSelect = "https://www.rokomari.com/book/304538/software-engineering-talk?ref=r_s0";

    public By scrollToBook = By.xpath("//h2[contains(text(),'অমর একুশে বইমেলা ২০২৪')]");
    public By selectBook = By.xpath("//section[@id='recently-sold']//div[5]//a[1]//div[2]//div[1]");

    public By selectedBook = By.xpath("//a[@class='btn details-cart-btn-new js--ab-test-send-data-add-to-cart-color small-cart-button js--add-to-cart js--add-to-cart-desc js--send-ab-test-result-offer-button']//span[@id='js--add-to-cart-button']");

    public By addToCartIcon = By.xpath("//a[@id='js-cart-menu']//*[name()='svg']");

    public By placeOrder = By.xpath("//span[normalize-space()='Place Order']");

    public By fullName = By.xpath("//div[@class='shipping-form-container']//input[@id='name']");

    public String name = "Rahul Kumar";

    public By phoneNumber = By.xpath("//fieldset[@class='group']//input[@id='phone']");

    public String phone = "765475476";

    public  By selectCity = By.xpath("//select[@id='js--city']");

    public By selectArea = By.xpath("//select[@id='js--area']");

    public By address = By.xpath("//fieldset[@class='mb-0']//textarea[@id='address']");

    public String addressName = "Dhaka";

    public By paymentMethod = By.xpath("//img[@alt='Pay by Nagad']");

    public By paymentMethodScroll = By.xpath("//p[contains(text(),'ডেবিট / ক্রেডিট কার্ড')]");
}
