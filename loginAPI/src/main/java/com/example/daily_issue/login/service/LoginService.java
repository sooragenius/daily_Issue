package com.example.daily_issue.login.service;

import com.example.daily_issue.login.domain.User;
import com.example.daily_issue.login.domain.repository.UserRepository;
import com.example.daily_issue.login.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoginService {

    @Autowired
    private UserRepository userRepository;

    public Optional<User> findByUserId(String userId) {
        return userRepository.findByUserId(userId);
    }

    public boolean login(UserDto userDto) {
        Optional<User> originUser = findByUserId(userDto.getUserId());

        if (originUser.isPresent()) {
            User user = originUser.get();
            if(user.passwordConfirm(userDto.getPassword())){
                return true;
            }
        }
        return false;
    }

}
