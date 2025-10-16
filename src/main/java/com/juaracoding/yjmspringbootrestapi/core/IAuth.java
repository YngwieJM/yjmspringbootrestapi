package com.juaracoding.yjmspringbootrestapi.core;

import com.juaracoding.yjmspringbootrestapi.model.Users;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;

public interface IAuth<T> {
    public ResponseEntity<Object> login(Users users, HttpServletRequest request);//181-190
}
