package loggerexample;

import org.apache.log4j.Logger;

public class Runner {
	
	// Runner is the class
	private static Logger log;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// System.out - avoid, can cause complications with application run!
		// Use logger instead...
		//System.out.println("Hello Project");
		
		// Runner should begin before referencing the class - else it may not be registered on the VM
		log = Logger.getLogger(Runner.class.getName());
		
		log.info("Hello Project");
		log.warn("\t!!!  Sample warning with developer message  !!!");
		
		// check your target folder for an output log of the console!!
	}

}
