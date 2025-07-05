package us.abstracta.opencart.StepsDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import us.abstracta.opencart.Steps.CarritoComprasSteps;
import us.abstracta.opencart.Utils.Dictionary;

public class DeleteProductCartStepsDefinitions {
    @Steps
    CarritoComprasSteps carritoComprasSteps;


    @When("remuevo el producto {string} del carrito")
    public void remuevo_el_producto_del_carrito(String string) {
        carritoComprasSteps.eliminarProducto();
    }


    @Then("se debe ver el mensaje {string} en la pantalla")
    public void seDebeVerElMensajeEnLaPantalla(String textoEsperado) {
        carritoComprasSteps.validarProductoEliminado(Dictionary.getMsjEmptyCar());
    }
}
