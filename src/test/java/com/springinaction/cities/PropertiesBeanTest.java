package com.springinaction.cities;

import com.google.common.base.Strings;
import com.springinaction.properties.PropertiesBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Properties;

import static org.junit.Assert.*;

/**
 * Test case for {@link PropertiesBeanTest}.
 */
@ContextConfiguration("/cities.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class PropertiesBeanTest {
    @Resource
    Properties settings;
    @Autowired
    PropertiesBean propertiesBean;

    @Test
    public void propertiesBeanTest() {
        assertNotNull(propertiesBean);
        assertSame(settings, propertiesBean.getSettings());
        assertEquals("I am the token", propertiesBean.getAccessToken());
        assertEquals("my property 1", propertiesBean.getMyProp1());
        assertEquals("my property:2", propertiesBean.getMyProp2());
        assertEquals("my property:3{}text", propertiesBean.getMyProp3());
        assertFalse(Strings.isNullOrEmpty(propertiesBean.getJavaHome()));
        assertEquals(System.getProperty("os.name"), propertiesBean.getOsName());
        assertEquals(System.getProperty("file.separator"), propertiesBean.getDefaultSeparator());
    }
}
