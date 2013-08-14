package com.springinaction.cities;

import java.util.List;

/**
 * Test bean to inject various beans from context.
 */
public class CitiesBean {
    private City chosenCity;
    private City chosenCityRandom;
    private City dallasFromMap;
    private List<City> bigCities;
    private City firstBigCity;
    private City lastBigCity;
    private String[] cityNames;
    private String[] bigCityNames;
    private String[] smallCityNames;

    public City getChosenCity() {
        return chosenCity;
    }

    public void setChosenCity(City chosenCity) {
        this.chosenCity = chosenCity;
    }

    public City getChosenCityRandom() {
        return chosenCityRandom;
    }

    public void setChosenCityRandom(City chosenCityRandom) {
        this.chosenCityRandom = chosenCityRandom;
    }

    public City getDallasFromMap() {
        return dallasFromMap;
    }

    public void setDallasFromMap(City dallasFromMap) {
        this.dallasFromMap = dallasFromMap;
    }

    public List<City> getBigCities() {
        return bigCities;
    }

    public void setBigCities(List<City> bigCities) {
        this.bigCities = bigCities;
    }

    public City getFirstBigCity() {
        return firstBigCity;
    }

    public void setFirstBigCity(City firstBigCity) {
        this.firstBigCity = firstBigCity;
    }

    public City getLastBigCity() {
        return lastBigCity;
    }

    public void setLastBigCity(City lastBigCity) {
        this.lastBigCity = lastBigCity;
    }

    public String[] getCityNames() {
        return cityNames;
    }

    public void setCityNames(String[] cityNames) {
        this.cityNames = cityNames;
    }

    public String[] getBigCityNames() {
        return bigCityNames;
    }

    public void setBigCityNames(String[] bigCityNames) {
        this.bigCityNames = bigCityNames;
    }

    public String[] getSmallCityNames() {
        return smallCityNames;
    }

    public void setSmallCityNames(String[] smallCityNames) {
        this.smallCityNames = smallCityNames;
    }
}
