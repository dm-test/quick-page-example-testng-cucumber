package com.github.dmtest.quickpage.example.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.TextInput;
import ru.yandex.qatools.htmlelements.element.TypifiedElement;

public class HeaderSearch extends TypifiedElement {

    @Name("Поле поиска")
    @FindBy(xpath = ".//input[starts-with(@class,'main-search-form__input')]")
    private TextInput searchInput;

    @Name("Найти")
    @FindBy(xpath = ".//button[@class='main-search-form__button']")
    private Button searchButton;

    @Name("Сравнение")
    @FindBy(xpath = ".//a[starts-with(@class,'btn-compare-link')]")
    private Button compareButton;

    @Name("Избранное")
    @FindBy(xpath = ".//a[starts-with(@class,'btn-wishlist-link')]")
    private Button favouritesButton;

    @Name("Корзина")
    @FindBy(xpath = ".//a[starts-with(@class,'btn-cart-link')]")
    private Button cartButton;

    public HeaderSearch(WebElement wrappedElement) {
        super(wrappedElement);
    }

    public TextInput getSearchInput() {
        return searchInput;
    }

    public Button getSearchButton() {
        return searchButton;
    }

    public Button getCompareButton() {
        return compareButton;
    }

    public Button getFavouritesButton() {
        return favouritesButton;
    }

    public Button getCartButton() {
        return cartButton;
    }
}
