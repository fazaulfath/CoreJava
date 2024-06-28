package com.fazaulfath.assignment3;

public class Continent {
    private String name;
    private int population;
    private double area;

    public Continent(String name, int population, double area) {
        this.name = name;
        this.population = population;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public double getArea() {
        return area;
    }

    public void displayContinent() {
        System.out.println("Continent: " + name);
        System.out.println("Population: " + population);
        System.out.println("Area: " + area + " square kilometers");
    }
}
