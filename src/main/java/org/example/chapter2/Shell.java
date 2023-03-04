package org.example.chapter2;

import org.example.chapter2.base.SortExample;

/**
 * 希尔排序
 *
 * @author by liangzj
 * @since 2022/12/19 0:24
 */
public class Shell extends SortExample {
    @Override
    public void sort(Comparable[] a) {
        int N = a.length;
        int h = 1;

        while (h < N / 3) h = 3 * h + 1;
        while (h >= 1) {
            // 将数组变为h有序
            for (int i = h; i < N; i++) {
                // 将a[i]插入到a[i-h], a[i - 2h], a[i - 3h]...之中
                for (int j = i; j >= h && less(a[j], a[j - h]); j -= h) {
                    exchange(a, j, j - h);
                }
            }
            h /= 3;
        }
    }

    public static void main(String[] args) {
        test(new Shell());
    }
}
