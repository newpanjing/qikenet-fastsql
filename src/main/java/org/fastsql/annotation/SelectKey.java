package org.fastsql.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface SelectKey {

    String value() default "";

    String keyProperty() default "";

    String statement() default "select @@IDENTITY";

    boolean before() default false;

}
