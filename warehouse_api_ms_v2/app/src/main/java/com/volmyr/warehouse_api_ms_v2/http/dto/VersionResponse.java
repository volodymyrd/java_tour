package com.volmyr.warehouse_api_ms_v2.http.dto;

import com.volmyr.warehouse_api_ms_v2.http.ApiRestController;

/**
 * Dto response for {@link ApiRestController#getVersion()} method.
 */
public final class VersionResponse {

  private final String version;

  public VersionResponse(String version) {
    this.version = version;
  }

  public String getVersion() {
    return version;
  }
}
