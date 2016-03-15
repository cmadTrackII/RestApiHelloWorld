package org.anup;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(value = { "presidentName" })
public class Country {
	int id;  
	String countryName;   
	String presidentName;


	public Country(int i, String countryName, String _presidentName) {  
		super();  
		this.id = i;  
		this.countryName = countryName;  
		this.presidentName = _presidentName;
	}  
	public int getId() {  
		return id;  
	}  
	public void setId(int id) {  
		this.id = id;  
	}  
	public String getCountryName() {  
		return countryName;  
	}  
	public void setCountryName(String countryName) {  
		this.countryName = countryName;  
	}   
	public String getPresidentName() {
		return presidentName;
	}
	public void setPresidentName(String presidentName) {
		this.presidentName = presidentName;
	}

}
