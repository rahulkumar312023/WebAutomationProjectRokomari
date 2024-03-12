package pages;

import org.openqa.selenium.By;

public class AuthorPage extends BasePage{

    public String authorPageUrl = "https://www.rokomari.com/book/author/1/humayun-ahmed?ref=mm_p0";
    public By filterCategories = By.xpath("//label[contains(text(),'গল্প সমগ্র')]");

    public By nextPage = By.xpath("//a[normalize-space()='2']");

    public By scrollToCategories = By.xpath("//p[normalize-space()='By Publishers']");

    public By scrollToNextPage = By.xpath("//p[normalize-space()='Home']");
}
