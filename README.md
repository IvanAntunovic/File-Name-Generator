*Running the program*
	1. open command prompt
	2. change current directory in the location where 'file_name_generator.jar' file is located
	3. place 'configuration.csv' file in the same directory
	4. in the command prompt, enter the following command: 'java -jar file_name_generator.jar'
	5. if program has been successfully run, output should be generated in the 'file_pattern_output.txt' file.

*configuration.csv*
	- used as an input file
	- fields should be seperated by comma
	- example: [pattern_name],start_index,end_index
		- where pattern_name contains '#' character for variable part of the pattern_name
		
*file_pattern_output.txt*
	- file in which output is generated
	
*Example*
	'configuration.csv' content:
		TKE_Week_5_Flume_#b = importdata ('TKE_Week_5_Flume_#b.csv'),1,5
		RS_Week_1_Flume_#b = importdata ('RS_Week_1_Flume_#b.csv'),5,10
		
	'file_pattern_output.txt' content:
		TKE_Week_5_Flume_1b = importdata ('TKE_Week_5_Flume_1b.csv');
		TKE_Week_5_Flume_2b = importdata ('TKE_Week_5_Flume_2b.csv');
		TKE_Week_5_Flume_3b = importdata ('TKE_Week_5_Flume_3b.csv');
		TKE_Week_5_Flume_4b = importdata ('TKE_Week_5_Flume_4b.csv');
		TKE_Week_5_Flume_5b = importdata ('TKE_Week_5_Flume_5b.csv');

		RS_Week_1_Flume_5b = importdata ('RS_Week_1_Flume_5b.csv');
		RS_Week_1_Flume_6b = importdata ('RS_Week_1_Flume_6b.csv');
		RS_Week_1_Flume_7b = importdata ('RS_Week_1_Flume_7b.csv');
		RS_Week_1_Flume_8b = importdata ('RS_Week_1_Flume_8b.csv');
		RS_Week_1_Flume_9b = importdata ('RS_Week_1_Flume_9b.csv');
		RS_Week_1_Flume_10b = importdata ('RS_Week_1_Flume_10b.csv');

	