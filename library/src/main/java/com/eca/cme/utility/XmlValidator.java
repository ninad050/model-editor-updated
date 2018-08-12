package com.eca.cme.utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.eca.cme.base.support.DebugMgmt;

public class XmlValidator {

    /*
	 * Method to validate file
	 * */
    public static boolean validateFile(String filePath) {
        boolean flag = false;
        File file;
        try {
            file = new File(filePath);
            boolean extension = checkExtention(file);
            boolean fSize = checkFileSize(file);
            if (extension == true && fSize == true) {
                flag = true;
            } else {
                flag = false;
            }
        } catch (NullPointerException e) {
            DebugMgmt.log(e);
        }
        return flag;
    }

    /*
	 * Method for get file size in MB.
     */
    public static double getFileSize(File file) {
        double fsize = 0;
        try {
            if (file != null) {
                fsize = file.length() / (1024 * 1024);
            }
        } catch (NullPointerException e) {
            DebugMgmt.log(e);
        }
        return fsize;
    }

    /*
	 * Method for file size validation.
     */
    public static boolean checkFileSize(File file) {
        boolean flag = false;
        String fsize = getPropertyValue("filesize");
        try {
            double fileSize = Double.parseDouble(fsize);
            flag = getFileSize(file) < fileSize;

        } catch (NumberFormatException e) {
            DebugMgmt.log(e);
        }
        return flag;
    }

    /*
	 * Method for file extension validation.
     */
    public static boolean checkExtention(File file) {
        boolean flag = false;
        try {
            if (file != null) {
                flag = file.getName().toLowerCase().endsWith(".xml");
            }
        } catch (Exception e) {
            DebugMgmt.log(e);
        }
        return flag;
    }

    /*
    * Method for getting any Property value from config.properties
     */
    public static String getPropertyValue(String propertyname) {

        String file = "clires/config.properties"; //reading properties file from a resource folder

        ClassLoader classLoader = new XmlValidator().getClass().getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream(file);

        String propertyValue = null;

        try {
            Properties properties = new Properties();
            properties.load(inputStream);
            propertyValue = properties.getProperty(propertyname);

        } catch (FileNotFoundException e) {
            DebugMgmt.log(e);
        } catch (IOException e) {
            DebugMgmt.log(e);
        }
        return propertyValue;
    }


	public static boolean isFileAvailable(String filePath) {
		try {
				File file = new File(filePath);
				boolean isAvailable =file.exists();
				if(isAvailable==true)
				{
					return true;
				}
			} catch (Exception e) {
				DebugMgmt.log(e);
			}
		return false;
	}
    
}
