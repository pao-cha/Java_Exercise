package org.example;

import java.util.Optional;

/**
 * @author mingyu, guo
 * @date 2024-05-15 09:14
 */

public class OptionalTest {

    public static void main(String[] args) {
        String a = "1";
        String b = Optional.ofNullable(a).orElseGet(OptionalTest::getName);
        System.out. println("  " + b);
    }
    private static String getName() {
        System.out.println("getname");
        return "mingyu";
    }
}