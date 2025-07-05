package us.abstracta.opencart.StepsDefinitions;

import io.cucumber.java.en.Given;
import net.serenitybdd.annotations.Steps;
import us.abstracta.opencart.Steps.CarritoComprasSteps;

public class SearchProductCartStepDefinitions {

    @Steps
    CarritoComprasSteps carritoComprasSteps;

    @Given("que he abierto la página principal de OpenCart")
    public void queHeAbiertoLaPaginaPrincipalDeOpenCart() {
        carritoComprasSteps.openPage();
    }

    @Given("busco el producto {string} en la barra de búsqueda")
    public void buscoElProductoEnLaBarraDeBusqueda(String producto) {
        // Aquí podrías personalizar la búsqueda si quieres que sea dinámica.
        carritoComprasSteps.searchIPhone();
    }

    @Given("selecciono el primer resultado de búsqueda")
    public void seleccionoElPrimerResultadoDeBusqueda() {
        carritoComprasSteps.selectPrimerElemento();
    }
}
