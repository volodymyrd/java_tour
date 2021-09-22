package com.volmyr.warehouse_api_ms_v2.service;

/**
 * Implementation of {@link WarehouseService}.
 */
public final class WarehouseServiceImpl implements WarehouseService {

  private long numberOfGoods;

  public WarehouseServiceImpl(long numberOfGoods) {
    this.numberOfGoods = numberOfGoods;
  }

  @Override
  public void add() {
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
