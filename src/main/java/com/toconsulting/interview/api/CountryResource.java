package com.toconsulting.interview.api;

import com.toconsulting.interview.model.Country;
import com.toconsulting.interview.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "countries")
public class CountryResource {
    
    @Autowired
    private CountryRepository countryRepository;
    
    @GetMapping
    public @ResponseBody Iterable<Country> countriesApi() {
        return countryRepository.findAll();
    }
}
