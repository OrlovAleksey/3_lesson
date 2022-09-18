package demoqatest;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class TestRegistrationForm {
    @Test
    void simpleTest(){
     open("https://demoqa.com/automation-practice-form");
    }
}
