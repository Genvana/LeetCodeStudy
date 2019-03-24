package blog.genvana1314.study.leetcode.day01.question2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Question2Test {

    Question2 test;
    ListNode expected;
    ListNode l1;
    ListNode l2;

    @Before
    public void before(){
        test = new Question2();

        expected = new ListNode(0);
        expected.next = new ListNode(0);
        expected.next.next = new ListNode(1);

        l1 = new ListNode(1);

        l2 = new ListNode(9);
        l2.next = new ListNode(9);
    }

    @Test
    public void addTwoNumbers() {
        assertEquals(expected, test.addTwoNumbers(l1, l2));
    }
}