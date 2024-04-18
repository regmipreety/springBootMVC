package com.example.springboot.thymeleaf.interfaces;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.lang.annotation.Annotation;

public class UserNameConstraintValidator implements ConstraintValidator<UserName, String> {

    private String userNamePrefix;
    @Override
    public void initialize(UserName userName) {
        userNamePrefix = userName.value();
    }

    @Override
    public boolean isValid(String username, ConstraintValidatorContext constraintValidatorContext) {
        boolean result;

        if(username != null){
            result = username.startsWith(userNamePrefix);
        }
        else {
            result = true;
        }
        return result;
    }
}
