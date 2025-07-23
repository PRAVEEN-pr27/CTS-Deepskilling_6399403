package com.cognizant.springlearn.get_country_code;


import com.cognizant.springlearn.get_country_code.model.Country;
import com.cognizant.springlearn.get_country_code.service.CountryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping("/countries/{code}")
    public Country getCountry(@PathVariable String code) {
        return countryService.getCountry(code);
    }
}

