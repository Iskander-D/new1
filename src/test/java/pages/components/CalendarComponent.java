package pages.components;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class CalendarComponent {
    public void setDate(String day, String month, String year) {
//        $(".react-datepicker__month-select").click();
//        $(byText(month)).click();
//        $(".react-datepicker__year-select").click();
//        $(byText(year)).click();
//        $(".react-datepicker__month").click();
//        $(byText(day)).click();


        $(".react-datepicker__month-select").$(byText(month)).click();
        $(".react-datepicker__year-select").$(byText(year)).click();
        $(".react-datepicker__day--0" + day + ":not(.react-datepicker__day--outside-month)").click();
    }
}