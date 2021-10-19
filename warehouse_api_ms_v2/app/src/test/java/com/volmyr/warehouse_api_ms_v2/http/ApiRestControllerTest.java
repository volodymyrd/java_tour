package com.volmyr.warehouse_api_ms_v2.http;

import static com.volmyr.warehouse_api_ms_v2.http.ApiRestController.VERSION;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.volmyr.warehouse_api_ms_v2.http.dto.AddGoodsRequest;
import com.volmyr.warehouse_api_ms_v2.http.dto.AddGoodsResponse;
import com.volmyr.warehouse_api_ms_v2.http.dto.CountGoodsResponse;
import com.volmyr.warehouse_api_ms_v2.http.dto.DeleteGoodsResponse;
import com.volmyr.warehouse_api_ms_v2.http.dto.VersionResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
 * Tests for {@link ApiRestController}.
 */
@ExtendWith(MockitoExtension.class)
class ApiRestControllerTest {

  private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
  private MockMvc mockMvc;

  @InjectMocks
  private ApiRestController apiRestController;

  @BeforeEach
  void setUp() {
    mockMvc = MockMvcBuilders
        .standaloneSetup(apiRestController)
        .build();
  }

  @Test
  void shouldReturnsVersion() throws Exception {
    mockMvc.perform(get("/api/v1/version"))
        .andExpect(status().isOk())
        .andExpect(content().contentType(MediaType.APPLICATION_JSON))
        .andExpect(content().json(OBJECT_MAPPER.writeValueAsString(new VersionResponse(VERSION))));
  }

  @Test
  void shouldAddGoods() throws Exception {
    mockMvc.perform(
            post("/api/v1/warehouse/goods")
                .contentType(MediaType.APPLICATION_JSON)
                .content(OBJECT_MAPPER.writeValueAsString(new AddGoodsRequest("table", 20.0))))
        .andExpect(status().isOk())
        .andExpect(content().contentType(MediaType.APPLICATION_JSON))
        .andExpect(content().json(OBJECT_MAPPER.writeValueAsString(new AddGoodsResponse("OK"))));
  }

  @Test
  void shouldDeleteGoods() throws Exception {
    mockMvc.perform(delete("/api/v1/warehouse/goods"))
        .andExpect(status().isOk())
        .andExpect(content().contentType(MediaType.APPLICATION_JSON))
        .andExpect(content().json(OBJECT_MAPPER.writeValueAsString(new DeleteGoodsResponse("OK"))));
  }

  @Test
  void shouldCountGoods() throws Exception {
    mockMvc.perform(get("/api/v1/warehouse/count"))
        .andExpect(status().isOk())
        .andExpect(content().contentType(MediaType.APPLICATION_JSON))
        .andExpect(content()
            .json(OBJECT_MAPPER.writeValueAsString(new CountGoodsResponse("OK", 0))));
  }
}
