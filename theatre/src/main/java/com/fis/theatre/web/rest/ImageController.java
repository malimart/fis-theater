package com.fis.theatre.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.fis.theatre.service.StorageService;

@RestController
public class ImageController {

	@Autowired
	StorageService storageService;

	@RequestMapping(value = "/image/upload", method = RequestMethod.POST)
	public ResponseEntity<Boolean> uploadImage(@RequestParam("image") MultipartFile file) {

		try {
			boolean result = storageService.save(file);
			return new ResponseEntity<>(result, HttpStatus.CREATED);
		} catch (Exception e) {
		}

		return new ResponseEntity<>(false, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@RequestMapping("image/{filename}")
	public ResponseEntity<Resource> getFile(@PathVariable String filename) {
		try {
			Resource file = storageService.loadFile(filename);
//			return new ResponseEntity<>(file, HttpStatus.OK);
			return ResponseEntity.ok()
					.header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + file.getFilename() + "\"")
					.body(file);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
