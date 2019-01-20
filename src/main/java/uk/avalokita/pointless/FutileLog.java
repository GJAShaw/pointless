// Javadoc-style comments here don't appear in Javadoc
package uk.avalokita.pointless;

//Javadoc-style comments here don't appear in Javadoc
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Doesn't really serve any purpose except to help me learn Javadoc
 * @author greg
 */
public class FutileLog {

	public FutileLog() {
		LOG.info("I never asked to be born");
	}
	
	private static final Logger LOG = LogManager.getLogger(FutileLog.class);

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "what difference does it make?";
	}

}
