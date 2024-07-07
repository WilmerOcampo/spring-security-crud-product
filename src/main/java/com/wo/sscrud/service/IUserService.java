package com.wo.sscrud.service;

import com.wo.sscrud.entity.User;

import java.util.Optional;

public interface IUserService {
    User save(User user);
    Optional<User> findByEmail(String email);
}
