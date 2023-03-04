package org.example.chapter2;

import org.example.chapter2.base.Merge;

/**
 * 自底向上的归并排序
 *
 * @author by liangzj
 * @since 2022/12/19 22:58
 */
public class BottonUpMerge extends Merge {

    @Override
    public void sort(Comparable[] a) {}

    public static void main(String[] args) {
        test(new BottonUpMerge());
    }
}
