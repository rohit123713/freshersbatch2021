package com.training.model;

import java.io.Serializable;
import java.time.LocalDate;

public class Invoice implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 108L;
	private int invoiceNumber;
	private String customerName;
	private double quantity;
	private double ratePerUnit;
	private LocalDate invoiceDate;
	public Invoice() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Invoice(int invoiceNumber, String customerName, double quantity, double ratePerUnit,
			LocalDate invoiceDate) {
		super();
		this.invoiceNumber = invoiceNumber;
		this.customerName = customerName;
		this.quantity = quantity;
		this.ratePerUnit = ratePerUnit;
		this.invoiceDate = invoiceDate;
	}
	public int getInvoiceNumber() {
		return invoiceNumber;
	}
	public void setInvoiceNumber(int invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	public double getRatePerUnit() {
		return ratePerUnit;
	}
	public void setRatePerUnit(double ratePerUnit) {
		this.ratePerUnit = ratePerUnit;
	}
	public LocalDate getInvoiceDate() {
		return invoiceDate;
	}
	public void setInvoiceDate(LocalDate invoiceDate) {
		this.invoiceDate = invoiceDate;
	}
	@Override
	public String toString() {
		//return "Invoice [invoiceNumber=" + invoiceNumber + ", customerName=" + customerName + ", quantity=" + quantity
		//		+ ", ratePerUnit=" + ratePerUnit + ", invoiceDate=" + invoiceDate + "]";
		
		return invoiceNumber + "," + customerName + "," + quantity + "," 
		+ratePerUnit + "," + invoiceDate ;
		
				
	}
	
	
}
