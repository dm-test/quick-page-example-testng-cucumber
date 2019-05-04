package com.github.dmtest.quickpage.example.stepdefs;

import com.github.dmtest.quickpage.core.entrypoint.DefaultEnvironment;
import cucumber.api.java.ru.Когда;

public class CommonSteps {
    private DefaultEnvironment environment;

    @Когда("^Открывает URL \"([^\"]*)\"$")
    public void openUrl(String url) {
        environment.getDriver().get(url);
    }

    @Когда("^Пользователь находится на странице \"([^\"]*)\"$")
    public void getNewPage(String pageName) {
        environment.getPageManager().getNewPageByName(pageName);
    }

    @Когда("^Пользователь находит элемент \"([^\"]*)\"$")
    public void searchElementOnCurrentPage(String elementName) {
        environment.getSearchManager().searchElement(elementName);
    }

    public CommonSteps(DefaultEnvironment environment) {
        this.environment = environment;
    }
}
