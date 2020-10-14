package com.spring.day17.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ConnectionInvocationHandler implements InvocationHandler {
    private final Connection connection;

    public static Set<String> LOGGABLe = new HashSet<>(Arrays.asList("commit", "rollback", "close"));

    public ConnectionInvocationHandler(Connection connection) {
        this.connection = connection;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (shouldLogInvocation(method))
            System.out.println("Connection Trace " + method.toGenericString());
        return method.invoke(connection, args);
    }

    private boolean shouldLogInvocation(Method method) {
        return LOGGABLe.contains(method.getName());
    }
}
