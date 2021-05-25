package design.strategy.solution;

import java.math.BigDecimal;

import design.strategy.Estimate;

/*In it, we separate each of 
 * the possible algorithms 
 * into separate classes. 
 */
public class CalculateTax {
	
	
	public BigDecimal calculate(Estimate estimate,Tax tax) {
		/*now if the need arises 
		 *to create new types of tax,
		 *it is no longer necessary to 
		 *add anything to the calculateTax class
		 *just create a new class applying the new rule.
		 */
		return tax.calculate(estimate);
		
	}

}
