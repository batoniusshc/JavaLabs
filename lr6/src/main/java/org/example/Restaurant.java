package org.example;

public class Restaurant {
    private String name;
    private String cuisine;
    private int rating;
    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int c) {
        count = c;
    }

    public Restaurant(String n, String c, int r, int ct) {
        this(n, c, r);
        setCount(ct);
    }


    public String getName() {
        return name;
    }

    public String getCuisine() {
        return cuisine;
    }

    public int getRating() {
        return rating;
    }

    public void setName(String n) {
        name = n;
    }

    public void setCuisine(String c) {
        cuisine = c;
    }

    public void setRating(int r) {
        rating = r;
    }

    public Restaurant(String name, String cuisine, int rating) {
        setName(name);
        setCuisine(cuisine);
        setRating(rating);
    }

    public boolean isPopular() {
        return rating > 4;
    }
}
