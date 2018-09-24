// Name: Shamoil Soni, Omar Jasso Project: 4b Submission Date: 11/13/2017

import java.io.Serializable;

/**
 * This is the Transaction which is the base class
 * @author Shamoil Soni
 * @version 1.3 11/13/2017
 */
public class Transaction implements Comparable<Transaction>, Serializable{
	
	private static final long serialVersionUID = 1L;
	private String _buyer;
	
	private String _seller;
	private double _amount;
	private String _timestamp;
	
	/**
	 * Here is the constructor for the Transaction class
	 * @param theId base class
	 * @param theBuyer base class
	 * @param theSeller base class
	 * @param theAmount base class
	 * @param theTimeStamp base class
	 */
	public Transaction(String theBuyer, 
			String theSeller, double theAmount, String theTimeStamp) {
		_buyer = theBuyer;
		_seller = theSeller;
		_amount = theAmount;
		_timestamp = theTimeStamp;
	}

	// Getters.
	/**
	 * 
	 * @return _buyer
	 */
	public String getBuyer() {
		return _buyer;
	}
	/**
	 * 
	 * @return _seller
	 */
	public String getSeller() {
		return _seller;
	}
	/**
	 * 
	 * @return _amount
	 */
	public double getAmount() {
		return _amount;
	}
	/**
	 * 
	 * @return _timestamp
	 */
	public String getTimeStamp() {
		return _timestamp;
	}
	/**
	 * toString for the Transaction class
	 */
	@Override
	public String toString() {
		return String.format("Buyer: %s Seller: %s Amount: %.2f Time Stamp: %s",
		   _buyer, _seller,  _amount, _timestamp);
	}
	/**
	 * The compareTo to use for the Transaction class
	 */
	public int compareTo(Transaction other) {
		return this.getBuyer().compareTo(other.getBuyer());
	}
}