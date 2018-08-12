package com.eca.cme.service;

import org.json.JSONException;
import org.json.JSONObject;

import com.eca.cme.base.support.DebugMgmt;
import com.eca.cme.dao.CMEDao;
import com.eca.cme.utility.XmlValidator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class EditService {
//
//    public static String readXML (String filePath)  {
//        JSONObject tempJsonObj = new JSONObject();
//        JSONObject obj = null;
//
//        try {
//            boolean isValid = XmlValidator.validateFile(filePath);
//            if (isValid) {
//                obj = CMEDao.readFile(filePath);
//                tempJsonObj = EditService.prepareResponseBody(filePath, isValid);
//                tempJsonObj.put("responseData", obj.get("responseData"));
//            } else {
//                tempJsonObj = EditService.prepareResponseBody(filePath, isValid);
//                JSONObject innerJson = new JSONObject();
//                innerJson.put("id", filePath);
//                tempJsonObj.put("responseData", innerJson);
//            }
//        } catch (NullPointerException e) {
//            DebugMgmt.log(e);
//        } catch (JSONException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//        return tempJsonObj.toString();
//    }
//
//    public static JSONObject prepareResponseBody(String filePath, boolean isValid) {
//        //System.out.println("isvalid in preparebody----"+isValid);
//        JSONObject tempJsonObj = new JSONObject();
//        String successCode = XmlValidator.getPropertyValue("successStatusCode");
//        String successMessage = XmlValidator.getPropertyValue("successMessage");
//        String failureCode = XmlValidator.getPropertyValue("failureStatusCode");
//        String failureMessage = XmlValidator.getPropertyValue("failureMessage");
//
//        String statusCode;
//        String statusMessage;
//
//        try {
//            if (isValid != false) {
//                statusCode = successCode;
//                statusMessage = successMessage;
//                tempJsonObj.put("statusCode", statusCode);
//                tempJsonObj.put("statusMessage", statusMessage);
//            } else {
//                statusCode = failureCode;
//                statusMessage = failureMessage;
//                tempJsonObj.put("statusCode", statusCode);
//                tempJsonObj.put("statusMessage", statusMessage);
//            }
//        } catch (Exception e) {
//            DebugMgmt.log(e);
//        }
//        return tempJsonObj;
//    }
//    
//    
// 
//
}
