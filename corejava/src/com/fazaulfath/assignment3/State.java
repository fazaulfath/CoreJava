package com.fazaulfath.assignment3;

public class State extends Country {
    private String stateName;
    private String largestCity;
    private int numberOfDistricts;

    public State(String continentName, int continentPopulation, double continentArea,
                 String countryName, String capital, String officialLanguage,
                 String stateName, String largestCity, int numberOfDistricts) {
        super(continentName, continentPopulation, continentArea, countryName, capital, officialLanguage);
        this.stateName = stateName;
        this.largestCity = largestCity;
        this.numberOfDistricts = numberOfDistricts;
    }

    public String getStateName() {
        return stateName;
    }

    public String getLargestCity() {
        return largestCity;
    }

    public int getNumberOfDistricts() {
        return numberOfDistricts;
    }

    public void displayState() {
        displayCountry();
        System.out.println("State: " + stateName);
        System.out.println("Largest City: " + largestCity);
        System.out.println("Number of Districts: " + numberOfDistricts);
    }
}
