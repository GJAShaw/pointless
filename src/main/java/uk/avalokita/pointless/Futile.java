/**
 * Here is a comment just before the package statement
 */
package uk.avalokita.pointless;

// These don't appear in Javadocs - presumably they are implementation-dependent, not 'contractual'
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * Some text is here in the class header comment
 * @author greg
 */
public class Futile {
	
	/**
	 * default value for the text field
	 */
	public static final String DEFAULT_TEXT = "hollow";
	
	/**
	 * My favourite constructor
	 * @param text value assigned to the text field
	 * @throws SocketException if a DatagramSocket cannot be created 
	 */
	public Futile(String text) throws SocketException {
		this.datagramSocket = new DatagramSocket();
		this.text = text;
		this.length = text.length();
	}

	/**
	 * Slightly less favoured constructor, but still pretty good
	 * @throws SocketException if a DatagramSocket cannot be created  
	 */
	public Futile() throws SocketException {
		this(DEFAULT_TEXT);
	}
	
	/**
	 * A private field - none of your business
	 */
	final private DatagramSocket datagramSocket;

	/**
	 * Some stuff
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
	 * More stuff
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
	 * Are you tired of stuff yet?
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
