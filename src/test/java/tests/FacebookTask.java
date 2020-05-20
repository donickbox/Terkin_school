package tests;


import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static helpers.Environment.*;
@Tag("facebook")

public class FacebookTask {
    @Test
    void FBAutorization(){
        open(furl);
        $(byName("email")).setValue(femail);
        $(byName("pass")).setValue(fpassword).pressEnter();
        sleep(2000);
        open(furl2);
        $(byText("Имя пользователя Facebook")).click();
        $(byName("username")).setValue(fname);
        sleep(2000);
        $("html").shouldHave(text("Данное имя пользователя доступно"));
        $(byValue("Сохранить изменения")).click();
        sleep(5000);
        $("html").shouldHave(text(fname));
    }
}

