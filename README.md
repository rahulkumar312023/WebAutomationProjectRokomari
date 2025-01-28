# Rokomari.com Automation Project

## Overview
This project automates key functionalities of [Rokomari](https://www.rokomari.com/book) using **Java**, **Selenium WebDriver**, **TestNG**, and **Maven**. The automated scenarios cover:
- Logging into the platform.
- Adding a book to the cart.

## Project Structure
```
RokomariAutomation
├── src
│   └── test/java
│       └── pages/testcases/utilities
├── pom.xml
└── README.md
```

## Tools & Technologies
- **Language:** Java
- **Framework:** TestNG
- **Build Tool:** Maven
- **Testing Library:** Selenium WebDriver

## Prerequisites
1. Install [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html).
2. Install [Apache Maven](https://maven.apache.org/install.html).
3. Install an IDE such as [IntelliJ IDEA](https://www.jetbrains.com/idea/) or [Eclipse](https://www.eclipse.org/).
4. Add ChromeDriver to your system PATH.
   
## Setup Instructions
1. Clone this repository:
   ```bash
   git clone https://github.com/rahulkumar312023/WebAutomationProjectRokomari.git
   ```
2. Navigate to the project directory:
   ```bash
   cd WebAutomationProjectRokomari
   ```
3. Install dependencies:
   ```bash
   mvn clean install
   ```
4. Open the project in your preferred IDE.
   
6. Configure ChromeDriver path in `DriverSetup.java` by setting the correct path:
   ```java
   System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
   ```
7. Run the tests using TestNG configuration or Maven:
   ```bash
   mvn test
   ```

## Test Scenarios

### 1. Login Test
**Description:** Validates that the user can log in with correct credentials.

### 2. Add to Cart Test
**Description:** Validates that a book can be successfully added to the cart.

## How to Run Tests
Execute the following Maven command to run the tests:
```bash
mvn test
```

## Sample Test Code
### TeatLogin.java
```java
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


}
```

## License
This project is licensed under the MIT License. Feel free to use and modify it as needed.
