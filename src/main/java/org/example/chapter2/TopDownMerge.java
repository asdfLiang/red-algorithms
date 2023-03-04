package org.example.chapter2;

import org.example.chapter2.base.Merge;

/**
 * 自顶向下的归并排序
 *
 * @author by liangzj
 * @since 2022/12/19 22:58
 */
public class TopDownMerge extends Merge {

    @Override
    public void sort(Comparable[] a) {
        aux = new Comparable[a.length]; // 一次性分配空间
        mergeSort(a, 0, a.length - 1);
    }

    private void mergeSort(Comparable[] a, int lo, int hi) {
        if (hi <= lo) return;
        int mid = lo + (hi - lo) / 2;
        mergeSort(a, lo, mid); // 将左半边排序
        mergeSort(a, mid + 1, hi); // 将右半边排序
        merge(a, lo, mid, hi); // 归并结果
    }

    public static void main(String[] args) {
        test(new TopDownMerge());
    }
}
