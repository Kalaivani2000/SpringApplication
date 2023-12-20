package com.springapplicationproject.SpringMVCApplication.Controller;

import com.springapplicationproject.SpringMVCApplication.Dto.UserDto;
import com.springapplicationproject.SpringMVCApplication.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/index")
    public String getLogin(@ModelAttribute UserDto userDto){
        return "index";
    }
}
