package com.travelport.models;

public abstract class Fruit {
  private String name;
  private Double weight;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Double getWeight() {
    return weight;
  }

  public void setWeight(Double weight) {
    this.weight = weight;
  }

  public abstract boolean canBeAJuice();

}
