package design.templatemethod;

import java.math.BigDecimal;

import design.chainresponsibility.Estimate;

public class NullDiscount extends Discount {

	protected NullDiscount() {
		super(null);
	}
	public BigDecimal calculate(Estimate estimate) {
		return BigDecimal.ZERO;
	}
	@Override
	public BigDecimal accomplishcalculate(Estimate estimate) {
		return BigDecimal.ZERO;
	}
	@Override
	public boolean mustbeapplied(Estimate estimate) {
		return true;
	}

}
