package com.volmyr.warehouse_api_ms_v2.http.dto;

import com.volmyr.warehouse_api_ms_v2.http.ApiRestController;

/**
 * Dto response for {@link ApiRestController#countGoods()} method.
 */
public final class CountGoodsResponse {

  private final String status;
  private final long count;

  public CountGoodsResponse(String status, long count) {
    this.status = status;
    this.count = count;
  }

  public String getStatus() {
    return status;
  }

  public long getCount() {
    return count;
  }
}
