package org.example.creation.factories.simple;

public class SimplePizzaFactory {

  public Pizza makePizza(String pizzaType) {
    if(pizzaType.equals("pepperoni")) {
      return new PepperoniPizza();
    }
    else if(pizzaType.equals("cheese")) {
      return new CheesePizza();
    }

    return null;
  }

}
