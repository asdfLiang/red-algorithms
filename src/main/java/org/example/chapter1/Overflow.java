package org.example.chapter1;

/**
 * 整数溢出测试
 *
 * @author by liangzj
 * @since 2022/11/5 20:54
 */
public class Overflow {
    public static void main(String[] args) {
        // 溢出了会显示什么？
        int i = Integer.MAX_VALUE + 1;

        System.out.println(i);
    }
}
