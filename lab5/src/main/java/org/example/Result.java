package org.example;

import java.util.ArrayList;
import java.util.List;

public class Result {
    public int sumWeight;
    public int sumValue;
    public List<Integer> id;

    public Result() {
        sumValue = 0;
        id = new ArrayList<>();
        sumWeight = 0;
    }

    public String ToString() {
        StringBuilder sb = new StringBuilder();
        for(int item : id){
            sb.append(item).append(" ");
        }

        sb.append(" total weight ").append(sumWeight);
        sb.append(" total sum ").append(sumValue).append("\n");

        return sb.toString();
    }

}
