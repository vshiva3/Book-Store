package com.knowledgebookstore.booksstore.customvalidators;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = BookExistsLogic.class)
public @interface CheckIfBookExists {
    String message() default "Invalid";
    Class<?>[] groups() default{};
    Class<? extends Payload>[] payload() default{};
}
