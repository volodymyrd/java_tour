package com.volmyr.warehouse_api_ms_v2.service;

import com.volmyr.warehouse_api_ms_v2.domain.Goods;

/**
 * Main warehouse service, responsible for CRUD operations on the warehouse.
 */
public interface WarehouseService {

  /**
   * Adds a new goods to the warehouse.
   */
  void add(Goods goods);

  /**
   * Deletes goods from the warehouse.
   */
  void delete();

  /**
   * Counts goods in the warehouse.
   */
  long count();
}
