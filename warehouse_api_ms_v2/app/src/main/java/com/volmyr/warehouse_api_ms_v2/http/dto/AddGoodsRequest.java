package com.volmyr.warehouse_api_ms_v2.http.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.volmyr.warehouse_api_ms_v2.http.ApiRestController;

/**
 * Dto request for {@link ApiRestController#addGoods(AddGoodsRequest)} method.
 */
public final class AddGoodsRequest {

  private final String name;
  private final double price;

  public AddGoodsRequest(
      @JsonProperty("name") String name,
      @JsonProperty("price") double price) {
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
