package com.fis.theatre.service;

import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Path;

import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class StorageService {

	private String UPLOAD_FOLDER = "/home/jovic/Documents/FIS/theatre/theatre/uploads/";

	public boolean save(MultipartFile file) {

		try {
			String fileName = file.getName();
//			String fileName = a.getFirstName+a.getLastName+a.getId

			File savingFile = new File(UPLOAD_FOLDER + fileName);
			savingFile.createNewFile();

			FileOutputStream fos = new FileOutputStream(savingFile);
			fos.write(file.getBytes());
			fos.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

	public Resource loadFile(String filename) {
		try {
			Path file = Path.of(UPLOAD_FOLDER + filename);
			Resource resource = new UrlResource(file.toUri());
			if (resource.exists() || resource.isReadable())
				return resource;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}
}
