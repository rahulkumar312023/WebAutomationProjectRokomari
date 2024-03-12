package pages;

import org.openqa.selenium.By;

public class BookPage extends BasePage{

    public String bookPageUrl = "https://www.rokomari.com/book";

    public By authorSelection = By.xpath("//a[@id='js--authors']");

    public By selectedAuthor = By.xpath("//a[contains(text(),'হুমায়ূন আহমেদ')]");
}
