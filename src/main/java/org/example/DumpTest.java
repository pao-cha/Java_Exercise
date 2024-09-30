package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mingyu, guo
 * @date 2024-04-25 16:19
 */

public class DumpTest {
    static class OOMObject {
        public OOMObject() {
            System.out.println("hello world");
        }
    }

    public static void main(String[] args) {

        ArrayList<Integer>[] lis = new ArrayList[10];
        //初始化list数组
        for (int i = 1; i < lis.length; i++) {
            lis[i] = new ArrayList<>();
        }
        System.out.println(lis[1].add(1));
        System.out.println(lis[1].get(0));
    }
    OOMObject[] a = new OOMObject[100000000] ;
}