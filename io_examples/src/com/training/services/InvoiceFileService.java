package com.training.services;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.training.model.Invoice;
public class InvoiceFileService {

	public boolean writeToTextFile(Invoice invoice,File file) {
		
		boolean result=false;
		
		try(PrintWriter writer = new PrintWriter(new FileWriter(file,true))) {
			
			writer.println(invoice);
			result=true;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public List<Invoice> readFromTextFile(File file){
		List<Invoice> invList = new ArrayList<Invoice>();
		
		if(!file.exists()) {
			System.out.println("First Write to the file and then reading");
			return invList;
		}
		else {
				
		String line = null;
		
		try(BufferedReader reader= new BufferedReader(new FileReader(file))) {
			
			while((line = reader.readLine())!=null) {
				
				String[] values = line.split(",");
				
				int invoiceNumber= Integer.parseInt(values[0]);
				String customerName = values[1];
				double quantity = Double.parseDouble(values[2]);
				double ratePerUnit = Double.parseDouble(values[3]);
				LocalDate invoiceDate = LocalDate.parse(values[4]);
				
				Invoice inv = new Invoice(invoiceNumber, customerName, quantity, ratePerUnit, invoiceDate);
				
				invList.add(inv);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException er) {
			er.printStackTrace();
		}
		return invList;
		}	
	}
	
	public boolean writeAsStream(List<Invoice> invoiceList,File file) {
		
        boolean result =false;
    	
    	try(ObjectOutputStream outStream = 
					new ObjectOutputStream(new FileOutputStream(file))) {
			
    		outStream.writeObject(invoiceList);
    		
    		result =true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
    public boolean writeUsingStream(Invoice invoice,File file) {
    	
    	boolean result =false;
    	
    	try(ObjectOutputStream outStream = 
					new ObjectOutputStream(new FileOutputStream(file))) {
			
    		outStream.writeObject(invoice);
    		
    		result =true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
		
	}
    
    public List<Invoice> readAsListUsingStream(File file){
    	List<Invoice> invList = null;
    	
    	try(ObjectInputStream inStream= new ObjectInputStream(new FileInputStream(file))) {
    		
    		invList= (List<Invoice>)inStream.readObject();

		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
    	return invList;
    	
    }
    public Invoice readUsingStream(File file) {
    	
    	Invoice inv = null;
    	
    	try(ObjectInputStream inStream= new ObjectInputStream(new FileInputStream(file))) {
    		
    		inv= (Invoice)inStream.readObject();

		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
    	return inv;
    }
}
