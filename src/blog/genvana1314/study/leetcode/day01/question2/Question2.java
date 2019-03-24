package blog.genvana1314.study.leetcode.day01.question2;

public class Question2 {

    /*
    简单加法实现：
        1.相同的位相加，空位为0
        2.相加超过10，进1位
        3.全部位数加完了，还有进位，则加一位，值为1
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode temp = result;
        int flag = 0;
        if(l1 != null && l2 != null){
            while (l1 != null || l2 != null) {
                int a = l1 != null ? l1.val : 0;
                int b = l2 != null ? l2.val : 0;
                int sum = a + b + flag;
                flag = sum >= 10 ? 1: 0;//优雅一点就是：sum / 10
                temp.next = new ListNode(sum % 10);
                temp = temp.next;
                l1 = l1 != null ? l1.next : null;
                l2 = l2 != null ? l2.next : null;
            }
            if (flag > 0) {
                temp.next = new ListNode(1);
            }
            return result.next;
        }else {
            return null;
        }
    }
}
