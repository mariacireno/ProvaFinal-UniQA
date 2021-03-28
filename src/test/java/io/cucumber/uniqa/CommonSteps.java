package io.cucumber.uniqa;

import io.cucumber.java.pt.Dado;

public class CommonSteps {

    @Dado("que eu estou no site da accenture {string}")
    public void que_eu_estou_no_site_da_accenture(String string) {
        BaseTest.inicializar(string);
    }

   
}
