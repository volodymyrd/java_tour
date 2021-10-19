package com.volmyr.warehouse_api_ms_v2.http.dto;

import com.volmyr.warehouse_api_ms_v2.http.ApiRestController;

/**
 * Dto response for {@link ApiRestController#deleteGoods()} method.
 */
public final class DeleteGoodsResponse {

  private final String status;

  public DeleteGoodsResponse(String status) {
    this.status = status;
  }

  public String getStatus() {
    return status;
  }
}
