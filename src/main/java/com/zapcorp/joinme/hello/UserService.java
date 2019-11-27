package com.zapcorp.joinme.hello;

import org.springframework.stereotype.Service;

public interface UserService {

    User createUser(UserCreateRequest request);
}
