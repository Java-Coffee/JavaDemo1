//输入一个链表，输出该链表中倒数第k个结点。

public class logic_day14 {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(10);
        FindKthToTail(listNode,1);
    }
    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode FindKthToTail(ListNode list,int k) {
        if (list == null)   return list;

        ListNode node = list;
        int count = 0;
        while (node != null) {
            count++;
            node = node.next;
        }
        if (count < k)  return null;

        ListNode p = list;
        for (int i = 0; i < count - k; i++) {
            p = p.next;
        }

        return p;
    }
}
