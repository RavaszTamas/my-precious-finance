package com.tamas.ravasz.learning.stockmarkettracker;

import org.springframework.boot.SpringApplication;

public class TestStockMarketTrackerApplication {

    public static void main(String[] args) {
        SpringApplication.from(StockMarketTrackerApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
