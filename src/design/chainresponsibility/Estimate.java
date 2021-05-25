package design.chainresponsibility;

import java.math.BigDecimal;

public class Estimate {
	private BigDecimal value;
	private Integer quantity;



	public Estimate(BigDecimal value,Integer quantity) {
		this.value = value;
		this.quantity=quantity;
	}
	
	public BigDecimal getValue() {
		return value;
	}

	public Integer getQuantity() {
		return quantity;
	}
}