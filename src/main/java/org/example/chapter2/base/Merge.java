package org.example.chapter2.base;

/**
 * @author by liangzj
 * @since 2022/12/19 23:18
 */
public abstract class Merge extends SortExample {

    /** 归并所需要的辅助数组 */
    protected Comparable[] aux;

    /**
     * 原地归并
     *
     * @param a
     * @param lo
     * @param mid
     * @param hi
     */
    protected void merge(Comparable[] a, int lo, int mid, int hi) {
        int i = lo, j = mid + 1;

        // 将a[lo...hi]复制到aux[lo...hi]
        for (int k = lo; k <= hi; k++) aux[k] = a[k];

        // 归并回到a[ol..hi]
        for (int k = lo; k <= hi; k++)
            if (i > mid) a[k] = aux[j++];
            else if (j > hi) a[k] = aux[i++];
            else if (less(aux[j], aux[i])) a[k] = aux[j++];
            else a[k] = aux[i++];
    }
}
