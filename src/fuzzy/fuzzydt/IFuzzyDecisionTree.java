/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fuzzy.fuzzydt;

import fuzzy.data.Dataset;

/**
 *
 * @author Mohammed
 */
public interface IFuzzyDecisionTree {
    
    TreeNode buildTree(Dataset dataset, String className);
    
    boolean isLeaf(TreeNode root, String term);
}
