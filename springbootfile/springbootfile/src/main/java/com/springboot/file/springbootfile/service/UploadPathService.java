package com.springboot.file.springbootfile.service;

import java.io.File;

public interface UploadPathService {
	
	File getFilePath(String modifiedFileName, String path);

}
