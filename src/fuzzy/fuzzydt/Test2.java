/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fuzzy.fuzzydt;

import fuzzy.data.Attribute;
import fuzzy.data.Dataset;
import fuzzy.data.Row;

/**
 *
 * @author Mohammed
 */
public class Test2 {
    public static void main(String[] args) {
                //Create a dataset
        Dataset d = new Dataset("Sample1");
        
        // Add the attributes with Linguistic terms
        d.addAttribute(new Attribute("Outlook", new String[] {"Sunny", "Cloudy", "Rain"}));
        d.addAttribute(new Attribute("Temprature", new String[] {"Hot", "Mild", "Cool"}));
        d.addAttribute(new Attribute("Humidity", new String[] {"Humid", "Normal"}));
        d.addAttribute(new Attribute("Wind", new String[] {"Windy", "Not_Windy"}));
        d.addAttribute(new Attribute("Plan", new String[] {"Volleyball", "Swimming", "W_lifting"}));
        
        

        
        d.addRow(new Row(new Object[]{"Dummy", "Dummy", "Dummy", "Dummy", "Dummy"}, new double[][] {{ 0.9, 0.1, 0.0}, {1.0, 0.0, 0.0}, {0.8, 0.2}, {0.4, 0.6}, {0.0, 0.8, 0.2  }}));
        d.addRow(new Row(new Object[]{"Dummy", "Dummy", "Dummy", "Dummy", "Dummy"}, new double[][] {{ 0.8, 0.2, 0.0}, {0.6, 0.4, 0.0}, {0.0, 1.0}, {0.0, 1.0}, {1.0, 0.7, 0.0  }}));
        d.addRow(new Row(new Object[]{"Dummy", "Dummy", "Dummy", "Dummy", "Dummy"}, new double[][] {{ 0.0, 0.7, 0.3}, {0.8, 0.2, 0.0}, {0.1, 0.9}, {0.2, 0.8}, {0.3, 0.6, 0.1  }}));
        d.addRow(new Row(new Object[]{"Dummy", "Dummy", "Dummy", "Dummy", "Dummy"}, new double[][] {{ 0.2, 0.7, 0.1}, {0.3, 0.7, 0.0}, {0.2, 0.8}, {0.3, 0.7}, {0.9, 0.1, 0.0  }}));
        d.addRow(new Row(new Object[]{"Dummy", "Dummy", "Dummy", "Dummy", "Dummy"}, new double[][] {{ 0.0, 0.1, 0.9}, {0.7, 0.3, 0.0}, {0.5, 0.5}, {0.5, 0.5}, {0.0, 0.0, 1.0  }}));
        d.addRow(new Row(new Object[]{"Dummy", "Dummy", "Dummy", "Dummy", "Dummy"}, new double[][] {{ 0.0, 0.7, 0.3}, {0.0, 0.3, 0.7}, {0.7, 0.3}, {0.4, 0.6}, {0.2, 0.0, 0.8  }}));
        d.addRow(new Row(new Object[]{"Dummy", "Dummy", "Dummy", "Dummy", "Dummy"}, new double[][] {{ 0.0, 0.3, 0.7}, {0.0, 0.0, 1.0}, {0.0, 1.0}, {0.1, 0.9}, {0.0, 0.0, 1.0  }}));
        d.addRow(new Row(new Object[]{"Dummy", "Dummy", "Dummy", "Dummy", "Dummy"}, new double[][] {{ 0.0, 1.0, 0.0}, {0.0, 0.2, 0.8}, {0.2, 0.8}, {0.0, 1.0}, {0.7, 0.0, 0.3  }}));
        d.addRow(new Row(new Object[]{"Dummy", "Dummy", "Dummy", "Dummy", "Dummy"}, new double[][] {{ 1.0, 0.0, 0.0}, {1.0, 0.0, 0.0}, {0.6, 0.4}, {0.7, 0.3}, {0.2, 0.8, 0.0  }}));
        d.addRow(new Row(new Object[]{"Dummy", "Dummy", "Dummy", "Dummy", "Dummy"}, new double[][] {{ 0.9, 0.1, 0.0}, {0.0, 0.3, 0.7}, {0.0, 1.0}, {0.9, 0.1}, {0.0, 0.3, 0.7  }}));
        d.addRow(new Row(new Object[]{"Dummy", "Dummy", "Dummy", "Dummy", "Dummy"}, new double[][] {{ 0.7, 0.3, 0.0}, {1.0, 0.0, 0.0}, {1.0, 0.0}, {0.2, 0.8}, {0.4, 0.7, 0.0  }}));
        d.addRow(new Row(new Object[]{"Dummy", "Dummy", "Dummy", "Dummy", "Dummy"}, new double[][] {{ 0.2, 0.6, 0.2}, {0.0, 1.0, 0.0}, {0.3, 0.7}, {0.3, 0.7}, {0.7, 0.2, 0.1  }}));
        d.addRow(new Row(new Object[]{"Dummy", "Dummy", "Dummy", "Dummy", "Dummy"}, new double[][] {{ 0.9, 0.1, 0.0}, {0.2, 0.8, 0.0}, {0.1, 0.9}, {1.0, 0.0}, {0.0, 0.0, 1.0  }}));
        d.addRow(new Row(new Object[]{"Dummy", "Dummy", "Dummy", "Dummy", "Dummy"}, new double[][] {{ 0.0, 0.9, 0.1}, {0.0, 0.9, 0.1}, {0.1, 0.9}, {0.7, 0.3}, {0.0, 0.0, 1.0  }}));
        d.addRow(new Row(new Object[]{"Dummy", "Dummy", "Dummy", "Dummy", "Dummy"}, new double[][] {{ 0.0, 0.0, 1.0}, {0.0, 0.0, 1.0}, {1.0, 0.0}, {0.8, 0.2}, {0.0, 0.0, 1.0  }}));
        d.addRow(new Row(new Object[]{"Dummy", "Dummy", "Dummy", "Dummy", "Dummy"}, new double[][] {{ 1.0, 0.0, 0.0}, {0.5, 0.5, 0.0}, {0.0, 1.0}, {0.0, 1.0}, {0.8, 0.6, 0.0  }}));
        
        GFID3 gfid3 = new GFID3(0.75);
        
        TreeNode root = gfid3.buildTree(d, "Plan");
        
        gfid3.printTree(root, "");  
        
        String[] rules = gfid3.generateRules(root);
        for(String rule : rules) {
            System.out.println(rule);
        }
        
        System.out.println("");
        System.out.println("Simplifying rules:");
        for(String rule : rules) {
            System.out.println(gfid3.simplifyRule(d, rule, "Plan"));
        }         
        
        for(int i = 0; i < rules.length;i++) {
            rules[i] = gfid3.simplifyRule(d, rules[i], "Plan");
        }
        System.out.println("Trainingset Prediction:");
        for(int j = 0; j < 16; j++) {
            double[] cVals = gfid3.classify(j, d, "Plan", rules);
            for(int i = 0; i < cVals.length; i++) {
                System.out.print(String.format("%.2f     ", cVals[i]));
            }
            System.out.println("");
        }        
    }
}
