package design.chainresponsibility.solution;

import java.math.BigDecimal;

import design.chainresponsibility.Estimate;


/* Problem similar to the strategy
 * every time you have a new 
 * discount condition you will 
 * need to create a new if 
 * generating an infinite
 * growth code
 */
public class CalculateDiscount {
	/*in this case you are unable 
	 * to use the standard strategy 
	 * because you do not know what the 
	 * discount is to be applied 
	 * and in this case you need 
	 * an if else.
	 */
	public BigDecimal calculate(Estimate estimate) {
		/*Whenever new functionality is implemented
		 *it is ideal that we can create new code 
		 *and edit as little existing code as possible 
		 *This is one of the main points of the Open-Closed principle 
		 *When editing existing code we can end up breaking functionalities
		 *already implemented and functional.
		 */
		Discount discount=new DiscountGreaterItem(
						  new DiscountGreaterItemB(
						  new NullDiscount()));
		return discount.calculate(estimate);
	
	}

}
