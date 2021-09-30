package com.volmyr.warehouse_api_ms_v2.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/*
 * Application entry point.
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.volmyr")
public class App {

  public static void main(String[] args) {
    SpringApplication.run(App.class, args);
  }
}
