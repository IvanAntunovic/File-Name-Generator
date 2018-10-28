package uni.sttuttgart.de.pattern_configuration;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class InputConfigurationParser {
	
	private static final String CONFIGURATION_SEPARATOR = ",";
	private static final int CONFIGURATION_PATTERN_LINE_MAX_SIZE = 3;
	
	public static List<Configuration> parse(File configurationFile) throws IOException {
		
		 BufferedReader configurationReader = new BufferedReader (new FileReader(configurationFile) ); 
		 List<Configuration> inputConfigurationList = new ArrayList<Configuration>();
		 
		 String configuration; 
		 String[] configurationParams;
		 while ( (configuration = configurationReader.readLine()) != null ) {
			 
			 configurationParams = configuration.split(CONFIGURATION_SEPARATOR);
			 if ( configurationParams.length < CONFIGURATION_PATTERN_LINE_MAX_SIZE ) {
				 System.out.println("Error while parsing configuration file!\nPossibly wrong input format of the configuration file!");
				 break;
			 }
			 
			 inputConfigurationList.add( new InputConfiguration(configurationParams[0],
																configurationParams[1],
																configurationParams[2]) );
		 }
		 
		 configurationReader.close();
		 
		 return inputConfigurationList;
	}

}
