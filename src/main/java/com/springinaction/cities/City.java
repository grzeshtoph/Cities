package com.springinaction.cities;

import com.google.common.base.Objects;

/**
 * Simple DO representing a city.
 */
public class City {
    private String name;
    private String state;
    private int population;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof City) {
            if (this == obj) return true;

            City that = (City) obj;

            return Objects.equal(name, that.name)
                    && Objects.equal(state, that.state)
                    && Objects.equal(population, that.population);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name, state, population);
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this).add("name", name)
                .add("state", state)
                .add("population", population).toString();
    }
}
