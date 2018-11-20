package com.lena.hw.book2.annotations;

/*
Задание аннотации

 */

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.time.Duration;
import java.time.Instant;

public class ExamplesInvocationHandler implements InvocationHandler {

    public static void main(String[] args) {
        Examples examples = (Examples) Proxy.newProxyInstance(Examples.class.getClassLoader(), new Class[]{Examples.class}, new ExamplesInvocationHandler());

        examples.stringConcat();
        examples.stringConcatTime();
        examples.stringBuilderAppendTime();

    }

    private Examples examples = new ExamplesImpl();

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // Если аннотация отсутствует, он перенаправляется на обычное выполнение (без подсчета времени)
        if (!method.isAnnotationPresent(Clocking.class)) {
            return method.invoke(examples, args);
        }

        // Иначе засекаем время выполнения метода
        Instant start = Instant.now();
        Object returnObj = method.invoke(examples, args);
        Instant end = Instant.now();

        System.out.println("Метод " + method.getName() + " выполнен за " + Duration.between(end, start) + ".");

        return returnObj;
    }

    private static class ExamplesImpl implements Examples {

        public void stringConcat () {
            String c = "Использовали аннотации для подсчета ";
            String d = "времени в методе!";
            String e = c+d;
            System.out.println(e);
        }

        @Override
        public void stringConcatTime() {
            System.out.println("stringConcatTime вызван!");
            String s = " ";
            for (int i = 0; i< 100000; i++)
                s += "*";
        }

        @Override
        public void stringBuilderAppendTime() {
            System.out.println("stringBuilderTime вызван!");
            StringBuilder b = new StringBuilder(" ");
            for (int i = 0; i< 100000; i++)
                b.append("*");
        }


    }
}
