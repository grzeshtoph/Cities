package com.springinaction.cities;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

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
    private City dallas;

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
}
