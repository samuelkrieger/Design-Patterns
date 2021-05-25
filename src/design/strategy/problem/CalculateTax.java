package design.strategy.problem;

import java.math.BigDecimal;

import design.strategy.Estimate;


public class CalculateTax {
	
	/*Strategy tries to solve 
	 * The existence of several 
	 * algorithms for an action, 
	 * resulting in the possibility
	 * of several ifs,
	 * for an implementation of new types of tax 
	 * will generate a growth in the code.
	*/
	public BigDecimal calculate(Estimate estimate,TypeofTax typeofTax) {
		switch (typeofTax) {
		case typeexempleone: {
			return estimate.getValue().multiply(new BigDecimal("0.1"));
		}
		case tyexempletwo:
			return estimate.getValue().multiply(new BigDecimal("0.2"));
		/*for more typeoftax 
		 *will growth the
		 *number of cases implementations
		 */
		default:
			return BigDecimal.ZERO;
		}
	}
	

}
