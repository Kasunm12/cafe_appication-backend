package com.inn.cafe.serviceImpl;

import com.inn.cafe.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service

public class UserServiceImpl implements UserService {
    @Slf4j
    @Override
    public ResponseEntity<String> signUp(Map<String, String> requestMap) {
        return null;
    }
}
