package com.github.dmtest.quickpage.example.pages;

import com.github.dmtest.quickpage.api.entrypoint.Environment;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.TextBlock;

@Name("Главная")
public class MainPage extends AnyPage {

    @Name("Лучшие предложения")
    @FindBy(xpath = "//h2[text()='Лучшие предложения']")
    private TextBlock bestOffersTextBlock;

    public MainPage(Environment environment) {
        super(environment);
        new WebDriverWait(getEnvironment().getDriver(), 20)
                .withMessage(() -> "Не смог инициализировать страницу " + MainPage.class.getSimpleName())
                .until(webDriver -> bestOffersTextBlock.isDisplayed());
    }

    public TextBlock getBestOffersTextBlock() {
        return bestOffersTextBlock;
    }
}
