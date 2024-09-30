package org.example;

/**
 * @author mingyu, guo
 * @date 2024-08-15 17:19
 */

public class OutPrinttest {
    public static void main(String[] args) throws InterruptedException {
        StringBuilder three = new StringBuilder("3");
        while (true) {
            System.out.println(three);
            three.append("3");
            Thread.sleep(100);
        }
    }
}
