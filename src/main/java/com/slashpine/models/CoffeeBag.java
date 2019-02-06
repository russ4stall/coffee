package com.slashpine.models;

public class CoffeeBag {
    private int id;
    private String countryOfOrigin;
    private String roast;
    private float weight;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public String getRoast() {
        return roast;
    }

    public void setRoast(String roast) {
        this.roast = roast;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
