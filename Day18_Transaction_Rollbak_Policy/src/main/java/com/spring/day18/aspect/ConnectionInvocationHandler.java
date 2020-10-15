package com.spring.day18.aspect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ConnectionInvocationHandler implements InvocationHandler {
    private final Connection connection;

    public ConnectionInvocationHandler(Connection connection) {
        this.connection = connection;
    }

    private static Set<String> loggable = new HashSet<>(Arrays.asList("commit", "rollback", "close"));

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (shouldLogInvocation(method))
            System.out.println("Connection Trace " + method.toGenericString());
        return method.invoke(connection, args);
    }

    public boolean shouldLogInvocation(Method method) {
        return loggable.contains(method.getName());
    }
}
