package test;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab9 {
    ArrayList<String> items = new ArrayList<>();
    String item = "";
    Scanner keyboard = new Scanner(System.in);

    private String breadType;
    private double baseCost;
    private double costPerItem;

    public Lab9(String breadType, double baseCost, double costPerItem) {
        this.breadType = breadType;
        this.baseCost = baseCost;
        this.costPerItem = costPerItem;
    }

    public String getBreadType() {

        return breadType;
    }

    public double getBaseCost() {

        return baseCost;
    }

    public double getCostPerItem() {

        return costPerItem;
    }

    public void addItem() {
        System.out.println("Please enter an item.");
        item = keyboard.nextLine();
        items.add(item);
    }
    public void getTotalCost(double baseCost, double costPerItem){
        double totalCost = baseCost + costPerItem * items.size();

    }
}