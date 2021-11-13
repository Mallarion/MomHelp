package com.mm.help.initializer;

import com.mm.help.model.PrimaryData;

import java.util.Scanner;

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
