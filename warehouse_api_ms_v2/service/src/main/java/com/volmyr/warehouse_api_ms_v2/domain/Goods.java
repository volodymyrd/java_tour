package com.volmyr.warehouse_api_ms_v2.domain;

/**
 * Goods entity.
 */
public final class Goods {

  private final String name;
  private final double price;

  public Goods(String name, double price) {
    this.name = name;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public double getPrice() {
    return price;
  }
}
