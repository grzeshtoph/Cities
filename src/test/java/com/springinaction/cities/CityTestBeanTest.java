package com.springinaction.cities;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

/**
 * Test case for {@link CityTestBean}
 */
@ContextConfiguration("/cities.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class CityTestBeanTest {
    @Autowired
    private CityTestBean cityTestBean;
    @Resource
    private List<City> cities;

    @Test
    public void cityTestBeanTest() {
        assertNotNull(cityTestBean);
    }

    @Test
    public void chosenCityTest() {
        assertSame(cities.get(2), cityTestBean.getChosenCity());
    }

    @Test
    public void chosenCityRandomTest() {
        boolean found = false;

        for (City city : cities) {
            if (city.equals(cityTestBean.getChosenCityRandom())) {
                found = true;
                break;
            }
        }

        assertTrue(found);
    }
}
