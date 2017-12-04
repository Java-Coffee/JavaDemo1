
public class logic_day5 {
    public static class Tree{
        public int value;
        public Tree left;
        public Tree right;
        public Tree(int value){
            this.value = value;
        }
    }

    public static void main(String[] args) {
        int[] preOrder = {1,2,4,5,3,6,7};
        int[] midOrder = {4,2,5,1,6,3,7};
        getBehindOrder(preOrder,midOrder);
    }

    public static void getBehindOrder(int[] preOrder,int[] midOrder){
        if(preOrder == null || midOrder == null||preOrder.length!= midOrder.length){
            return;
        }
        Tree root = buildTree(preOrder,midOrder);
        OrderByBehind(root);
    }

    private static void OrderByBehind(Tree root) {
        if(root == null){
            return;
        }
        if(root.left != null){
            OrderByBehind(root.left);
        }
        if(root.right != null){
            OrderByBehind(root.right);
        }
        System.out.print(root.value+"");
    }

    private static Tree buildTree(int[] preOrder, int[] midOrder) {
        int value = preOrder[0];
        Tree root = new Tree(value);

        int len = preOrder.length;
        if(len <= 1){
            return root;
        }

        int index = 0;

        while (midOrder[index] != value && index < len-1){
            index++;
        }

        if(index > 0){
            int[] subLeftMidOrder = new int[index];
            int[] subLeftPreOrder = new int[index];
            int[] subRightMidOrder = new int[len-index-1];
            int[] subRightPreOrder = new int[len-index-1];
            for(int i = 0;i<index;i++){
                subLeftMidOrder[i] = midOrder[i];
                subLeftPreOrder[i] = preOrder[i+1];
                root.left =  buildTree(subLeftPreOrder,subLeftMidOrder);
            }
            if(len - index -1 >0) {
                for (int i = 0; i < len - index - 1; i++) {
                    subRightMidOrder[i] = midOrder[i + index + 1];
                    subRightPreOrder[i] = preOrder[i + index + 1];
                    root.right = buildTree(subRightPreOrder,subRightMidOrder);
                }

            }
        }
        return root;
    }
}
