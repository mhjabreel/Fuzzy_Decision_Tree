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
 * @author Mohammed H. Jabreel
 */
public class Main {
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
        
        
        FuzzyDecisionTree fdt = new FuzzyDecisionTree(0.7, 0.0);
        
      
        fdt.setSignificantLevel(0.0);
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("With alpha (significant level) = 0.0");
        
        System.out.println(String.format("G(Outlook) = %.2f", fdt.getAmbiguity(d, "Plan", "Outlook")));
        System.out.println(String.format("G(Temprature) = %.2f", fdt.getAmbiguity(d,"Plan", "Temprature")));
        System.out.println(String.format("G(Humidity) = %.2f", fdt.getAmbiguity(d, "Plan", "Humidity")));
        System.out.println(String.format("G(Wind) = %.2f", fdt.getAmbiguity(d, "Plan", "Wind")));
        
        System.out.println(String.format("G(Hot) = %.2f", fdt.getAmbiguity(d, "Plan", new String[] {"Temprature", "Hot"})));
        
        System.out.println(String.format("G(Outlook | Hot) = %.2f", fdt.getAmbiguity(d, "Plan", "Outlook" , new String[] {"Temprature", "Hot"})));
        System.out.println(String.format("G(Humidity | Hot) = %.2f", fdt.getAmbiguity(d, "Plan", "Humidity" , new String[] {"Temprature", "Hot"})));
        System.out.println(String.format("G(Wind | Hot) = %.2f", fdt.getAmbiguity(d, "Plan", "Wind" , new String[] {"Temprature", "Hot"})));
        
        
        System.out.println(String.format("G(Outlook | Mild) = %.2f", fdt.getAmbiguity(d, "Plan", "Outlook" , new String[] {"Temprature", "Mild"})));
        System.out.println(String.format("G(Humidity | Mild) = %.2f", fdt.getAmbiguity(d, "Plan", "Humidity" , new String[] {"Temprature", "Mild"})));
        System.out.println(String.format("G(Wind | Mild) = %.2f", fdt.getAmbiguity(d, "Plan", "Wind" , new String[] {"Temprature", "Mild"})));
        

        TreeNode root = fdt.buildTree(d, "Plan");
        
        fdt.printTree(root, "");  
        String[] rules = fdt.generateRules(root);
        for(String rule : rules) {
            System.out.println(rule);
        }
        
        System.out.println("");
        System.out.println("Simplifying rules:");
        for(String rule : rules) {
            System.out.println(fdt.simplifyRule(d, rule, "Plan"));
        }        
       
        System.out.println();
        
        fdt.setSignificantLevel(0.5);
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("With alpha (significant level) = 0.5");
        //fdt.getAmbiguity(d, "Plan", "Outlook");
        System.out.println(String.format("G(Outlook) = %.2f", fdt.getAmbiguity(d, "Plan", "Outlook")));
        System.out.println(String.format("G(Temprature) = %.2f", fdt.getAmbiguity(d,"Plan", "Temprature")));
        System.out.println(String.format("G(Humidity) = %.2f", fdt.getAmbiguity(d, "Plan", "Humidity")));
        System.out.println(String.format("G(Wind) = %.2f", fdt.getAmbiguity(d, "Plan", "Wind")));
        
        System.out.println(String.format("G(Hot) = %.2f", fdt.getAmbiguity(d, "Plan", new String[] {"Temprature", "Hot"})));
        
        System.out.println(String.format("G(Outlook | Hot) = %.2f", fdt.getAmbiguity(d, "Plan", "Outlook" , new String[] {"Temprature", "Hot"})));
        System.out.println(String.format("G(Humidity | Hot) = %.2f", fdt.getAmbiguity(d, "Plan", "Humidity" , new String[] {"Temprature", "Hot"})));
        System.out.println(String.format("G(Wind | Hot) = %.2f", fdt.getAmbiguity(d, "Plan", "Wind" , new String[] {"Temprature", "Hot"})));
        
        
        System.out.println(String.format("G(Outlook | Mild) = %.2f", fdt.getAmbiguity(d, "Plan", "Outlook" , new String[] {"Temprature", "Mild"})));
        System.out.println(String.format("G(Humidity | Mild) = %.2f", fdt.getAmbiguity(d, "Plan", "Humidity" , new String[] {"Temprature", "Mild"})));
        System.out.println(String.format("G(Wind | Mild) = %.2f", fdt.getAmbiguity(d, "Plan", "Wind" , new String[] {"Temprature", "Mild"})));        
        
        
        
       
        
        System.out.println("");
        System.out.println("");
        
        
        
        root = fdt.buildTree(d, "Plan");
        
        fdt.printTree(root, "");
        
        rules = fdt.generateRules(root);
        for(String rule : rules) {
            System.out.println(rule);
        }
        
        System.out.println("");
        System.out.println("Simplifying rules:");
        for(String rule : rules) {
            System.out.println(fdt.simplifyRule(d, rule, "Plan"));
        }         
        
