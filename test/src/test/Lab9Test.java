package lab8;

import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class sandwichTest {

    @org.junit.jupiter.api.Test
    void testConstructorAndGets() {

        String expectedBreadType = "Italian";
        double expectedBaseCost = 2.00;
        double expectedCostPerItem = 1.00;

        sandwich Sandwich = new sandwich(expectedBreadType,expectedBaseCost,expectedCostPerItem);

        String actualBreadType = Sandwich.getBreadType();
        double actualBaseCost = Sandwich.getBaseCost();
        double actualCostPerItem = Sandwich.getCostPerItem();

        assertEquals(expectedBreadType,actualBreadType);
        assertEquals(expectedBaseCost,actualBaseCost);
        assertEquals(expectedCostPerItem,actualCostPerItem);
    }


    @org.junit.jupiter.api.Test
    void addItem() {

        Sandwich sandwich = new Sandwich("Italian",2.00,1.00);

        String item1 = "Cheese";
        Sandwich.addItem(item1);

        ArrayList<String> expectedItems;
        expectedItems = new ArrayList<>();
        expectedItems.add(item1);


        ArrayList<String> actualItems;
        actualItems = Sandwich.getItems();

        boolean value = expectedItems.equals(actualItems);

        assertTrue(value);
    }

    @org.junit.jupiter.api.Test
    void getTotalCost() {

        Sandwich sandwich = new Sandwich("Italian",2.00,1.00);
        double expectedTotalCost = 3.00;

        Sandwich.addItem("Cheese");
        double actualTotalCost = Sandwich.getTotalCost();

        assertEquals(expectedTotalCost,actualTotalCost);
    }
}