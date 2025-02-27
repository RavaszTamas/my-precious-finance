package com.tamas.ravasz.learning.stockmarkettracker.user;

import com.tamas.ravasz.learning.stockmarkettracker.base.BaseRepository;

public interface UserRepository extends BaseRepository<User> {

  User findByEmail(String email);
}
