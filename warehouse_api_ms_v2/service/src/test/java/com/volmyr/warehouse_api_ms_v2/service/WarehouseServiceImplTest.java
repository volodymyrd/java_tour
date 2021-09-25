package com.volmyr.warehouse_api_ms_v2.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * Tests for {@link WarehouseServiceImpl}.
 */
class WarehouseServiceImplTest {

  private WarehouseService warehouseService = new WarehouseServiceImpl(10);

  @Test
  void shouldCountsGoods() {
    // Arrange
    warehouseService = new WarehouseServiceImpl(20);

    // Act and Assert
    assertThat(warehouseService.count()).isEqualTo(20);
  }

  @Test
  void shouldAddNewGoods() {
    // Arrange
    long numberOfGoodsBefore = warehouseService.count();

    // Act
    warehouseService.add();

    // Assert
    assertThat(warehouseService.count()).isEqualTo(numberOfGoodsBefore + 1);
  }

  @Test
  void shouldRemoveGoods() {
    // Arrange
    long numberOfGoodsBefore = warehouseService.count();

    // Act
    warehouseService.delete();

    // Assert
    assertThat(warehouseService.count()).isEqualTo(numberOfGoodsBefore - 1);
  }
}
