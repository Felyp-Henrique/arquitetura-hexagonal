package com.github.felyphenrique.hexagonal.application.core.adapters;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.annotation.Conditional;
import org.springframework.core.type.AnnotatedTypeMetadata;

@Target({ ElementType.TYPE, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Conditional(ContextIntegrationAdapter.ContextCondition.class)
public @interface ContextIntegrationAdapter {
    public static final String QUALIFIER_NAME = "integration";

    public static class ContextCondition implements Condition {

        @Override
        public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
            return context.getEnvironment().getProperty("app.adapter", "").trim().equals(QUALIFIER_NAME);
        }
    }
}
