package com.zhangwenshan001.properties.controller;

import com.zhangwenshan001.properties.Property;
import com.zhangwenshan001.properties.property.ApplicationProperty;
import com.zhangwenshan001.properties.property.DeveloperProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PropertyController {
    private final ApplicationProperty applicationProperty;
    private final DeveloperProperty developerProperty;

    @Autowired
    public PropertyController(ApplicationProperty applicationProperty, DeveloperProperty developerProperty) {
        this.applicationProperty = applicationProperty;
        this.developerProperty = developerProperty;
    }

    @GetMapping("/property")
    public Property index() {
        return new Property(
            applicationProperty.getName(),
            applicationProperty.getVersion(),
            developerProperty.getName(),
            developerProperty.getWebsite(),
            developerProperty.getPhoneNumber()
        );
    }
}
