package com.volmyr.warehouse_api_ms_v2.repository;

/**
 * Warehouse repository.
 */
public final class WarehouseRepository {

  private long numberOfGoods;

  public WarehouseRepository(long numberOfGoods) {
    this.numberOfGoods = numberOfGoods;
  }

  public void add() {
    numberOfGoods++;
  }

  public void delete() {
    numberOfGoods--;
  }

  public long count() {
    return numberOfGoods;
  }
}
