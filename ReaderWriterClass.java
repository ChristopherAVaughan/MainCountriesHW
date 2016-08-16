package MainCountriesHW;

import java.io.*;
import java.nio.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReaderWriterClass {
	
	Path countryList = Paths.get("\\Users\\admin\\newWorkspace\\CountriesHW\\CountriesVisited");
	File ourUpdatedCountryFile = countryList.toFile();
	
	try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(ourNewFile, true)))) {
		LocalDateTime currentDateTime = LocalDateTime.now();
		
		out.println("I accessed this app at " + currentDateTime);
		
	} catch (IOException e) {
		e.printStackTrace();
	}
	


}
