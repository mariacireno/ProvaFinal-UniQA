package io.cucumber.uniqa;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;

public class CookiesSteps extends BaseTest {

    @Dado("que eu estou no site da accenture")
    public void entrarNoSiteAccenture() {
        inicializar();
        carregarPagina();
    }    
    
    @Dado("aceito os termos LGPD")
    public void aceito_os_termos_LGPD() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Entao("deve fechar a caixa de informacao")
    public void deve_fechar_a_caixa_de_informacao() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    
    @Dado("clico em configurações de cookie")
    public void clico_em_configurações_de_cookie() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Entao("devo ver o item de {string}")
    public void devo_ver_o_item_de(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Entao("devo ver")
    public void devo_ver(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        throw new io.cucumber.java.PendingException();
    }

}
