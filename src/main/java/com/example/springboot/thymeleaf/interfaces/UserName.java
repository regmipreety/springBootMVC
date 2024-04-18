package com.example.springboot.thymeleaf.interfaces;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = UserNameConstraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface UserName {
    //define default course code
    public String value() default "UNI";
    //define default error message
    public String message() default "must start with UNI";
    //define default groups which can be used to group constraints
    public Class<?>[] groups() default{};
    //define default payloads
    //Payloads provide custome details about validation failure eg severity level, error code etc.
    public Class <? extends Payload>[] payload() default{};
}
