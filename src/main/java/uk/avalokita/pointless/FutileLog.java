// Javadoc-style comments here don't appear in Javadoc
package uk.avalokita.pointless;

//Javadoc-style comments here don't appear in Javadoc
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * No use to end users. It's a learning sandbox for me.
 * @author greg
 */
public class FutileLog {

	/**
	 * Complain about being called into existence
	 */
	public FutileLog() {
		LOG.info("I never asked to be born");
	}
	
	/**
	 * log4j2 Logger
	 */
	private static final Logger LOG = LogManager.getLogger(FutileLog.class);

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "What difference does it make?";
	}

}
