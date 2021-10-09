package com.gmail.klewzow;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Target(value = { ElementType.FIELD })
@Retention(RUNTIME)
public @interface SaveFields {
	String path() default "text.txt";
}
 
