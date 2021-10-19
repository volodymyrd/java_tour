package com.volmyr.warehouse_api_ms_v2.http;

import com.volmyr.warehouse_api_ms_v2.domain.Goods;
import com.volmyr.warehouse_api_ms_v2.http.dto.AddGoodsRequest;
import com.volmyr.warehouse_api_ms_v2.http.dto.AddGoodsResponse;
import com.volmyr.warehouse_api_ms_v2.http.dto.CountGoodsResponse;
import com.volmyr.warehouse_api_ms_v2.http.dto.DeleteGoodsResponse;
import com.volmyr.warehouse_api_ms_v2.http.dto.VersionResponse;
import com.volmyr.warehouse_api_ms_v2.repository.WarehouseRepository;
import com.volmyr.warehouse_api_ms_v2.service.WarehouseService;
import com.volmyr.warehouse_api_ms_v2.service.WarehouseServiceImpl;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Main rest controller for API.
 */
@RestController
@RequestMapping(
    value = {"/api/v1"},
    produces = {"application/json"}
)
public final class ApiRestController {

  static final String VERSION = "v1.01";

  private final WarehouseService warehouseService;

  public ApiRestController() {
    this.warehouseService = new WarehouseServiceImpl(new WarehouseRepository(0));
  }

  @GetMapping(value = {"/version"})
  public VersionResponse getVersion() {
    return new VersionResponse(VERSION);
  }

  @PutMapping(value = {"/warehouse/goods"})
  public AddGoodsResponse addGoods(@RequestBody AddGoodsRequest addGoodsRequest) {
    Goods goods = new Goods(addGoodsRequest.getName(), addGoodsRequest.getPrice());
    warehouseService.add(goods);
    return new AddGoodsResponse("OK");
  }

  @DeleteMapping(value = {"/warehouse/goods"})
  public DeleteGoodsResponse deleteGoods() {
    warehouseService.delete();
    return new DeleteGoodsResponse("OK");
  }

  @GetMapping(value = {"/warehouse/count"})
  public CountGoodsResponse countGoods() {
    long count = warehouseService.count();
    return new CountGoodsResponse("OK", count);
  }
}