        for(int i = 0; i < rules.length;i++) {
            rules[i] = fdt.simplifyRule(d, rules[i], "Plan");
        }
        System.out.println("Trainingset Prediction:");
        for(int j = 0; j < 16; j++) {
            double[] cVals = fdt.classify(j, d, "Plan", rules);
            for(int i = 0; i < cVals.length; i++) {
                System.out.print(String.format("%.2f     ", cVals[i]));
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Trainingset Prediction with aout information about wind:");
        d.getRows().clear();
        d.addRow(new Row(new Object[]{"Dummy", "Dummy", "Dummy", "Dummy", "Dummy"}, new double[][] {{ 0.9, 0.1, 0.0}, {1.0, 0.0, 0.0}, {0.8, 0.2}, {1, 1}, {0.0, 0.8, 0.2  }}));
        d.addRow(new Row(new Object[]{"Dummy", "Dummy", "Dummy", "Dummy", "Dummy"}, new double[][] {{ 0.8, 0.2, 0.0}, {0.6, 0.4, 0.0}, {0.0, 1.0}, {1.0, 1.0}, {1.0, 0.7, 0.0  }}));
        d.addRow(new Row(new Object[]{"Dummy", "Dummy", "Dummy", "Dummy", "Dummy"}, new double[][] {{ 0.0, 0.7, 0.3}, {0.8, 0.2, 0.0}, {0.1, 0.9}, {1, 1}, {0.3, 0.6, 0.1  }}));
        d.addRow(new Row(new Object[]{"Dummy", "Dummy", "Dummy", "Dummy", "Dummy"}, new double[][] {{ 0.2, 0.7, 0.1}, {0.3, 0.7, 0.0}, {0.2, 0.8}, {1, 1}, {0.9, 0.1, 0.0  }}));
        d.addRow(new Row(new Object[]{"Dummy", "Dummy", "Dummy", "Dummy", "Dummy"}, new double[][] {{ 0.0, 0.1, 0.9}, {0.7, 0.3, 0.0}, {0.5, 0.5}, {1, 1}, {0.0, 0.0, 1.0  }}));
        d.addRow(new Row(new Object[]{"Dummy", "Dummy", "Dummy", "Dummy", "Dummy"}, new double[][] {{ 0.0, 0.7, 0.3}, {0.0, 0.3, 0.7}, {0.7, 0.3}, {1, 1}, {0.2, 0.0, 0.8  }}));
        d.addRow(new Row(new Object[]{"Dummy", "Dummy", "Dummy", "Dummy", "Dummy"}, new double[][] {{ 0.0, 0.3, 0.7}, {0.0, 0.0, 1.0}, {0.0, 1.0}, {1, 1}, {0.0, 0.0, 1.0  }}));
        d.addRow(new Row(new Object[]{"Dummy", "Dummy", "Dummy", "Dummy", "Dummy"}, new double[][] {{ 0.0, 1.0, 0.0}, {0.0, 0.2, 0.8}, {0.2, 0.8}, {1.0, 1.0}, {0.7, 0.0, 0.3  }}));
        d.addRow(new Row(new Object[]{"Dummy", "Dummy", "Dummy", "Dummy", "Dummy"}, new double[][] {{ 1.0, 0.0, 0.0}, {1.0, 0.0, 0.0}, {0.6, 0.4}, {1, 1}, {0.2, 0.8, 0.0  }}));
        d.addRow(new Row(new Object[]{"Dummy", "Dummy", "Dummy", "Dummy", "Dummy"}, new double[][] {{ 0.9, 0.1, 0.0}, {0.0, 0.3, 0.7}, {0.0, 1.0}, {1, 1}, {0.0, 0.3, 0.7  }}));
        d.addRow(new Row(new Object[]{"Dummy", "Dummy", "Dummy", "Dummy", "Dummy"}, new double[][] {{ 0.7, 0.3, 0.0}, {1.0, 0.0, 0.0}, {1.0, 0.0}, {1, 1}, {0.4, 0.7, 0.0  }}));
        d.addRow(new Row(new Object[]{"Dummy", "Dummy", "Dummy", "Dummy", "Dummy"}, new double[][] {{ 0.2, 0.6, 0.2}, {0.0, 1.0, 0.0}, {0.3, 0.7}, {1, 1}, {0.7, 0.2, 0.1  }}));
        d.addRow(new Row(new Object[]{"Dummy", "Dummy", "Dummy", "Dummy", "Dummy"}, new double[][] {{ 0.9, 0.1, 0.0}, {0.2, 0.8, 0.0}, {0.1, 0.9}, {1.0, 1.0}, {0.0, 0.0, 1.0  }}));
        d.addRow(new Row(new Object[]{"Dummy", "Dummy", "Dummy", "Dummy", "Dummy"}, new double[][] {{ 0.0, 0.9, 0.1}, {0.0, 0.9, 0.1}, {0.1, 0.9}, {1, 1}, {0.0, 0.0, 1.0  }}));
        d.addRow(new Row(new Object[]{"Dummy", "Dummy", "Dummy", "Dummy", "Dummy"}, new double[][] {{ 0.0, 0.0, 1.0}, {0.0, 0.0, 1.0}, {1.0, 0.0}, {1, 1}, {0.0, 0.0, 1.0  }}));
        d.addRow(new Row(new Object[]{"Dummy", "Dummy", "Dummy", "Dummy", "Dummy"}, new double[][] {{ 1.0, 0.0, 0.0}, {0.5, 0.5, 0.0}, {0.0, 1.0}, {1.0, 1.0}, {0.8, 0.6, 0.0  }}));
        
        for(int j = 0; j < 16; j++) {
            double[] cVals = fdt.classify(j, d, "Plan", rules);
            for(int i = 0; i < cVals.length; i++) {
                System.out.print(String.format("%.2f     ", cVals[i]));
            }
            System.out.println("");
        }        
        
        
    }
}
