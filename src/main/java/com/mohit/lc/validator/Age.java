package com.mohit.lc.validator;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = { AgeValidator.class })
public @interface Age {

	String message() default "{invalidAgeMessage}";

	int lower() default 18;

	int upper() default 75;

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

}
