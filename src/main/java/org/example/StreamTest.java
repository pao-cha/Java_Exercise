package org.example;

import java.time.LocalTime;
import java.util.*;

/**
 * @author mingyu, guo
 * @date 2024-06-03 10:27
 */

public class StreamTest {
    public static void main(String[] args) {

        String a = "11";
        String b = getString(a);
        System.out.println(a);
        System.out.println(b);
    }
    private static String getString(String a) {
        a = "23";
        return a;
    }
}
