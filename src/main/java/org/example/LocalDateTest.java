package org.example;

import java.time.LocalDate;

/**
 * @author mingyu, guo
 * @date 2024-05-16 11:03
 */

public class LocalDateTest {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date.plusYears(1)
        );
    }
}
