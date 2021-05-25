package design.chainresponsibility.solution;

import java.math.BigDecimal;

import design.chainresponsibility.Estimate;

/*Due to the need to not 
 *know which discount to apply
 *the chain of responsibility standard is used
 */
public class CalculateDiscount {
	
	public BigDecimal calculate(Estimate estimate) {
		/*A chain of possible discount algorithms 
		 * is created using the inheritance principle
		 */
		Discount discount=new DiscountGreaterItem(
						  new DiscountGreaterItemB(
						  new NullDiscount()));
		return discount.calculate(estimate);
	
	}

}
