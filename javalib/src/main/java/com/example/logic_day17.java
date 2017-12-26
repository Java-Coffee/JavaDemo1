

//输入一个复杂链表（每个节点中有节点值，以及两个指针，
//        一个指向下一个节点，另一个特殊指针指向任意一个节点），
//        返回结果为复制后复杂链表的head。
//        （注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
public class logic_day17 {
    public static void main(String[] args) {

    }
    public class RandomListNode {
        int label;
        RandomListNode next = null;
        RandomListNode random = null;

        RandomListNode(int label) {
            this.label = label;
        }
    }
    public RandomListNode Clone(RandomListNode pHead)
    {
        RandomListNode p=pHead;
        RandomListNode t=pHead;
        while(p!=null){
            RandomListNode q=new RandomListNode(p.label);
            q.next=p.next;
            p.next=q;
            p=q.next;
        }
        while(t!=null){
            RandomListNode q=t.next;
            if(t.random!=null)
                q.random=t.random.next;
            t=q.next;

        }
        RandomListNode s=new RandomListNode(0);
        RandomListNode s1=s;
        while(pHead!=null){
            RandomListNode  q=pHead.next;
            pHead.next=q.next;
            q.next=s.next;
            s.next=q;
            s=s.next;
            pHead=pHead.next;


        }
        return s1.next;

    }
}
