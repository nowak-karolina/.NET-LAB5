package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Problem {
    int NumberOfItems;
    int seed;
    int upperBound;
    int lowerBound;
    public List<Item> items;

    public Problem(int n, int s, int u, int l) {
        NumberOfItems = n;
        items = new ArrayList<>();
        seed = s;
        upperBound = u;
        lowerBound = l;

        Random random = new Random(seed);

        for (int i = 0; i < NumberOfItems; i++) {
            items.add(new Item(random.nextInt(upperBound-lowerBound+1)+lowerBound, random.nextInt(upperBound-lowerBound+1)+lowerBound, i));
        }
    }

    public  String ToString() {
        StringBuilder sb = new StringBuilder();
        for(Item item : items) {
            sb.append(item.ToString());
            sb.append("\n");

        }

        return sb.toString();
    }

    private int compare(Item item1, Item item2) {
        return Float.compare(item2.vwRatio, item1.vwRatio);
    }

    public Result Solve(int capacity){
        Result result = new Result();
        items.sort(this::compare);

//        System.out.println("sorted");
//        for (var item : items){
//            System.out.println(item.ToString());
//        }

        for (var item : items) {
            if (item.value > 0) {
                while (item.weight + result.sumWeight <= capacity) {
                    result.id.add(item.id);
                    result.sumWeight += item.weight;
                    result.sumValue += item.value;
                }
            }

        }
        return result;

    }

}
