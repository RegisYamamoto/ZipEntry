package com.regis.zipentry.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipUtil {

	public File zipFile(String outputFileName, File file ) throws IOException{
	    byte[] buffer = new byte[1024];

	    try{
	        File output = new  File(outputFileName);
	        FileOutputStream fos = new FileOutputStream(output);
	        ZipOutputStream zos = new ZipOutputStream(fos);
	        ZipEntry ze = new ZipEntry(file.getName());
	        zos.putNextEntry(ze);
	        FileInputStream in = new FileInputStream(file);

	        int len;
	        while ((len = in.read(buffer)) > 0) {
	            zos.write(buffer, 0, len);
	        }

	        in.close();
	        zos.closeEntry();
	        zos.close();

	        return output;
	    }catch(IOException ex){
	        ex.printStackTrace();
	        return null;
	    }
	}
	
}
