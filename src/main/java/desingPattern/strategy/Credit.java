package desingPattern.strategy;

import java.math.BigDecimal;

public class Credit implements Percent {

    private BigDecimal percentCredit = BigDecimal.valueOf(0.08);

    public BigDecimal calulcate(BigDecimal value) {
        return value.multiply(percentCredit);
    }
}
