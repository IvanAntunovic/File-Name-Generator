package uni.stuttgart.de.app;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import uni.sttuttgart.de.pattern_configuration.InputConfiguration;
import uni.sttuttgart.de.pattern_configuration.InputConfigurationParser;
import uni.stuttgart.de.file_generator.FileNameGenerator;

public class Main {

	private static String filePattern;
	private static String startRange;
	private static String endRange;
	private static String createSeperateFile;
	
	private static final String CONFIGURATION_FILE_NAME = "configuration.csv";
	
	public static void main(String[] args) {
	
		System.out.println("File generation tool! Use '#' character in the 'configuration.csv' file to specify variable character.");

		try {
			testInputConfigurationParser(System.getProperty("user.dir") + "\\" + CONFIGURATION_FILE_NAME);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void testInputConfigurationParser(final String configurationFileName) throws IOException {
		
		if( !Files.exists(Paths.get(configurationFileName)) ) { 
		    System.out.println("There is no configuration file in the current folder!\nYou need to put configuration.csv file first in order to use this application!");
		    return;
		}

		FileNameGenerator.generate( InputConfigurationParser.parse( new File( configurationFileName ) ) );
		System.out.println("File name generation has finished! Check 'file_pattern_output.txt' file for the output result.");

	}

}
