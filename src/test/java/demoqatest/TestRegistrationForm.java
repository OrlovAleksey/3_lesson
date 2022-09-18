package demoqatest;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class TestRegistrationForm {

    @BeforeAll
    static void setUp(){
        Configuration.holdBrowserOpen = true; //Делаем чтобы браузер оставался открытым
        Configuration.baseUrl = "https://demoqa.com"; //Добавляем настройку стандартного урла
        Configuration.browserSize = "1920x1080";
    }

    @Test

    void simpleTest(){

        String name = "/automation-practice-form"; //создали переменную для страницы которую будем тестирвоать

        open(name); //открываем станицу которую будем тестировать через переменную

        $("#firstName").setValue("Настя"); //Заполянем Имя
        $("#lastName").setValue("Дергаева"); //Заполянем Фамилию
        $("#userEmail").setValue("adergaeva@pupsik.com"); //Заполянем емейл
        $("#gender-radio-2").doubleClick(); //Кликаем на пол
        $("#userNumber").setValue("79777742959"); //заполняем моб
        $("#dateOfBirthInput").click(); //кликаем на поле чтобы открыть календарь
        $(".react-datepicker__month-select").selectOption("July"); //Выбираем месяц через selectOption
        $(".react-datepicker__year-select").selectOption("1997"); //Выбираем год через selectOption
        $(".react-datepicker__day--020").click(); //Выбираем дату
        $("#subjectsInput").setValue("Hindi").pressEnter();
        $("#hobbiesWrapper").$(byText("Music")).click();




    }
}
