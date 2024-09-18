package com.travelport.store;

import com.travelport.models.Fruit;
import java.util.List;

public class Store {
  private List<Fruit> fruits;

  public List<Fruit> getFruits() {
    return fruits;
  }

  public void setFruits(List<Fruit> fruits) {
    this.fruits = fruits;
  }
}
