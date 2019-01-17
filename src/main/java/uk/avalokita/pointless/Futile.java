/**
 * Here is a comment just before the package statement
 */
package uk.avalokita.pointless;

import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * @author greg
 *
 * Some text is here in the class header comment
 */
public class Futile {
	
	/**
	 * default value for the text field
	 */
	public static final String DEFAULT_TEXT = "hollow";
	
	/**
	 * @param text value assigned to the text field
	 * @throws SocketException 
	 */
	public Futile(String text) throws SocketException {
		this.datagramSocket = new DatagramSocket();
		this.text = text;
		this.length = text.length();
	}

	/**
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
	 * @return length of the text field
	 */
	public int getLength() {
		return length;
	}

	/**
	 * Another private field - none of your business
	 */
	final private String text;

	/**
	 * @return value of the text field
	 */
	public String getText() {
		return text;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "what difference does it make?";
	}

}
