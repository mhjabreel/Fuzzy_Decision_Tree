#Fuzzy Decision Tree

Implementation of Induction of fuzzy decision trees
=============
http://www.sciencedirect.com/science/article/pii/016501149400229Z
### Authors of the paper: ###
Yufei Yuan [a], Michael J. Shaw [b]<br/>
[a] Miehael G. DeGroote School of Business, McMaster University, Hamilton. Ont., Canada L8S 4M4<br/>
[b] Beekman Institute o/ Advanced Technology and Science, University of Illinois, Urbana-Champaign, 1L, USA<br/>


### Author: ###
Mohammed H. Jabreel <br/>
E-mail: mhjabreel@gmail.com <br/>
Facebook: https://www.facebook.com/mohammed.gebreel.7<br/>
Researchgate: https://www.researchgate.net/profile/Mohammed_Jabreel
###  Example ###

```java
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
```
### Example Output: ###
```
---------------------------------------------------------------------------
With alpha (significant level) = 0.0 
G(Outlook) = 0.62 
G(Temprature) = 0.56 
G(Humidity) = 0.86 
G(Wind) = 0.66 
G(Hot) = 0.51 
G(Outlook | Hot) = 0.52 
G(Humidity | Hot) = 0.58 
G(Wind | Hot) = 0.60 <br>
G(Outlook | Mild) = 0.83 
G(Humidity | Mild) = 0.86 
G(Wind | Mild) = 0.48 
|Temprature|
	<Hot>
			[Swimming](0.67)
	<Mild>
		|Wind|
			<Windy>
					[W_lifting](0.81)
			<Not_Windy>
					[Volleyball](0.78)
	<Cool>
			[W_lifting](0.88)


IF Temprature IS Hot THEN Swimming (0.67)
IF Temprature IS Mild AND Wind IS Windy THEN W_lifting (0.81)
IF Temprature IS Mild AND Wind IS Not_Windy THEN Volleyball (0.78)
IF Temprature IS Cool THEN W_lifting (0.88)

Simplifying rules:
IF Temprature IS Hot THEN Swimming (0.67)
IF Temprature IS Mild AND Wind IS Windy THEN W_lifting (0.81)
IF Temprature IS Mild AND Wind IS Not_Windy THEN Volleyball (0.78)
IF Temprature IS Cool THEN W_lifting (0.88)

---------------------------------------------------------------------------
With alpha (significant level) = 0.5
G(Outlook) = 0.52
G(Temprature) = 0.48
G(Humidity) = 0.84
G(Wind) = 0.55
G(Hot) = 0.45
G(Outlook | Hot) = 0.42
G(Humidity | Hot) = 0.50
G(Wind | Hot) = 0.52
G(Outlook | Mild) = 0.85
G(Humidity | Mild) = 0.80
G(Wind | Mild) = 0.36


|Temprature|
	<Hot>
		|Outlook|
			<Sunny>
					[Swimming](0.85)
			<Cloudy>
					[Swimming](0.72)
			<Rain>
					[W_lifting](0.73)
	<Mild>
		|Wind|
			<Windy>
					[W_lifting](0.81)
			<Not_Windy>
					[Volleyball](0.78)
	<Cool>
			[W_lifting](0.88)
		
IF Temprature IS Hot AND Outlook IS Sunny THEN Swimming (0.85)
IF Temprature IS Hot AND Outlook IS Cloudy THEN Swimming (0.72)
IF Temprature IS Hot AND Outlook IS Rain THEN W_lifting (0.73)
IF Temprature IS Mild AND Wind IS Windy THEN W_lifting (0.81)
IF Temprature IS Mild AND Wind IS Not_Windy THEN Volleyball (0.78)
IF Temprature IS Cool THEN W_lifting (0.88)

Simplifying rules:
IF Temprature IS Hot AND Outlook IS Sunny THEN Swimming (0.85)
IF Temprature IS Hot AND Outlook IS Cloudy THEN Swimming (0.72)
IF Outlook IS Rain THEN W_lifting (0.89)
IF Temprature IS Mild AND Wind IS Windy THEN W_lifting (0.81)
IF Temprature IS Mild AND Wind IS Not_Windy THEN Volleyball (0.78)
IF Temprature IS Cool THEN W_lifting (0.88)
Trainingset Prediction:
0.00     0.90     0.00     
0.40     0.60     0.00     
0.20     0.70     0.30     
0.70     0.30     0.30     
0.30     0.10     0.90     
0.30     0.00     0.70     
0.00     0.00     1.00     
0.20     0.00     0.80     
0.00     1.00     0.00     
0.10     0.00     0.70     
0.00     0.70     0.00     
0.70     0.00     0.30     
0.00     0.20     0.80     
0.30     0.00     0.70     
0.00     0.00     1.00     
0.50     0.50     0.00     

Trainingset Prediction with aout information about wind:
0.00     0.90     0.00     
0.40     0.60     0.40     
0.20     0.70     0.30     
0.70     0.30     0.70     
0.30     0.10     0.90     
0.30     0.00     0.70     
0.00     0.00     1.00     
0.20     0.00     0.80     
0.00     1.00     0.00     
0.30     0.00     0.70     
0.00     0.70     0.00     
1.00     0.00     1.00     
0.80     0.20     0.80     
0.90     0.00     0.90     
0.00     0.00     1.00     
0.50     0.50     0.50     
```
