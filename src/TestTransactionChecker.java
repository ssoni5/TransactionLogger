// Name: Shamoil Soni, Omar Jasso Project: 4b Submission Date: 11/13/2017

import java.io.IOException;

public class TestTransactionChecker {

	public static void main(String[] args) throws IOException {
		// Test the Observer and Observable classes.
		TransactionChecker checker = new TransactionChecker("transactions.txt");
		TransactionLogger logger = new TransactionLogger("logger.txt");
		checker.addObserver(logger);
		checker.checkTransactions();
		
		System.out.println("Check Completed.");
	}
}
