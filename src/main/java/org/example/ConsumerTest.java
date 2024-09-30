package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest {
    public static void main(String[] args) {
        // 创建一个字符串列表
        List<String> items = Arrays.asList("item1", "item2", "item3");
        List<String> list;
        // 定义一个消费者，用于处理列表中的每个元素
        Consumer<List<String>> processItems = new Consumer<List<String>>() {
            @Override
            public void accept(List<String> strings) {
                System.out.println("Processing items: " + strings);
            }
        };
        ConsumerTest consumerTest = new ConsumerTest();
        // 调用 rollback 方法，并传递定义好的消费者
        consumerTest.rollback("someData", processItems);
    }

    private void rollback(String a, Consumer<List<String>> consumer) {
        // 假设这里有一些逻辑处理
        System.out.println("Rollback with data: " + a);

        // 当所有准备工作完成之后，调用传入的消费者进行回调操作
        consumer.accept(Arrays.asList("data1", "data2", "data3"));
    }
}

