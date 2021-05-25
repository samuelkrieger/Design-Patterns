package design.chainresponsibility.solution;

import java.math.BigDecimal;

import design.chainresponsibility.Estimate;

public class CalculateDiscount {
	
	public BigDecimal calculate(Estimate estimate) {
		Discount discount=new DiscountGreaterItem(
						  new DiscountGreaterItemB(
						  new NullDiscount()));
		return discount.calculate(estimate);
	
	}

}
