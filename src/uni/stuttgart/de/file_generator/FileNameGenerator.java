package uni.stuttgart.de.file_generator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import uni.sttuttgart.de.pattern_configuration.InputConfiguration;

public class FileNameGenerator {

	private static final String OUTPUT_FILE_NAME = "file_pattern_output.txt";
	
	public static void generate(List<InputConfiguration> inputConfigurationList) throws IOException {
		
		StringBuilder fileName = new StringBuilder();
		fileName.append( System.getProperty("user.dir") ).append( "\\" + OUTPUT_FILE_NAME );

		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter( FileNameGenerator.createFile(fileName.toString()) );
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		if (fileWriter == null) {
			System.out.println("Error while creating file!"); return;
		}
		
		for ( InputConfiguration inputConfiguration : inputConfigurationList ) {
			fileWriter.write( PatternGenerator.generate(inputConfiguration) );
			fileWriter.write( System.lineSeparator()  );
		}
		
		fileWriter.close();
		
	}
	
	public static File createFile(final String fullPath) throws IOException {
		
	    File file = new File(fullPath);
	    file.getParentFile().mkdirs();
	    file.createNewFile();
	    
	    return file;
	    
	}
}
