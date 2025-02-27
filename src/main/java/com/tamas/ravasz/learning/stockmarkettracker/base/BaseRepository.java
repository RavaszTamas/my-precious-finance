package com.tamas.ravasz.learning.stockmarkettracker.base;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BaseRepository<T extends BaseEntity> extends JpaRepository<T, UUID> {}
