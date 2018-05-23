package desingPattern.strategy;

import java.math.BigDecimal;

public class Leasing implements Percent {

    private BigDecimal percent = BigDecimal.valueOf(0.02);

    public BigDecimal calulcate(BigDecimal value) {
        return value.multiply(percent);
    }
}
