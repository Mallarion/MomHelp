package main.java.com.mm.help.calculations;

import static java.math.BigDecimal.ROUND_CEILING;
import static java.math.BigDecimal.ROUND_HALF_UP;

import java.math.BigDecimal;
import main.java.com.mm.help.initializer.PrimaryDataInitializer;
import main.java.com.mm.help.model.PrimaryData;

public class MainCalculations {

    private static final BigDecimal PRICE_DIFFERENCE = BigDecimal.valueOf(0.01);
    private final PrimaryDataInitializer primaryDataInitializer = new PrimaryDataInitializer();
    private final PrimaryData primaryData = primaryDataInitializer.primaryDataInitialize();
    private final BigDecimal initialSum = primaryData.getInitialSum();
    private final BigDecimal initialQuantity = primaryData.getInitialQuantity();

    public void mainCalculations() {

        BigDecimal firsMultiplier =
                initialSum.divide(initialQuantity, 2, ROUND_CEILING).subtract(PRICE_DIFFERENCE);

        BigDecimal firstQuantity =
                (initialQuantity.multiply(firsMultiplier.add(PRICE_DIFFERENCE)).subtract(initialSum)
                ).divide(PRICE_DIFFERENCE);

        BigDecimal secondMultiplier = firsMultiplier.add(PRICE_DIFFERENCE);
        BigDecimal secondQuantity = initialQuantity.subtract(firstQuantity);

        BigDecimal firstSum = firstQuantity.multiply(firsMultiplier).setScale(2, ROUND_HALF_UP);
        BigDecimal secondSum = secondQuantity.multiply(secondMultiplier).setScale(2, ROUND_HALF_UP);

        System.out.println("Выражение примет вид: ");
        System.out.println(firstQuantity + " шт * " + firsMultiplier + " руб = " + firstSum + " руб");
        System.out.println(secondQuantity + " шт  * " + secondMultiplier + " руб = " + secondSum + " руб");
    }

}
