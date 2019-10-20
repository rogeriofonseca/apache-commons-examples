package br.com.rogerius.examples;

public class Customer {

	private Integer id;
	private String name;
	private Address address;

	public Customer(int id, String name, String locality, String city) {
		this.setId(id);
		this.setName(name);
		this.setAddress(new Address(locality,city));
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}
