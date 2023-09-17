package com.SecurityDatabase.service;

import com.SecurityDatabase.dto.UserDto;
import com.SecurityDatabase.model.User;

public interface UserService {
	User findByUsername(String username);
	User save(UserDto userDto);

}
