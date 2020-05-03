package com.cts;

import org.apache.logging.log4j.Logger;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.apache.logging.log4j.LogManager;

public class LoggerImpl implements ApplicationRunner {

	public static final Logger logger = LogManager.getLogger(LoggerImpl.class);

	public void runMe(String parameter) {

		if (logger.isDebugEnabled()) {
			logger.debug("This is debug : " + parameter);
		}

		if (logger.isInfoEnabled()) {
			logger.info("This is info : " + parameter);
		}

		logger.warn("This is warn : " + parameter);
		logger.error("This is error : " + parameter);
		logger.fatal("This is fatal : " + parameter);

	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		logger.debug("Debugging log");
		logger.info("Info log");
//		logger.warn("Hey, This is a warning!");
//		logger.error("Oops! We have an Error. OK");
//		logger.fatal("Damn! Fatal error. Please fix me.");

	}

	public void warning(String parameter) {
		logger.warn("Hey, This is a warning!");
		logger.error("Oops! We have an Error. OK");
		logger.warn("This is warn : " + parameter);

		logger.fatal("Damn! Fatal error. Please fix me.");

	}

	public void run2(String parameter) {
		logger.info(parameter+" "+"is running successfully");

	}
}
