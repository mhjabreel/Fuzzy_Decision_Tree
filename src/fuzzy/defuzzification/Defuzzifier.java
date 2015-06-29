/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fuzzy.defuzzification;

import fuzzy.FuzzyOutput;
import fuzzy.operators.Norm;

/**
 *
 * @author Mohammed H. Jabreel
 */
public interface Defuzzifier {
    
    // <returns>The numerical representation of the fuzzy output.</returns>
    double defuzzify( FuzzyOutput fuzzyOutput, Norm normOperator);
}
