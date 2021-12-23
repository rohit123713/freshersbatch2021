package com.training;

import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

import com.training.model.Invoice;
import com.training.services.InvoiceFileService;

public class Application {

	public static String common(boolean result) {
		if(result) {
			return "File Created and Record Added";
		}else {
			return "Exception -check the console";
		}
	}
	public static void main(String[] args) {
		
		InvoiceFileService service = new InvoiceFileService();
		Logger logger= Logger.getLogger(Application.class.getClass().getName());
		
		File file = new File("E:\\temporary\\invoice.txt");
		Scanner sc= new Scanner(System.in);
		
		File fileforSerialize=new File("invoice.ser");
		System.out.println("Enter the key");
		int key = sc.nextInt();
		
		
		switch (key) {
		case 1: //write a file
			Invoice invoice = new Invoice(104,"varun",40,200,LocalDate.now());
			
			boolean result =service.writeToTextFile(invoice, file);
			
//			if(result) {
//				System.out.println("File Created and Record Added");
//			}else {
//				System.out.println("Exception -check the console");
//			}
			logger.info(common(result));
			break;

		case 2: //read a file
			List<Invoice> invList = service.readFromTextFile(file);
			invList.forEach(System.out::println);
			break;
		case 3: //serializable
			Invoice inv = new Invoice(982, "Murali", 20, 100, LocalDate.of(2020, 2, 14));
			boolean response = service.writeUsingStream(inv, fileforSerialize);
//			if(response) {
//				System.out.println("File Created and Record Added");
//			}
//			else {
//				System.out.println("Exception - file not created");
//			}
			logger.info(common(response));
		case 4: //deserializable
			
			Invoice invFromFile = service.readUsingStream(fileforSerialize);
			System.out.println(invFromFile);
			break;
			
		case 5: // serializable in list
			Invoice mali = new Invoice(989, "Malini", 20, 100, LocalDate.of(2020, 2, 14));
			Invoice vali = new Invoice(987, "Valli", 30, 200, LocalDate.of(2020, 2, 14));
			Invoice vishal = new Invoice(989, "Vishal", 50, 120, LocalDate.of(2020, 2, 14));
			
			ArrayList<Invoice> invlist = new ArrayList<Invoice>();
			invlist.add(mali);
			invlist.add(vali);
			invlist.add(vishal);
			
			boolean respon = service.writeAsStream(invlist, fileforSerialize);
//			if(respon) {
//				System.out.println("File Created and Record Added");
//			}
//			else {
//				System.out.println("Exception - file not created");
//			}
			logger.info(common(respon));
			break;
		case 6: //deserializable form list
			List<Invoice> fromList = service.readAsListUsingStream(fileforSerialize);
			fromList.forEach(System.out::println);
			break;
		default:
			break;
		}
		
	sc.close();

	}

}
