/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sierra02
 */
import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addItem(Item item) {

        if (this.totalWeight() + item.getWeight() <= maxWeight) {
            this.items.add(item);
        }

    }

    public void printItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public String listItems() {

        String listItems = "";

        for (Item item : items) {
            listItems += item.toString() + "\n";
        }
        return listItems;
    }

    public int totalWeight() {
        int sumWeight = 0;
        for (Item item : items) {
            sumWeight += item.getWeight();
        }
        return sumWeight;
    }

    public Item heaviestItem() {
        if (items.isEmpty()) {
            return null;
        }
        Item heaviestItem = items.get(0);
        for (Item itm : items) {
            if (heaviestItem.getWeight() < itm.getWeight()) {
                heaviestItem = itm;
            }
        }
        return heaviestItem;
    }

    public String toString() {
        String toStringType = "";
        if (this.items.size() == 0) {
            toStringType = "no items" + " (" + this.totalWeight() + " kg)";
        } else if (this.items.size() == 1) {
            toStringType = this.items.size() + " item (" + this.totalWeight() + " kg)";
        } else {
            toStringType = this.items.size() + " items (" + this.totalWeight() + " kg)";
        }
        return toStringType;
    }

}
