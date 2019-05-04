package com.github.dmtest.quickpage.example.pages;

import com.github.dmtest.quickpage.api.entrypoint.Environment;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.TextInput;

@Name("Выбор города")
public class ChooseCityPage extends AnyPage {

    @FindBy(xpath = "//div[@class='select-lists state-city-select']//input[@data-role='search-city']")
    private TextInput searchCityInput;

    public ChooseCityPage(Environment environment) {
        super(environment);
        new WebDriverWait(environment.getDriver(), 20)
                .withMessage(() -> "Не смог инициализировать страницу " + ItemPage.class.getSimpleName())
                .until(webDriver -> searchCityInput.isDisplayed());
    }

    public void chooseCity(String city) {
        searchCityInput.sendKeys(city + Keys.ENTER);
    }

}