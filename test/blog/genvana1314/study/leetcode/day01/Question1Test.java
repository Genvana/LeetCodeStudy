package blog.genvana1314.study.leetcode.day01;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Question1Test {
    Question1 test;

    @Before
    public void Before(){
        test = new Question1();
    }

    @Test
    public void twoSum() {
        assertArrayEquals(new int[]{0,1},test.twoSum(new int[]{2,7,11,15}, 9));
    }

    @Test
    public void twoSumBetter() {
        assertArrayEquals(new int[]{0,1},test.twoSum(new int[]{2,7,11,15}, 9));
    }
}