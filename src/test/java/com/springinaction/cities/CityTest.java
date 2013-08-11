package com.springinaction.cities;

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
 * Test case for {@link City} as a Spring bean.
 */
@ContextConfiguration("/cities.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class CityTest {
    @Resource
    private List<City> cities;
    @Resource
    private Map<String, City> cityMap;
    @Autowired
    private City chicago;
    @Autowired
    private City atlanta;
    @Autowired
    private City dallas;
    @Autowired
    private City houston;
    @Autowired
    private City odessa;
    @Autowired
    private City elPaso;
    @Autowired
    private City jal;
    @Autowired
    private City lasCruces;

    @Test
    public void citiesTest() {
        assertNotNull(cities);
        assertEquals(8, cities.size());
        assertEquals("Chicago", cities.get(0).getName());
        assertEquals("Atlanta", cities.get(1).getName());
        assertEquals("Dallas", cities.get(2).getName());
        assertEquals("Houston", cities.get(3).getName());
        assertEquals("Odessa", cities.get(4).getName());
        assertEquals("El Paso", cities.get(5).getName());
        assertEquals("Jal", cities.get(6).getName());
        assertEquals("Las Cruces", cities.get(7).getName());
    }

    @Test
    public void cityMapTest() {
        assertNotNull(cityMap);
        assertEquals(8, cityMap.size());
        assertSame(chicago, cityMap.get("chicago"));
        assertSame(atlanta, cityMap.get("atlanta"));
        assertSame(dallas, cityMap.get("dallas"));
        assertSame(houston, cityMap.get("houston"));
        assertSame(odessa, cityMap.get("odessa"));
        assertSame(elPaso, cityMap.get("elPaso"));
        assertSame(jal, cityMap.get("jal"));
        assertSame(lasCruces, cityMap.get("lasCruces"));
    }

    @Test
    public void toStringTest() {
        assertEquals("City{name=Atlanta, state=GA, population=537596}", cities.get(1).toString());
    }

    @Test
    public void hashCodeTest() {
        assertFalse(cities.get(0).hashCode() == cities.get(1).hashCode());
    }

    @Test
    public void equalsTest() {
        City chicago = cities.get(0);

        assertFalse(chicago.equals(null));
        assertFalse(chicago.equals(new Object()));
        assertFalse(chicago.equals(cities.get(1)));
        assertTrue(chicago.equals(chicago));

        City shadowChicago = new City();
        assertFalse(chicago.equals(shadowChicago));
        shadowChicago.setPopulation(chicago.getPopulation());
        assertFalse(chicago.equals(shadowChicago));
        shadowChicago.setState(chicago.getState());
        assertFalse(chicago.equals(shadowChicago));
        shadowChicago.setName(chicago.getName());
        assertTrue(chicago.equals(shadowChicago));
        assertTrue(shadowChicago.equals(chicago));
    }
}
