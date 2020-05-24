package tests;

import com.codeborne.selenide.ElementsCollection;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.element;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.*;
import static helpers.Environment.*;

@Tag("tinkoff")

public class TinkoffTask {
    @Test
    void ClickbyDeposit(){
        open(turl);
        ElementsCollection spanCollection = $$("span");
        spanCollection.findBy(text("Вклады")).click();
    }
}
