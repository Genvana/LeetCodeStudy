package blog.genvana1314.study.leetcode.day01.question2;

import java.util.List;

public class ListNode {
    int val;
    ListNode next;
    public ListNode(int val){
        this.val = val;
    }

    /**
     * 为了测试类还得写个equals-.-
     * @param obj 比较对象
     * @return 是否相同
     */
    @Override
    public boolean equals(Object obj) {
        ListNode self = this;
        ListNode node = (ListNode) obj;
        boolean result = true;
        do{
            if(self.val == node.val){
                self = self.next;
                node = node.next;
            }else{
                result = false;
                //break别忘了
                break;
            }
        }while (self != null);
        if(node != null){
            result = false;
        }
        return result;
    }
}
