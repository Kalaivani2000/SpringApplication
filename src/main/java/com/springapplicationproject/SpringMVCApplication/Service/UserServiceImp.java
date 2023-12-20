package com.springapplicationproject.SpringMVCApplication.Service;


import com.springapplicationproject.SpringMVCApplication.Dto.UserDto;
import com.springapplicationproject.SpringMVCApplication.Model.User;
import com.springapplicationproject.SpringMVCApplication.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public User save(UserDto userDto) {
        User user=new User(userDto.getMovieName(),userDto.getRating());
        return userRepository.save(user);
    }
}
