package com.github.dmtest.quickpage.example.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.TypifiedElement;

public class HeaderTop extends TypifiedElement {

    @Name("Город")
    @FindBy(xpath = "//div[contains(@class,'common-link_city')]")
    private Button cityButton;

    public HeaderTop(WebElement wrappedElement) {
        super(wrappedElement);
    }
}
