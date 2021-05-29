package design.templatemethod;

import java.math.BigDecimal;

import design.chainresponsibility.Estimate;

/*The discount class calculate method 
 *works as template method, the idea of ​​
 *this pattern is to have a method that 
 *works as a model in which , is part 
 *of the process but only another delegate part
 *where each child class will have its own rules
 */

public class CalculateDiscount {

	public BigDecimal calculate(Estimate estimate) {
		Discount discount=new DiscountGreaterItem(
						  new DiscountGreaterItemB(
						  new NullDiscount()));
		return discount.calculate(estimate);
	
	}

}
