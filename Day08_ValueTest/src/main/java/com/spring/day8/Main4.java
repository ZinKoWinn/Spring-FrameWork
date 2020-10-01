package com.spring.day8;

import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.SpelCompilerMode;
import org.springframework.expression.spel.SpelParserConfiguration;
import org.springframework.expression.spel.standard.SpelExpressionParser;



public class Main4 {
    public static void main(String[] args) {
        ExpressionParser parser = new SpelExpressionParser(
                new SpelParserConfiguration(SpelCompilerMode.IMMEDIATE,Main4.class.getClassLoader())
        );
        System.out.println(parser.parseExpression("'Hello'.concat('Spring')").getValue());
        System.out.println(parser.parseExpression("'2 + 2 equals ='.concat(2 + 2)").getValue());
        System.out.println(parser.parseExpression("new String('zin ko win').toUpperCase()").getValue());

    }
}
