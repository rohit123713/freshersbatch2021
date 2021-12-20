package com.training;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

import java.time.LocalDate;

import com.training.model.Invoice;

public class InvoiceApplication {

	
	public static List<Invoice> sortedByRatePerUnitAsc(Collection<Invoice> invList){
	
		Comparator<Invoice> MarksComparator = Comparator.comparing(Invoice::getRatePerUnit);
		
		List<Invoice> list= invList.stream().sorted(MarksComparator).collect(toList());
		return list;
	}
	
	//return a Map of Customer Name and InvoiceDate
	public static Map<String,LocalDate> mapViewofList(Collection<Invoice> invList){
		
		Map<String,LocalDate> map=invList.stream().collect(Collectors.toMap(Invoice:: getCustomerName, Invoice:: getInvoiceDate));
		return map;
	}
	
	//Create a Set of Invoice of a Particular customer
	public static Set<Invoice> setViewOfList(Collection<Invoice> invList,Predicate<Invoice> predicate){
		
		Set<Invoice> set= invList.stream().filter(predicate).collect(toSet());
		return set;
	}
	
	public static long findMaxInvoiceValue(Collection<Invoice> invList,Comparator<Invoice> comp) {
		
		Optional<Invoice> max=invList.stream().max(comp);
		if(max.isPresent()) {
			return (long) max.get().getRatePerUnit();
		}
		else {
			return 0;
		}
		
	}
	public static void main(String[] args) {
		
	
		System.out.println(sortedByRatePerUnitAsc(InvoiceService.getInvoice()));
		Map<String,LocalDate> maplist=mapViewofList(sortedByRatePerUnitAsc(InvoiceService.getInvoice()));
		
        Set<Map.Entry<String,LocalDate>> set = maplist.entrySet();
        
        for(Map.Entry<String,LocalDate> eachEntry:set) {
        	System.out.println(eachEntry.getKey() + ":"+ eachEntry.getValue());
        }
		System.out.println(setViewOfList(InvoiceService.getInvoice(),invoice-> invoice.getCustomerName().equals("Suhail")));
		
		Comparator<Invoice> comp = 
				Comparator.comparing(Invoice::getRatePerUnit);
		System.out.println(findMaxInvoiceValue(InvoiceService.getInvoice(), comp));
		
		
		
		
		
		
		
		
		
		
		
	}

}
