package com.springinaction.cities;

import com.springinaction.properties.PropertiesBean;
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

        CitiesBean citiesBean = (CitiesBean) ctx.getBean("citiesBean");
        LOG.info("chosenCity: {}", citiesBean.getChosenCity());
        LOG.info("chosenCityRandom: {}", citiesBean.getChosenCityRandom());
        LOG.info("dallas from map: {}", citiesBean.getDallasFromMap());

        PropertiesBean propertiesBean = ctx.getBean(PropertiesBean.class);
        LOG.info("settings: {}", propertiesBean.getSettings());
        LOG.info("accessToken: {}", propertiesBean.getAccessToken());
        LOG.info("myprop.1: {}", propertiesBean.getMyProp1());
        LOG.info("myprop.2: {}", propertiesBean.getMyProp2());
        LOG.info("myprop.3: {}", propertiesBean.getMyProp3());
        LOG.info("javaHome: {}", propertiesBean.getJavaHome());
        LOG.info("osName: {}", propertiesBean.getOsName());
        LOG.info("defaultSeparator: {}", propertiesBean.getDefaultSeparator());

    }
}
