package com.springinaction.cities;

/**
 * Test bean to inject various beans from context.
 */
public class CityTestBean {
    private City chosenCity;
    private City chosenCityRandom;

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
}
