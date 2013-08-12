package com.springinaction.cities;

/**
 * Test bean to inject various beans from context.
 */
public class CitiesBean {
    private City chosenCity;
    private City chosenCityRandom;
    private City dallasFromMap;

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
}
