package design.strategy.solution;

import java.math.BigDecimal;

import design.strategy.Estimate;

public interface Tax {
	BigDecimal calculate(Estimate estimate);
}
