// Javadoc-style comments here don't appear in Javadoc
package uk.avalokita.pointless;

//Javadoc-style comments here don't appear in Javadoc
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * A static method factory for printing text, using log4j2.
 * This class can have its own dedicated Console Appender in log4j2.xml, which prints only
 * the message, i.e. no date/time/classname. The intention is that it can be a substitute
 * for System.out.println etc.
 *  
 * @author greg
 *
 */
public class TextPrinter {

	/**
	 * log4j2 Logger
	 */
	private static final Logger LOG = LogManager.getLogger(TextPrinter.class);

	/**
	 * private constructor enforces noninstantiability
	 */
	private TextPrinter() {
		throw new AssertionError();
	}
	
	/**
	 * @param level severity level at which to print text
	 * @param string text to print
	 */
	public static void levelPrint(Level level, String string) {
		LOG.log(level, string);
	}

}
