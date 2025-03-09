package com.rest.web.limit_service.controller;

import com.rest.web.limit_service.bean.Limits;
import com.rest.web.limit_service.configuration.LimitConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitController {

    private LimitConfiguration limitConfiguration;

    @Autowired
    public LimitController(LimitConfiguration limitConfiguration) {
        this.limitConfiguration = limitConfiguration;
    }

    @GetMapping("/limits")
    public Limits retrieveLimits() {
        return new Limits(limitConfiguration.getMinimum(),limitConfiguration.getMaximum()   );
    }
}
