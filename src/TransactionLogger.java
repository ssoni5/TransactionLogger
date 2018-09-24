// Name: Shamoil Soni, Omar Jasso Project: 4b Submission Date: 11/13/2017

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Observable;
import java.util.Observer;

/**
 * This is the TransactionLogger which implements Observer class
 * @author Shamoil Soni
 * @version 1.0 11/13/2017
 */
public class TransactionLogger implements Observer {
	private String logFileName;
	private PrintWriter _log;
	
	/**
	 * Here is the constructor for the TransactionLogger class
	 * @param fileName base class
	 * @throws IOException 
	 */
	public TransactionLogger(String fileName) 
		throws IOException {
		logFileName = fileName;
		_log = new PrintWriter(new BufferedWriter(
				new FileWriter(logFileName, true)));
	}
	/**
	 * The update method
	 */
	@Override
	public void update(Observable obs, Object info) {
		_log.println(info);
		_log.flush( );
		System.out.println(info);
	}
}
