package com.OrangeHrm.genericUtil;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtil {
	
	private FileUtil() {
		
	}
	
	public static FileUtil ObjectFiletil() {
		FileUtil Fu = new FileUtil();
		return Fu;
		
	}
   public String readDataFromPropFile(String key) throws IOException {
	   FileInputStream fis = new FileInputStream(IAutoConstants.propfilepath);
	   Properties pro= new Properties();
		pro.load(fis);
		return pro.getProperty(key);
		
   }
}

