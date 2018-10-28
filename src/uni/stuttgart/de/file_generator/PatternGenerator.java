package uni.stuttgart.de.file_generator;

import java.io.IOException;

import uni.sttuttgart.de.pattern_configuration.Configuration;

public class PatternGenerator {
	
	private static final String NEW_LINE_SEPERATOR = System.lineSeparator();
	private static final String PATTERN_SPECIAL_CHARACTER = "#";
	
	public static String generate(Configuration inputConfiguration) throws IOException {
								
		StringBuilder pattern = new StringBuilder();

		String tempPattern = inputConfiguration.getFilePattern();
		int endRange = Integer.parseInt(inputConfiguration.getEndIndex());
		
		for ( int index = Integer.parseInt(inputConfiguration.getStartIndex()); index <= endRange; ++index ) {
			
			tempPattern = tempPattern.replaceAll( PATTERN_SPECIAL_CHARACTER, Integer.toString(index) );
			pattern.append( tempPattern ).append(NEW_LINE_SEPERATOR);
			tempPattern = inputConfiguration.getFilePattern();
			
		}
		
		return pattern.toString();
	}
	


}
