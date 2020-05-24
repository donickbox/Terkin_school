package tests;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.WebDriverRunner.closeWebDriver;

public class TestBase {

   @BeforeAll
    public static void setUp() {
        Configuration.headless = true;
    }

    @AfterEach
    public void closeBrowser() {
        closeWebDriver();
    }

}