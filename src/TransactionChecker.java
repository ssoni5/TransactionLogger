// Name: Shamoil Soni, Omar Jasso Project: 4b Submission Date: 11/13/2017

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Observable;
import java.util.Scanner;

/**
 * This is the TransactionChecker which implements Observable class
 * @author Shamoil Soni
 * @version 1.0 11/13/2017
 */
public class TransactionChecker extends Observable {
	Scanner _in;
	String matchTransaction;
	Transaction trans;
	
	/**
	 * Here is the constructor for the TransactionChecker class
	 * @param fileName base class
	 */
	public TransactionChecker(String fileName) 
		throws FileNotFoundException {
		_in = new Scanner(new File(fileName));
	}
	
	/**
	 * checkTransactions for the TransactionChecker class
	 */
	public void checkTransactions( ) {
		while(_in.hasNextLine( )) {
			String line = _in.nextLine( );
			String[ ] fields = line.split(",");
			trans = new Transaction(fields[0], fields[1], Double.parseDouble(fields[2]), fields[3]);
			if (fields[0].equals("Eugene Eko") && Double.parseDouble(fields[2]) > 50000.00) {
				setChanged();
				notifyObservers(this.trans);
			}
		}
		_in.close( );
	}
}
