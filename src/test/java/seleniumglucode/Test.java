package seleniumglucode;


import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import org.openqa.selenium.WebElement;


public class Test  extends BaseTest{

    public Test() throws Exception {
    }

    @Given("^el usuario se encuentra en la pagina home de  imalittletesters$")
    public void el_usuario_se_encuentra_en_la_pagina_home_de_imalittletesters() throws Throwable {
        Assert.assertTrue(homePage.homePageIsDisplayed());
    }

    @When("^hace click en el boton de The little tester comics$")
    public void hace_click_en_el_boton_de_The_little_tester_comics() throws Throwable {
       homePage.clickOnTitleComics();
     }

    @Then("^se debe rederigir a la pantalla donde hay un listado de comics$")
    public void se_debe_rederigir_a_la_pantalla_donde_hay_un_listado_de_comics() throws Throwable {
       Assert.assertTrue("No se redirecciono directamente a la pagina de comics",comicsPage.isTitleComicsDisplayed());
     }
}
