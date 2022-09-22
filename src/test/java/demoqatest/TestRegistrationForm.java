package demoqatest;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
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

        String BaseUrl = "/automation-practice-form"; //создали переменную для страницы которую будем тестирвоать

        open(BaseUrl); //открываем станицу которую будем тестировать через переменную

        $("#firstName").setValue("Орлов"); //Заполянем Имя
        $("#lastName").setValue("Алекесй"); //Заполянем Фамилию
        $("#userEmail").setValue("aorlov@site.com"); //Заполянем емейл
        $("#gender-radio-1").doubleClick(); //Кликаем на пол
        $("#userNumber").setValue("79777742959"); //заполняем моб

        $("#dateOfBirthInput").click(); //кликаем на поле чтобы открыть календарь
        $(".react-datepicker__month-select").selectOption("July"); //Выбираем месяц через selectOption
        $(".react-datepicker__year-select").selectOption("1997"); //Выбираем год через selectOption
        $(".react-datepicker__day--020").click(); //Выбираем дату

        $("#subjectsInput").setValue("Hindi").pressEnter(); // выбираем
        $("#hobbiesWrapper").$(byText("Music")).click();
        $("#currentAddress").setValue("Moskva, Krasnopresnenskaya nab., 12-17");

        File file = new File("src/test/resources/CKtO-Q6I1ks.jpg");//создаем переменную для файла
        $("#uploadPicture").uploadFile(file);//загружаем файл

        $("#react-select-3-input").setValue("NCR").pressEnter(); //выбираем штат
        $("#react-select-4-input").setValue("Noida").pressEnter(); //выбираем город






    }
}
