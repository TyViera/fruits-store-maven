package com.travelport.store;

import com.travelport.models.Fruit;

public interface Operation {

  void sale(Fruit fruit, int quantity) throws Exception;

}
