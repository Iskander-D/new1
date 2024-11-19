package pages.components;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class CalendarComponent {
    public void setDate(String day, String month, String year) {
        $(".react-datepicker__month-select").$(byText(month)).click();
//        $(byText(month)).click();
        $(".react-datepicker__year-select").$(byText(year)).click();
//        $(byText(year)).click();
        $(".react-datepicker__day--0" + day ).click();
//        $(byText(day)).click();


//        $(".react-datepicker__month-select").$(byText(month)).scrollTo().click();
//        $(".react-datepicker__year-select").$(byText(year)).scrollTo().click();
//        $(".react-datepicker__day--0" + day + ":not(.react-datepicker__day--outside-month)").scrollTo().click();
    }
}