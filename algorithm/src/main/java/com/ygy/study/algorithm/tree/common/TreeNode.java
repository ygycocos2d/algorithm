package com.ygy.study.algorithm.tree.common;

import lombok.Data;

@Data
public class TreeNode {

    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int x) {
        val = x;
    }

}