package com.dev.identra.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.time.LocalDate;

public class DobValidator implements ConstraintValidator<DobConstraint, LocalDate> {
    private int min;
    @Override
    public boolean isValid(LocalDate value, ConstraintValidatorContext context) {
        return false;
    }

    @Override
    public void initialize(DobConstraint constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
        min = constraintAnnotation.min();
    }
}
