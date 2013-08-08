package com.springinaction.cities;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Entry point.
 */
public class App {
    private static final Logger LOG = LoggerFactory.getLogger(App.class);

    public static void main(String... args) {
        new App().execute();
    }

    private void execute() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/cities.xml");

        List<City> cities = (List<City>) ctx.getBean("cities");
        for (City city : cities) {
            LOG.info("found city in the Spring list: {}", city);
        }

        CityTestBean cityTestBean = (CityTestBean) ctx.getBean("cityTestBean");
        LOG.info("chosenCity: {}", cityTestBean.getChosenCity());
        LOG.info("chosenCityRandom: {}", cityTestBean.getChosenCityRandom());
    }
}
