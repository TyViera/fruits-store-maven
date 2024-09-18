package com.travelport;

import com.travelport.models.Apple;
import com.travelport.models.Cucumber;
import com.travelport.models.Watermelon;
import com.travelport.store.Operation;
import com.travelport.store.OperationImpl;
import com.travelport.store.Store;
import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    var store = new Store();
    store.setFruits(new ArrayList<>());

    var apple = new Apple();
    apple.setName("Apple");
    apple.setWeight(0.2);
    store.getFruits().add(apple);

    var watermelon = new Watermelon();
    watermelon.setName("Watermelon");
    watermelon.setWeight(2.0);
    store.getFruits().add(watermelon);

    var cucumber = new Cucumber();
    cucumber.setName("Cucumber");
    cucumber.setWeight(0.8);
    store.getFruits().add(cucumber);

    Operation operation = new OperationImpl();
    try {
      operation.sale(watermelon, 1);
      operation.sale(apple, 3);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
