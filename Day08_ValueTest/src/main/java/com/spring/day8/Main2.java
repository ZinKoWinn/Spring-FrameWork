package com.spring.day8;

import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        ExpressionParser expressionParser = new SpelExpressionParser();
        System.out.println(expressionParser.parseExpression("'Hello'.concat('Spring')").getValue());
        System.out.println(expressionParser.parseExpression("'2 + 2 equal ='.concat(2 + 2)").getValue());
        System.out.println(expressionParser.parseExpression("new String('Learn Spring Framework'.toUpperCase())").getValue());
        System.out.println(expressionParser.parseExpression("20 * 60 ").getValue());
        System.out.println(expressionParser.parseExpression("{1, 2, 3}").getValue());
        System.out.println(expressionParser.parseExpression("{a:1, b:2, c:3}").getValue());
        System.out.println(Arrays.toString((int[])expressionParser.parseExpression("new int[]{1,2,3}").getValue()));
        System.out.println(expressionParser.parseExpression("3 < 11").getValue());
    }
}
