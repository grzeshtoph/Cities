package com.springinaction.cities;

import com.google.common.base.Strings;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Test case for {@link CitiesBean}
 */
@ContextConfiguration("/cities.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class CitiesBeanTest {
    @Autowired
    private CitiesBean citiesBean;
    @Resource
    private List<City> cities;
    @Resource
    private Map<String, City> cityMap;
    @Autowired
    private City chicago;
    @Autowired
    private City dallas;
    @Autowired
    private City elPaso;

    @Test
    public void cityTestBeanTest() {
        assertNotNull(citiesBean);
    }

    @Test
    public void chosenCityTest() {
        assertSame(cities.get(2), citiesBean.getChosenCity());
    }

    @Test
    public void chosenCityRandomTest() {
        boolean found = false;

        for (City city : cities) {
            if (city.equals(citiesBean.getChosenCityRandom())) {
                found = true;
                break;
            }
        }

        assertTrue(found);
    }

    @Test
    public void dallasFromMapTest() {
        assertSame(dallas, cityMap.get("dallas"));
    }

    @Test
    public void bigCitiesTest() {
        List<City> bigCities = citiesBean.getBigCities();
        assertNotNull(bigCities);
        assertFalse(bigCities.isEmpty());

        for (City bigCity : bigCities) {
            assertTrue(bigCity.getPopulation() >= City.BIG_CITY);
        }
    }

    @Test
    public void firstBigCityTest() {
        assertSame(chicago, citiesBean.getFirstBigCity());
    }

    @Test
    public void lastBigCityTest() {
        assertSame(elPaso, citiesBean.getLastBigCity());
    }

    @Test
    public void cityNamesTest() {
        String[] cityNames = citiesBean.getCityNames();
        assertNotNull(cityNames);
        assertEquals(cities.size(), cityNames.length);

        for (int i = 0; i < cities.size(); i++) {
            City city = cities.get(i);
            assertEquals(city.getName() + ", " + city.getState(), cityNames[i]);
        }
    }

    @Test
    public void bigCityNamesTest() {
        String[] bigCityNames = citiesBean.getBigCityNames();
        assertNotNull(bigCityNames);
        List<City> bigCities = citiesBean.getBigCities();
        assertEquals(bigCities.size(), bigCityNames.length);

        for (int i = 0; i < bigCities.size(); i++) {
            City bigCity = bigCities.get(i);
            assertEquals(bigCity.getName(), bigCityNames[i]);
        }
    }

    @Test
    public void smallCityNamesTest() {
        String[] smallCityNames = citiesBean.getSmallCityNames();
        assertNotNull(smallCityNames);
        assertTrue(smallCityNames.length > 0);

        for (String smallCityName : smallCityNames) {
            assertFalse(Strings.isNullOrEmpty(smallCityName));
        }
    }
}
