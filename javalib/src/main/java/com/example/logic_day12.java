package com.example;

//题目描述
//        操作给定的二叉树，将其变换为源二叉树的镜像。
//        输入描述:
//        二叉树的镜像定义：源二叉树
//        8
//        /  \
//        6   10
//        / \  / \
//        5  7 9 11
//        镜像二叉树
//        8
//        /  \
//        10   6
//        / \  / \
//        11 9 7  5

import java.util.Stack;

public class logic_day12 {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(10);
        //...
        Mirror(treeNode);
    }

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    public static void Mirror(TreeNode root) {
        if (root == null) return;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while (!stack.empty()) {
            TreeNode node = stack.pop();
            if (node.left != null || node.right != null) {
                TreeNode nodeLeft = node.left;
                TreeNode nodeRight = node.right;
                node.left = nodeRight;
                node.right = nodeLeft;
            }
            if (node.left != null) stack.push(node.left);
            if (node.right != null) stack.push(node.right);
        }
    }
}
