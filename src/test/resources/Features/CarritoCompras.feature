Feature: Gestión de Carrito de Compras en OpenCart
  Como cliente de OpenCart
  Quiero poder agregar y remover productos de mi carrito
  Para gestionar mis posibles compras antes de finalizar el pedido

  Background:
    Given que he abierto la página principal de OpenCart
    And busco el producto "iPhone" en la barra de búsqueda
    And selecciono el primer resultado de búsqueda

  @add_to_cart
  Scenario: Agregar producto al carrito de compras
    When agrego el producto al carrito de compras
    And ingreso al carrito de compras
    Then debo ver el producto "iPhone" en el carrito

  @remove_from_cart
  Scenario: Remover producto del carrito de compras
    When agrego el producto al carrito de compras
    And ingreso al carrito de compras
    And remuevo el producto "iPhone" del carrito
    Then se debe ver el mensaje "Your shopping cart is empty!" en la pantalla
