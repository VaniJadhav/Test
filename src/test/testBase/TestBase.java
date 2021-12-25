package testBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class TestBase {

	Properties pro= new Properties();
	File file ;
	FileInputStream fi;
	
	public void init() throws Exception {
		this.loadProperti();
		
	}
	
	public void loadProperti() throws Exception {
		file=new File(("user.dir")+"\\src\\test\\java\\resources\\config.properties");
		fi= new FileInputStream(file);
		pro.load(fi);
	}
}
