package com.tamas.ravasz.learning.stockmarkettracker.stock;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface StockTickerRepository extends JpaRepository<StockTicker, UUID> {}
