/**
 * Here is a comment just before the package statement
 */
package uk.avalokita.pointless;

import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * @author greg
 * Some text is here in the class header comment
 *
 */
public class Futile {
	
	/**
	 * The default value for the text field
	 */
	public static final String DEFAULT_TEXT = "hollow";
	
	/**
	 * @param text
	 * Here is some text in the Futile(String) constructor comment
	 * @throws SocketException 
	 */
	public Futile(String text) throws SocketException {
		this.datagramSocket = new DatagramSocket();
		this.text = text;
		this.length = text.length();
	}

	/**
	 * Some text in the Futile() constructor comment
	 * @throws SocketException 
	 */
	public Futile() throws SocketException {
		this(DEFAULT_TEXT);
	}
	
	/**
	 * A private field - none of your business
	 */
	final private DatagramSocket datagramSocket;

	/**
	 * @return local port opened by the DatagramSocket field
	 */
	public int localPort() {
		return datagramSocket.getLocalPort();
	}
	
	/**
	 * A private field - none of your business
	 */
	final private int length;
	
	/**
	 * @return the length
	 */
	int getLength() {
		return length;
	}

	/**
	 * Another private field - none of your business
	 */
	final private String text;

	/**
	 * @return the text
	 */
	String getText() {
		return text;
	}

}
