package org.fastsql.annotation;


import org.fastsql.entity.SQLExecuteType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface Automatic {

    SQLExecuteType value();



}
