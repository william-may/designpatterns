package org.example.creation.factories.standard.store;

import org.example.creation.factories.standard.pizza.Pizza;
import org.example.creation.factories.standard.pizza.ny.NYStyleCheesePizza;
import org.example.creation.factories.standard.pizza.ny.NYStylePepperoniPizza;

public class NYPizzaStore extends PizzaStore{

  @Override
  protected Pizza createPizza(String type) {
    if(type.equals("pepperoni")) {
      return new NYStylePepperoniPizza();
    }
    else if(type.equals("cheese")) {
      return new NYStyleCheesePizza();
    }

    return null;
  }
}
