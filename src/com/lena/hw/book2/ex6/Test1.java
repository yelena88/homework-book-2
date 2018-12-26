package com.lena.hw.book2.ex6;

public class Test1 {
    private static Logger logger = Logger.getInstance();

    public void exceptionThrowing() {
        try {
            int firstNumber = 10;
            int secondNumber = 0;
            int result = firstNumber / secondNumber;
        } catch (Exception e) {
            logger.log(e, e.toString());
        }
    }
}
