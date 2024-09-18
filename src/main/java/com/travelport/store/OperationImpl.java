package com.travelport.store;

import com.travelport.models.Fruit;

public class OperationImpl implements Operation {

  @Override
  public void sale(Fruit fruit, int quantity) throws Exception {
    if (fruit.canBeAJuice()) {
      System.out.println("Sale!");
    } else {
      throw new Exception("This fruit can't be a juice, sorry!");
    }
  }
}
