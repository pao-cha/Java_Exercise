package org.example;

import java.math.BigDecimal;

/**
 * @author mingyu, guo
 * @date 2024-05-30 16:22
 */

public class BigDecimalTest {

    public static void main(String[] args) {
        BigDecimal test = BigDecimal.valueOf(0.01);
        BigDecimalTest test1 = new BigDecimalTest();
        test1.test();
    }
    private void test() {
        BigDecimalTest a = this;
        System.out.println(a);
    }
}
