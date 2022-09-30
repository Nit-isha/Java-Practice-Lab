package com.degreePractice;
import java.util.regex.*;

class TransactionParty {
	String seller;
	String buyer;
	
	public TransactionParty (String seller, String buyer) {
		this.buyer = buyer;
		this.seller = seller;
	}
}

class Receipt {
	TransactionParty transactionParty;
    String productsQR;
    
    public Receipt(TransactionParty transactionParty, String productsQR) {
    	this.transactionParty = transactionParty;
    	this.productsQR = productsQR;
    }
}

class GenerateReceipt {
	
	public int verifyParty (Receipt r) {
		int count = 0;

		Pattern regex = Pattern.compile("^[a-zA-z]+[a-zA-Z'\s-]+[a-zA-Z]$");
		
		if ((regex.matcher(r.transactionParty.buyer)).matches()) {
			count++;
		}
		if ((regex.matcher(r.transactionParty.seller)).matches()) {
			count++;
		}
		return count;
	}
	
	public String calcGST (Receipt r) {
		float GST_Rate = 0.12f;
		String[] rSplit = r.productsQR.split(",");
		int Rate1 = Integer.parseInt(rSplit[0]);
		int Quantity1 = Integer.parseInt(rSplit[1].split("@")[0]);
		int Rate2 = Integer.parseInt(rSplit[1].split("@")[1]);
		int Quantity2 = Integer.parseInt(rSplit[2].split("@")[0]);
		int Rate3 = Integer.parseInt(rSplit[2].split("@")[1]);
		int Quantity3 = Integer.parseInt(rSplit[3]);
		
		int GST = (int)((Rate1 * Quantity1 + Rate2 * Quantity2 + Rate3 * Quantity3) * GST_Rate);
		return String.valueOf(GST);
	}
	
}

public class Source8 {
	public static void main(String[] args) {
		TransactionParty tp = new TransactionParty("Nitisha Gupta", "dnfjs768768");
		Receipt r = new Receipt(tp, "250,10@100,3@50,7");
		
		GenerateReceipt gr = new GenerateReceipt();
		System.out.println(gr.verifyParty(r));
		System.out.println(gr.calcGST(r));
		
	}
}
