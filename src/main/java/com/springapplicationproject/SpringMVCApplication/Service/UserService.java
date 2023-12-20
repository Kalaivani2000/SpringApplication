package com.springapplicationproject.SpringMVCApplication.Service;

import com.springapplicationproject.SpringMVCApplication.Dto.UserDto;
import com.springapplicationproject.SpringMVCApplication.Model.User;

public interface UserService {
    User save(UserDto userDto);
}
