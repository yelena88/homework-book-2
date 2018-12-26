package com.lena.hw.book2.ex6;

public class Test2 {
    private static Logger logger = Logger.getInstance();

    public void exceptionThrowing() {
        try {
            int[] firstNumber = new int[5];
            firstNumber[5] = 0;
        } catch (Exception e) {
            logger.log(e, e.toString());
        }
    }
}
