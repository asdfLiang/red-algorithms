package org.example.chapter1;

/**
 * 二分查找
 *
 * @author by liangzj
 * @since 2022/11/5 17:41
 */
public class BinarySearch {
    public static void main(String[] args) {
        //
        int[] a1 = new int[] {10, 11, 12, 16, 18, 23, 29, 33, 48, 54, 57, 68, 77, 84, 98};

        System.out.println(rank(48, a1));
    }

    private static int rank(int key, int[] a) {
        int low = 0;
        int high = a.length;
        int mid;

        while (low <= high) {
            mid = low + (high - low) / 2;
            if (key > a[mid]) low = mid + 1;
            else if (key < a[mid]) high = mid - 1;
            else return mid;
        }

        return -1;
    }
}
