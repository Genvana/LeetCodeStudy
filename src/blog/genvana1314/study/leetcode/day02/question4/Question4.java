package blog.genvana1314.study.leetcode.day02.question4;

import java.util.ArrayList;
import java.util.Arrays;

public class Question4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] a;//长数组
        int[] b;//短数组
        if ( nums1 != null) {
            if ( nums2 != null) {
                if (nums1.length >= nums2.length) {
                    a = nums1;
                    b = nums2;
                }else {
                    a = nums2;
                    b = nums1;
                }
            }else {
                a = nums1;
                b = null;
            }
        }else {
            a = null;
            b = nums1;
        }

        int addLength = 0;
        if (b != null) {
            addLength = b.length;
        }
        int[] c = new int[addLength];

        for (int i = 0; i < a.length; i++){

        }

        return 0;
    }
}
