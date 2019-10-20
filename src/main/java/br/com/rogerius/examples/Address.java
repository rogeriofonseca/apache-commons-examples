package br.com.rogerius.examples;

public class Address {

	private String locality;
	private String city;

	public Address(String locality, String city) {
		this.setLocality(locality);
		this.setCity(city);
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
