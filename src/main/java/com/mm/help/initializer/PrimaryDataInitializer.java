package main.java.com.mm.help.initializer;

import java.util.Scanner;
import main.java.com.mm.help.model.PrimaryData;

public class PrimaryDataInitializer {

    public PrimaryData primaryDataInitialize() {

        PrimaryData primaryData = new PrimaryData();
        Scanner in = new Scanner(System.in);

        System.out.print("Введите общую цену: ");
        primaryData.setInitialSum(in.nextLine().trim());

        System.out.print("Введите кол-во товаров в упаковке: ");
        primaryData.setInitialQuantity(in.nextLine().trim());

        return primaryData;
    }
}
