package com.zapcorp.joinme.hello;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl  implements UserService {

    private final UserRepository userRepository;

    @Override
    public User createUser(UserCreateRequest request) {
        System.out.println(request);
        User user = new User();
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        return userRepository.saveAndFlush(user);
    }
}
