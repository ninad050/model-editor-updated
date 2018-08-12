package com.eca.cme.dao;

import java.io.File;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Component;

import com.eca.cme.base.support.DebugMgmt;
import com.eca.cme.entities.CustomFile;
import com.eca.cme.model.ClassXmlType;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CMEDao {
	
	private static File lastSelected;

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
