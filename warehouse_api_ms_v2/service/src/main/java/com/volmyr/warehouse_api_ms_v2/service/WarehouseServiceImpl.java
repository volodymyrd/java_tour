package com.volmyr.warehouse_api_ms_v2.service;

import com.volmyr.warehouse_api_ms_v2.domain.Goods;

import com.volmyr.warehouse_api_ms_v2.repository.WarehouseRepository;

/**
 * Implementation of {@link WarehouseService}.
 *
 * Should be stateless!.
 */
public final class WarehouseServiceImpl implements WarehouseService {

  private final WarehouseRepository warehouseRepository;

  public WarehouseServiceImpl(WarehouseRepository warehouseRepository) {
    this.warehouseRepository = warehouseRepository;
  }

  @Override
  public void add(Goods goods) {
    warehouseRepository.add();
  }

  @Override
  public void delete() {
    warehouseRepository.delete();
  }

  @Override
  public long count() {
    return warehouseRepository.count();
  }
}
