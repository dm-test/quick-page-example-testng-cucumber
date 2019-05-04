package com.github.dmtest.quickpage.example.pages;

import com.github.dmtest.quickpage.api.entrypoint.Environment;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.Button;

@Name("Карточка товара")
public class ItemPage extends AnyPage {

    @FindBy(xpath = "//button[starts-with(@class,'btn btn-cart')]")
    private Button buyButton;

    @FindBy(xpath = "//a[starts-with(@class,'btn btn-one-click')]")
    private Button buyInOneClickButton;

    public ItemPage(Environment environment) {
        super(environment);
        new WebDriverWait(environment.getDriver(), 20)
                .withMessage(() -> "Не смог инициализировать страницу " + ItemPage.class.getSimpleName())
                .until(webDriver -> buyButton.isDisplayed());
    }

    public void buyItem() {
        buyButton.click();
        new WebDriverWait(getEnvironment().getDriver(), 10)
                .until(ExpectedConditions.attributeToBe(buyButton, "data-original-title", "Перейти в корзину"));
    }

    public Button getBuyInOneClickButton() {
        return buyInOneClickButton;
    }
}

