package org.example.chapter2;

import org.example.chapter2.base.SortExample;

/**
 * 插入排序
 *
 * @author by liangzj
 * @since 2022/12/19 0:02
 */
public class Insertion extends SortExample {
    @Override
    public void sort(Comparable[] a) {
        int N = a.length;

        // 比较范围i~N
        for (int i = 1; i < N; i++) {
            // 比较范围 1~i，把j一步一步向前移到正确位置
            for (int j = i; j > 0 && less(a[j], a[j - 1]); j--) {
                exchange(a, j, j - 1);
            }
        }
    }

    public static void main(String[] args) {
        test(new Insertion());
    }
}
