package com.github.dmtest.quickpage.example.stepdefs;

import com.github.dmtest.quickpage.api.entrypoint.Environment;
import com.github.dmtest.quickpage.core.entrypoint.DefaultEnvironment;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
    private Environment environment;

    public Hooks(DefaultEnvironment environment) {
        this.environment = environment;
    }

    @Before(order = 1000)
    public void setEnvironment() {
        environment.setEnvironmentDefaults();
    }

    @After
    public void quitDriver() {
        environment.getDriverManager().quitDriver();
    }

}
