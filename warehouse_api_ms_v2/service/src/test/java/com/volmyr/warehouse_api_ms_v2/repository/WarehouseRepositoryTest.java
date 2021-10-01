package com.volmyr.warehouse_api_ms_v2.repository;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * Tests for {@link WarehouseRepository}.
 */
class WarehouseRepositoryTest {

  private WarehouseRepository warehouseRepository = new WarehouseRepository(10);

  @Test
  void shouldCountsGoods() {
    // Arrange
    warehouseRepository = new WarehouseRepository(20);

    // Act and Assert
    assertThat(warehouseRepository.count()).isEqualTo(20);
  }

  @Test
  void shouldAddNewGoods() {
    // Arrange
    long numberOfGoodsBefore = warehouseRepository.count();

    // Act
    warehouseRepository.add();

    // Assert
    assertThat(warehouseRepository.count()).isEqualTo(numberOfGoodsBefore + 1);
  }

  @Test
  void shouldRemoveGoods() {
    // Arrange
    long numberOfGoodsBefore = warehouseRepository.count();

    // Act
    warehouseRepository.delete();

    // Assert
    assertThat(warehouseRepository.count()).isEqualTo(numberOfGoodsBefore - 1);
  }
}
