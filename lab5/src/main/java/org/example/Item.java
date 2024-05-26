package org.example;

public class Item {
    public int value;
    public int weight;
    public int id;
    public float vwRatio;

    public Item(int v, int w, int i) {
        value = v;
        weight = w;
        id = i;
        vwRatio = (float)value / (float)weight;
    }

    public String ToString(){
        String stringBuilder = "id: " + id +
                " value: " + value +
                " weight: " + weight +
                " v/w ratio: " + vwRatio;

        return stringBuilder;
    }
}
