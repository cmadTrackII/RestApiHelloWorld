package org.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;  
import org.springframework.web.bind.annotation.RestController;  



import org.anup.Country;

@RestController
public class CountryController {

	@RequestMapping(value="/", method=RequestMethod.GET, headers = "Accept=application/json")
	public String getRoot(){
		return "Root Element JSON Based REST API:: 1. /countries   XYYYYY  2. /country/{id}  ";
	}

	@RequestMapping(value="/test", method=RequestMethod.GET, headers = "Accept=application/json")
	public String getTest(){
		return "A Simple JSON Based REST API:: 1. /countries   XYYYYY  2. /country/{id}  ";
	}
	
	@RequestMapping(value = "/countries", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Country> getCountries() {
		List<Country> listOfCountries = new ArrayList<Country>();
		listOfCountries = createCountryList();
		return listOfCountries;
	}

	@RequestMapping(value = "/country/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public Country getCountryById(@PathVariable int id) {
		List<Country> listOfCountries = new ArrayList<Country>();
		listOfCountries = createCountryList();

		for (Country country : listOfCountries) {
			if (country.getId() == id)
				return country;
		}

		return null;
	}

	// Utiliy method to create country list.
	public List<Country> createCountryList() {
		Country indiaCountry = new Country(1, "India", "Anup Rungta");
		Country chinaCountry = new Country(4, "China", "Neha Rungta");
		Country nepalCountry = new Country(3, "Nepal", "Ayan Rungta");
		Country bhutanCountry = new Country(2, "Bhutan", "Aryan Rungta");

		List<Country> listOfCountries = new ArrayList<Country>();
		listOfCountries.add(indiaCountry);
		listOfCountries.add(chinaCountry);
		listOfCountries.add(nepalCountry);
		listOfCountries.add(bhutanCountry);
		return listOfCountries;
	}

}
