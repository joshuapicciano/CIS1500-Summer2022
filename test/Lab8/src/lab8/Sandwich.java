package lab8;

import java.util.ArrayList;

public class Sandwich {

    private String breadType;
    private double baseCost;
    private double costPerItem;
    ArrayList<String> items;

    public Sandwich(String breadType, double baseCost, double costPerItem) {
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

    ArrayList<String> getItems() {
        return items;
    }

    public void addItem(String item) {
        items.add(item);
    }

    public double getTotalCost() {
        return baseCost + costPerItem * items.size();
    }
}
