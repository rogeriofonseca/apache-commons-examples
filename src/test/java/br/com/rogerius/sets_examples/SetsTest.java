package br.com.rogerius.sets_examples;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.junit.Before;
import org.junit.Test;

import br.com.rogerius.examples.Customer;

public class SetsTest {

	List<Customer> list1 = new ArrayList<Customer>();
	List<Customer> list2 = new ArrayList<Customer>();
	List<Customer> list3 = new ArrayList<Customer>();

	@Before
	public void setUp() {
		Customer customer1 = new Customer(1, "Daniel", "locality1", "city1");
		Customer customer2 = new Customer(2, "Fredrik", "locality2", "city2");
		Customer customer3 = new Customer(3, "Kyle", "locality3", "city3");
		Customer customer4 = new Customer(4, "Bob", "locality4", "city4");
		Customer customer5 = new Customer(5, "Cat", "locality5", "city5");
		Customer customer6 = new Customer(6, "John", "locality6", "city6");

		list1 = Arrays.asList(customer1, customer2, customer3);
		list2 = Arrays.asList(customer4, customer5, customer6);
		list3 = Arrays.asList(customer1, customer2);

		List<Customer> linkedList1 = new LinkedList<Customer>(list1);
	}

	@Test
	public void givenCustomerListAndASubcollection_whenChecked_thenTrue() {
		assertTrue(CollectionUtils.isSubCollection(list3, list1));
	}
	
	@Test
	public void givenTwoLists_whenIntersected_thenCheckSize() {
	    Collection<Customer> intersection = CollectionUtils.intersection(list1, list3);
	    assertTrue(intersection.size() == 2);
	}
}
