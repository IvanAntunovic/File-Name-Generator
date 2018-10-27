package uni.sttuttgart.de.pattern_configuration;

public class InputConfiguration {
	
	private String filePattern;
	private String startIndex;
	private String endIndex;
	
	public InputConfiguration(String filePattern, String startIndex, String endIndex) {
		this.filePattern = filePattern;
		this.startIndex = startIndex;
		this.endIndex = endIndex;
	}
	public String getFilePattern() {
		return filePattern;
	}
	public String getStartIndex() {
		return startIndex;
	}
	public String getEndIndex() {
		return endIndex;
	}
	@Override
	public String toString() {
		return "InputConfiguration [filePattern=" + filePattern + ", startIndex=" + startIndex + ", endIndex="
				+ endIndex + "]";
	}

}
