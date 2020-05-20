package tests;


import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.*;
import static helpers.Environment.myitem;
import static helpers.Environment.url;
@Tag("yandex")

public class YandexMarket {
    @Test
    void FirstElementOnYandexMarket(){
        open(url);
        $(byName("text")).setValue(myitem).pressEnter();
        $x("//h3/a[1]").pressEnter();
        switchTo().window(1);
        $(".n-title__text").shouldHave(text(myitem));
    }
}
