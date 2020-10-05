package com.spring.day11.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CurrenciesServiceAspect {
    @Pointcut("@annotation(com.spring.day11.annotation.InTransaction)")
    public void transactionAnnotationPointCut() {
    }

    // @Before("transactionAnnotationPointCut()")
    public void beforeTransactionAnnotationAdvice() {
        System.out.println("Before - transactionAnnotationPointCut()");
    }

    @Pointcut("within(com.spring.day11.bls.*)")
    public void blsPackagePointCut() {
    }

    //  @Before("blsPackagePointCut()")
    public void beforeBlsPackageAdvice(JoinPoint joinPoint) {
        System.out.println("Before - blsPackagePointCut()" + joinPoint.getSignature());
    }

    @Pointcut("@within(com.spring.day11.annotation.Secured)")
    public void SecuredClassPointCut() {

    }

    //@Before("SecuredClassPointCut()")
    public void beforeSecuredClassAdvice(JoinPoint joinPoint) {
        System.out.println("Before - SecuredClassPointCut()" + joinPoint.getSignature());

    }

    @Pointcut("execution(* com.spring.day11.bls.CurrencyService.getExchangeRate(..))")
    public void getExchangeRateMethodPointCut() {

    }

    // @Around("getExchangeRateMethodPointCut()")
    public Object beforeGetExchangeRateMethodAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        try {
            System.out.println("Before - getExchangeRateMethodPointCut()");
            return proceedingJoinPoint.proceed();
        } finally {
            System.out.println("After - getExchangeRateMethodPointCut()");
        }
    }

    @Pointcut("bean(currency_service)")
    public void namedBeanPointCut() {

    }

    //@After("namedBeanPointCut()")
    public void afterNamedBeanAdvice() {
        System.out.println("After - namedBeanPointCut()");
    }

    @Pointcut("args(String,String,int)")
    public void stringAndIntArgumentMethodPointCut() {

    }

    //@After("stringAndIntArgumentMethodPointCut()")
    public void afterStringAndIntArgumentMethodAdvice(JoinPoint joinPoint) {
        System.out.println("After - stringAndIntArgumentMethodPointCut()" + joinPoint.getSignature());
    }

    @Pointcut("@args(com.spring.day11.annotation.Validated)")
    public void validatedArgumentPointCut() {

    }

    // @After("validatedArgumentPointCut()")
    public void afterValidatedArgumentAdvice() {
        System.out.println("After - validatedArgumentPointCut()");
    }

    @Pointcut("target(com.spring.day11.bls.CurrencyService)")
    public void currencyServiceTargetPointCut() {

    }

    //@After("currencyServiceTargetPointCut()")
    public void afterCurrencyServiceTargetAdvice() {
        System.out.println("After - currencyServiceTargetPointCut()");
    }

    @Pointcut("@target(com.spring.day11.annotation.Secured)")
    public void currencyServiceSecuredTargetPointCut() {

    }

    //@After("currencyServiceSecuredTargetPointCut()")
    public void afterCurrencyServiceSecuredTargetAdvice() {
        System.out.println("After - currencyServiceSecuredTargetPointCut()");
    }

    @Pointcut("this(com.spring.day11.bls.CurrencyService)")
    public void currencyServiceThisPointCut() {

    }

    // @After("currencyServiceThisPointCut()")
    public void afterCurrencyServiceThisPointCut() {
        System.out.println("After - currencyServiceThisPointCut()");
    }

    @Pointcut("blsPackagePointCut() || transactionAnnotationPointCut()")
    public void blsPackageAndTransactionPointCut() {

    }

    //@After("blsPackageAndTransactionPointCut()")
    public void afterBlsAndTransactionAdvice() {
        System.out.println("After - blsPackageAndTransactionPointCut()");
    }

    //@AfterThrowing(value = "execution(* com.spring.day11.bls.CurrencyService.getCurrencyCountryName(..))", throwing = "exception")
    public void afterThrowingAdvice(Exception exception) {
        System.out.println("Exception was thrown from getCurrencyCountryName : " + exception.getClass().getName());
    }

    @AfterReturning(value = "execution(* com.spring.day11.bls.CurrencyService.getCurrencyCountryName(..))", returning = "value")
    public void afterReturning(String value) {
        System.out.println("Value returned from getCurrencyCountryName : " + value);
    }


}
