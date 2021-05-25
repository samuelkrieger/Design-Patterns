package design.chainresponsibility.solution;

import java.math.BigDecimal;

import design.chainresponsibility.Estimate;

public class NullDiscount extends Discount {

	protected NullDiscount() {
		super(null);
	}
	public BigDecimal calculate(Estimate estimate) {
		return BigDecimal.ZERO;
	}

}
