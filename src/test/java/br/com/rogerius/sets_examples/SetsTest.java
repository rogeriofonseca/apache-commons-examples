package br.com.rogerius.sets_examples;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.builder.DiffResult;
import org.junit.Before;
import org.junit.Test;

import br.com.rogerius.examples.Customer;

public class SetsTest {

	List<Customer> version1 = new ArrayList<Customer>();
	List<Customer> version2 = new ArrayList<Customer>();
	List<Customer> list3 = new ArrayList<Customer>();

	@Before
	public void setUp() {
		Customer a1 = new Customer("1", "A1");
		Customer b1 = new Customer("2", "B1");
		Customer c1 = new Customer("3", "C1");
		
		Customer a2 = new Customer("1", "A1");
		Customer b2 = new Customer("2", "B2");
		Customer d1 = new Customer("4", "D1");
		Customer e1 = new Customer("5", "E1");

		version1 = Arrays.asList(a1, b1, c1);
		version2 = Arrays.asList(a2, b2, d1,e1);
		
	}

//	@Test
	public void givenCustomerListAndASubcollection_whenChecked_thenTrue() {
		assertTrue(CollectionUtils.isSubCollection(version1, version2));
	}

	List<DiffResult> diferencas = new ArrayList<DiffResult>();
	@Test
	public void givenTwoLists_whenIntersected_thenCheckSize() {
		Collection<Customer> intersection = CollectionUtils.intersection(version1, version2);
//		System.out.println("Intersection");
//		CollectionUtils.
//		intersection.forEach(i -> System.out.println(i.getName()));
		
//		for (Customer customer : intersection) {
//			diferencas.add();
//		}
//		assertTrue(intersection.size() == 2);
	}
	
	@Test
	public void givenTwoLists_whenSubtracted_thenCheckElementNotPresentInA() {
	    List<Customer> adicionados = (List<Customer>) CollectionUtils.subtract(version2, version1);
    	Collection<Customer> removidos = CollectionUtils.subtract(version1, version2);
	    
//    	System.out.println("Adicionados");
//	    adicionados.forEach(i -> System.out.println(i.getName()));
//	    
//	    System.out.println("Removidos");
//	    removidos.forEach(i -> System.out.println(i.getName()));
	    
	    for (Iterator iterator = adicionados.iterator(); iterator.hasNext();) {
			Customer adicionado = (Customer) iterator.next();
			for (Iterator iterator2 = removidos.iterator(); iterator2.hasNext();) {
				Customer removido = (Customer) iterator2.next();
				if(adicionado.getId().equals(removido.getId())){
					iterator.remove();
					iterator2.remove();
				}
			}
		}
	    
	    System.out.println("Adicionados (Sem editados)");
	    adicionados.forEach(i -> System.out.println(i.getName()));
	    
	    System.out.println("Removidos (Sem editados)");
	    removidos.forEach(i -> System.out.println(i.getName()));

//	    assertFalse(result.contains(customer1));
	}
}
