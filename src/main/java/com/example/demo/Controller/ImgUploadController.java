package com.example.demo.Controller;

import java.util.Date;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.demo.Entities.File;
import com.example.demo.Entities.State;
import com.example.demo.Service.FileStorageService;



@RestController
@RequestMapping("/Upload")
public class ImgUploadController {

@Autowired
private FileStorageService fileStorageService;

@GetMapping("/test")
  public State test()
{
	 State E = new State();
	 E.setDate(new Date()); 
	 E.setEtat("good") ;
	 return E;
}
     @CrossOrigin 
     @PostMapping("/getJson")       
     public File getJSON(@RequestParam("file") MultipartFile file) {
    	 
         String fileName = fileStorageService.storeFile(file);

         String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath()
                 .path("/downloadFile/")
                 .path(fileName)
                 .toUriString();
          
         File F = new File();
         F.setFilename(fileName);
         F.setPath("C:/Users/Noussair OULHAJ/Documents/nutri-work/imgtext/uploads/");
         F.fileDownloadUri = fileDownloadUri;
		 return F;
     }
}
