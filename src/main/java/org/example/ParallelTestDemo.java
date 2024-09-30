package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author mingyu, guo
 * @date 2024-04-29 15:04
 */

public class ParallelTestDemo {
    public static void main(String[] args) {
        //创建集合大小为100
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 100; i++){
            integers.add(i);
        }
        //多管道遍历
        List<Integer> integerList = new ArrayList<>();
        integers.parallelStream().forEach(e -> {
            //添加list的方法
            integerList.add(e);
            try {
                //休眠100ms，假装执行某些任务
                Thread.sleep(100);
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
        });
        System.out.println(integerList.size());
    }


}
