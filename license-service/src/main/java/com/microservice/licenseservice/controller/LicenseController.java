package com.microservice.licenseservice.controller;

import com.microservice.licenseservice.model.License;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/license-service")
public class LicenseController {

    @RequestMapping(value = "/get-license/{licenseId}/{organizationId}")
    public License getLicense(
            @PathVariable("licenseId") String licenseId,
            @PathVariable("organizationId") String organizationId) {
        return new License(
                licenseId,
                organizationId,
                "productName",
                "licenseType");
    }
}
