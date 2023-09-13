package com.toconsulting.interview.repository;

import com.toconsulting.interview.model.Country;
import org.springframework.data.repository.CrudRepository;

public interface CountryRepository extends CrudRepository<Country, Integer> {
}
