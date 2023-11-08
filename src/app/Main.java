package app;

import java.util.Scanner;

public class Main {
    static String[] fruits = {
            "apples", "bananas", "peaches", "bananas", "apples", "apples", "peaches", "bananas", "bananas"};
    static String[] vegetables = {
            "tomatoes", "cucumbers", "potatoes", "cucumbers", "tomatoes", "potatoes", "potatoes", "tomatoes"};
    static String[] berries = {
            "strawberries", "blueberries", "strawberries", "strawberries", "blueberries", "strawberries", "strawberries"};
    static String[] meat = {
            "beef", "chicken", "pork", "chicken", "chicken", "beef","pork" };
    static String[] fish = {
            "mackerel", "mackerel", "salmon", "mackerel", "salmon", "herring", "herring"};
    static int productNameCount1;
    static int productNameCount2;
    static int productNameCount3;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Enter number of product list you want to check:
                1) Fruits;\t2) Vegetables;
                3) Berries;\t4) Meat;
                5) Fish.\s""");

        int type = scanner.nextInt();
        scanner.close();

        if ((type < 1) | (5 > type)) {
            System.out.println("Wrong number of product list.");
        }

        switch (type) {
            case 1:
                for (String fruitName: fruits ) {
                    switch (fruitName) {
                        case "apples" -> ++productNameCount1;
                        case "bananas" -> ++productNameCount2;
                        case "peaches" -> ++productNameCount3;
                    }
                }
                System.out.println("During the a time was bought:\n" + productNameCount1 + " boxes of apples;\n"
                        + productNameCount2 + " boxes of bananas;\n" + productNameCount3 + " boxes of peaches.");
                break;
            case 2:
                for (String vegetablesName: vegetables ) {
                    switch (vegetablesName) {
                        case "tomatoes" -> ++productNameCount1;
                        case "cucumbers" -> ++productNameCount2;
                        case "potatoes" -> ++productNameCount3;
                    }
                }
                System.out.println("During the a time was bought:\n" + productNameCount1 + " boxes of tomatoes;\n"
                        + productNameCount2 + " boxes of cucumbers;\n" + productNameCount3 + " boxes of potatoes.");
                break;
            case 3:
                for (String berriesName: berries ) {
                    switch (berriesName) {
                        case "strawberries" -> ++productNameCount1;
                        case "blueberries" -> ++productNameCount2;
                    }
                }
                System.out.println("During the time was bought:\n" + productNameCount1 + " boxes of strawberries;\n"
                        + productNameCount2 + " boxes of blueberries.");
                break;
            case 4:
                for (String meatName: meat ) {
                    switch (meatName) {
                        case "beef" -> ++productNameCount1;
                        case "chicken" -> ++productNameCount2;
                        case "pork" -> ++productNameCount3;
                    }
                }
                System.out.println("During the time was bought:\n" + productNameCount1 + " frozen beefs;\n"
                        + productNameCount2 + " frozen chicken\n" + productNameCount3 + " frozen pork.");
                break;
            case 5:
                for (String fishName: fish ) {
                    switch (fishName) {
                        case "mackerel" -> ++productNameCount1;
                        case "salmon" -> ++productNameCount2;
                        case "herring" -> ++productNameCount3;
                    }
                }
                System.out.println("During the time was bought:\n" + productNameCount1 + " frozen mackerels;\n"
                        + productNameCount2 + " frozen salmons;\n" + productNameCount3 + " frozen herrings.");
                break;
        }
    }
}