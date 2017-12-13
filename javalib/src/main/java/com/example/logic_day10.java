

import java.util.ArrayList;
import java.util.Stack;

public class logic_day10 {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ArrayList<Integer> arrayList = printListFromTailToHead(listNode);
        System.out.println("array = "+arrayList.toString());
    }
    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> stack = new Stack<>();
        while (listNode != null) {
            stack.push(listNode.val);
            listNode = listNode.next;
        }

        ArrayList<Integer> list = new ArrayList<>();
        while (!stack.isEmpty()) {
            list.add(stack.pop());
        }
        return list;
    }
}
