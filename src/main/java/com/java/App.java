package com.java;

public class App {
	public static void main(String[] args) {
		BillSummary obj = new BillSummary();
		obj.setSubTotal(50000.0);
		obj.setPromoAmt(10000.0);
		obj.setVatAmt(3000.0);
		obj.setDelChargeAmt(2000.0);
		obj.setPkgChargeAmt(5000.0);

		System.out.println("GrandTotal: " + obj.getgrandTotal());
	}

}
