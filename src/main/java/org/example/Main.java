package org.example;

import org.example.creation.factories.simple.Pizza;
import org.example.creation.factories.simple.SimplePizzaFactory;
import org.example.creation.factories.standard.store.NYPizzaStore;
import org.example.creation.factories.standard.store.PizzaStore;

public class Main {

  public static void main(String[] args) {

    System.out.println("*** EXECUTING SIMPLE EXAMPLE ***");
    executeSimpleExample();

    System.out.println("*** EXECUTING Standard EXAMPLE ***");
    executeStandardExample();

  }

  static void executeSimpleExample() {
    SimplePizzaFactory factory = new SimplePizzaFactory();
    Pizza pepperoniPizza = factory.makePizza("pepperoni");
  }

  static void executeStandardExample() {
    PizzaStore store = new NYPizzaStore();
    store.orderPizza("pepperoni");
  }
}

