package com.farmer.milk.controller;

import com.farmer.milk.app.UserApp;
import com.farmer.milk.model.UserDetails;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController implements UserApp {
    @Override
    public ResponseEntity<String> registerUser(UserDetails user) {
        return null;
    }

    @Override
    public ResponseEntity<String> loginUser(String emailId, String password) {
        return null;
    }
}
