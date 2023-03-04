package org.example.chapter2.base;

/**
 * 排序算法模板
 *
 * @author by liangzj
 * @since 2022/12/18 23:35
 */
public abstract class SortExample {

    private static final String[] s =
            new String[] {"S", "O", "R", "T", "E", "X", "A", "M", "P", "L", "E"};

    public abstract void sort(Comparable[] a);

    protected boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    protected void exchange(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    protected void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) System.out.print(a[i] + " ");
        System.out.println();
    }

    protected boolean isSorted(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[i - 1])) {
                return false;
            }
        }
        return true;
    }

    protected static void test(SortExample sortExample) {
        sortExample.sort(s);
        sortExample.show(s);
        System.out.println(sortExample.isSorted(s));
    }
}
