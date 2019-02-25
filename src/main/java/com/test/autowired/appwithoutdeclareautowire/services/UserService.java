package com.test.autowired.appwithoutdeclareautowire.services;

import com.test.autowired.appwithoutdeclareautowire.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private User user;

    public UserService(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }
}
