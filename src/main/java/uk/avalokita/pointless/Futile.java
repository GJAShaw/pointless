/**
 * 
 */
package uk.avalokita.pointless;

/**
 * @author greg
 *
 */
public class Futile {
	
	/**
	 * @param text
	 */
	public Futile(String text) {
		this.text = text;
		this.length = text.length();
	}

	/**
	 *
	 */
	public Futile() {
		this("hollow");
	}

	final private int length;
	
	/**
	 * @return the length
	 */
	int getLength() {
		return length;
	}

	final private String text;

	/**
	 * @return the text
	 */
	String getText() {
		return text;
	}

}
