package com.volmyr.warehouse_api_ms_v2.http.dto;

import com.volmyr.warehouse_api_ms_v2.http.ApiRestController;

/**
 * Dto response for {@link ApiRestController#addGoods(AddGoodsRequest)} method.
 */
public final class AddGoodsResponse {

  private final String status;

  public AddGoodsResponse(String status) {
    this.status = status;
  }

  public String getStatus() {
    return status;
  }
}
