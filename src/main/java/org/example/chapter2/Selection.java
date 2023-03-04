package org.example.chapter2;

import org.example.chapter2.base.SortExample;

/**
 * 选择排序，最简单的排序
 *
 * @author by liangzj
 * @since 2022/12/18 23:47
 */
public class Selection extends SortExample {
    @Override
    public void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 0; i < N - 1; i++) {
            // 记录最小值的id，然后和i位置交换
            int min = i;
            for (int j = i + 1; j < N; j++) {
                if (less(a[j], a[min])) min = j;
                exchange(a, i, min);
            }
        }
    }

    public static void main(String[] args) {
        test(new Selection());
    }
}
