package com.tamas.ravasz.learning.stockmarkettracker.stock;

import com.tamas.ravasz.learning.stockmarkettracker.base.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Builder
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "stock_ticker")
public class StockTicker extends BaseEntity {

    @Column(nullable = false, length = 255)
    String name;



}
