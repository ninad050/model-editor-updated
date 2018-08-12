package com.eca.cme.base.support;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kumaravi
 */
public class DebugMgmt {

    public static boolean isDebugEnabled = false;
    static final Logger LOGGER = Logger.getAnonymousLogger();

    public static void log(Object log) {
        if (isDebugEnabled && log!=null) {
            System.out.println(log.toString());
            LOGGER.log(Level.FINEST, log.toString());
        }
    }

}
