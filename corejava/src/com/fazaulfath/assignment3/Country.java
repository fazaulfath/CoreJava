package com.fazaulfath.assignment3;

public class Country extends Continent {
    private String countryName;
    private String capital;
    private String officialLanguage;

    public Country(String continentName, int continentPopulation, double continentArea,
                   String countryName, String capital, String officialLanguage) {
        super(continentName, continentPopulation, continentArea);
        this.countryName = countryName;
        this.capital = capital;
        this.officialLanguage = officialLanguage;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getCapital() {
        return capital;
    }

    public String getOfficialLanguage() {
        return officialLanguage;
    }

    public void displayCountry() {
        displayContinent();
        System.out.println("Country: " + countryName);
        System.out.println("Capital: " + capital);
        System.out.println("Official Language: " + officialLanguage);
    }
}
