package com.eca.cme.controller;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.eca.cme.dao.CMEDao;
import com.eca.cme.entities.CustomFile;
import com.eca.cme.service.EditService;

@RestController
public class CmeRestController {
	
	@Value("${fileDirectory}")
	private String fileDirectory;

	@GetMapping("/list")
	public ArrayList<CustomFile> showList() {
		return CMEDao.showFiles(this.fileDirectory);
	}
	
	@GetMapping("/read/{fileName}")
	public String readFile(@PathVariable("fileName") String name) {
		return EditService.readXML(this.fileDirectory + "/" + name);
		//return this.dao.showFiles(this.fileDirectory);
	}
	
 
}
