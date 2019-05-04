package com.github.dmtest.quickpage.example.pages;

import com.github.dmtest.quickpage.api.entrypoint.Environment;
import com.github.dmtest.quickpage.core.page.AbstractPage;
import com.github.dmtest.quickpage.example.elements.HeaderSearch;
import com.github.dmtest.quickpage.example.elements.HeaderTop;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;

public abstract class AnyPage extends AbstractPage {

    @Name("Хедер верхний")
    @FindBy(xpath = "//div[@class='header-top']")
    private HeaderTop headerTop;

    @Name("Хедер поиска")
    @FindBy(xpath = "//nav[@id='header-search']")
    private HeaderSearch headerSearch;

    AnyPage(Environment environment) {
        super(environment);
    }

    public HeaderSearch getHeaderSearch() {
        return headerSearch;
    }

    public HeaderTop getHeaderTop() {
        return headerTop;
    }
}
