package lesson_3;

import java.util.ArrayList;
import java.util.Collections;


public class CollectionsClass {
    static ArrayList<String> market = new ArrayList<String>();


    public static void main(String[] args) {
        CollectionsClass.setMarket();
        CollectionsClass.removeElement("Fish");
        CollectionsClass.verifyRemovedElement("Fish");
        System.out.println("---------");
        System.out.println("Collection before sorting: ");
        CollectionsClass.oneByOne();
        System.out.println("---------");
        CollectionsClass.sortMarket();
        System.out.println("---------");
        System.out.println("Collection after sorting: ");
        CollectionsClass.oneByOne();
    }


   public static void setMarket () {
       try {
            market.add("Fish");
            market.add("Bread");
            market.add("Drinks");
            market.add(2, "Milk");
            market.add("Chicken");
        } catch (IndexOutOfBoundsException e1){
            System.out.println("Cause of exception: " + e1.getCause());
            System.out.println("Message of exception: " + e1.getMessage());
        }
    }

    public static  void removeElement (String needToRemove){
       market.remove(needToRemove);
    }

    public static void verifyRemovedElement (String needToRemove) {
        if (market.contains(needToRemove)) {
            System.out.println("Deleted element '" + needToRemove + "' exists!");
        }
        System.out.println("Deleted element '" + needToRemove + "' does not exist!");
    }

    public static void sortMarket () {
       Collections.sort(market);
       System.out.println("Sorted list: " + market);
    }

    public static void oneByOne () {
        for (String product : market)
        {
            System.out.println(product);
        }
    }

}
