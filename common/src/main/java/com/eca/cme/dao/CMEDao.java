package com.eca.cme.dao;

import java.io.File;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.json.JSONException;
import org.json.JSONObject;
import com.eca.cme.base.support.DebugMgmt;
import com.eca.cme.entities.CustomFile;
import com.eca.cme.model.ClassXmlType;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CMEDao {
	
	private static File lastSelected;
	
	/*
	 * Method to read,validate and convert XML to JSON.
	 * 
	 * */
      public static JSONObject readFile(String filePath) {
    	  
         File file = new File(filePath);
         JSONObject obj = new JSONObject();
         JAXBContext jaxbContext;
         String jsonInString = "";
         try {
              jaxbContext = JAXBContext.newInstance( ClassXmlType.class);
              Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();  
              ClassXmlType que= (ClassXmlType) jaxbUnmarshaller.unmarshal(file);
         
                ObjectMapper mapper = new ObjectMapper();
                jsonInString = mapper.writeValueAsString(que);
             //   System.out.println("jsonInString"+jsonInString);
            
                JSONObject innerJsonObj = new JSONObject(jsonInString);
                innerJsonObj.put("id", filePath);
            obj.put("responseData", innerJsonObj);
           
         } catch (JAXBException e) {
               DebugMgmt.log(e);
        	 System.out.println("yeah this is expection we are expecting.");
         } catch (JsonProcessingException e) {
                DebugMgmt.log(e);
         }  

   return obj;
         
   }

	public static ArrayList<CustomFile> showFiles(String fileDirectory) {
		
		File directory = new File(fileDirectory);
		ArrayList<CustomFile> list = new ArrayList<CustomFile>();
		//get all the files from a directory
		File[] fList = directory.listFiles();
		for (File file : fList){
			list.add(new CustomFile(file.getName(),file.getPath()));
		}
		return list;
		
	}
}
