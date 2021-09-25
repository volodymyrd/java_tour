package com.volmyr.warehouse_api_ms_v2.service;

import com.volmyr.warehouse_api_ms_v2.domain.Goods;

/**
 * Implementation of {@link WarehouseService}.
 */
public final class WarehouseServiceImpl implements WarehouseService {

  private long numberOfGoods;

  public WarehouseServiceImpl(long numberOfGoods) {
    this.numberOfGoods = numberOfGoods;
  }

  @Override
  public void add(Goods goods) {
    numberOfGoods++;
  }

  @Override
  public void delete() {
    numberOfGoods--;
  }

  @Override
  public long count() {
    return numberOfGoods;
  }
}
