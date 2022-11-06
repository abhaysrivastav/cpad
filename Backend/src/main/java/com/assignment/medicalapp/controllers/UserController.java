package com.assignment.medicalapp.controllers;

import com.assignment.medicalapp.dto.user.SignInDto;
import com.assignment.medicalapp.dto.user.SignInResponseDto;
import com.assignment.medicalapp.dto.user.SignupDto;
import com.assignment.medicalapp.exceptions.AuthenticationFailException;
import com.assignment.medicalapp.exceptions.CustomException;
import com.assignment.medicalapp.dto.user.SignUpResponseDto;
import com.assignment.medicalapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("user")
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/signup")
    public SignUpResponseDto Signup(@RequestBody SignupDto signupDto) throws CustomException {
        return userService.signUp(signupDto);
    }

    @PostMapping("/signIn")
    public SignInResponseDto SignIn(@RequestBody SignInDto signInDto) throws CustomException, AuthenticationFailException {
        return userService.signIn(signInDto);
    }

}
