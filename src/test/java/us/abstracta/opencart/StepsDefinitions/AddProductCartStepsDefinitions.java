package us.abstracta.opencart.StepsDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import us.abstracta.opencart.Steps.CarritoComprasSteps;
import us.abstracta.opencart.Utils.Dictionary;

public class AddProductCartStepsDefinitions {

    @Steps
    CarritoComprasSteps carritoComprasSteps;


    @When("agrego el producto al carrito de compras")
    public void agregoElProductoAlCarritoDeCompras() {
        carritoComprasSteps.addToCart();
    }

    @When("ingreso al carrito de compras")
    public void ingresoAlCarritoDeCompras() {
        carritoComprasSteps.goToCart();
    }

    @Then("debo ver el producto {string} en el carrito")
    public void deboVerElProductoEnElCarrito(String productoEsperado) {
        carritoComprasSteps.validarProductoAgregado(productoEsperado);
    }

}
