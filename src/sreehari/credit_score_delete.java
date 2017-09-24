package sreehari;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class credit_score_delete {

	public static void main(String[] args) {
	  	
	   	  try
		{
		  
	 		BufferedReader br = new BufferedReader(new FileReader("/Users/scheerla1/Downloads/data/1aa.txt"));
	 		String sCurrentLine;
	         int i =1;
	 		while ((sCurrentLine = br.readLine()) != null) {
	 			
	 			String shardId = sCurrentLine.split(",")[1];
	 			String userId = sCurrentLine.split(",")[2];
	 			
	 			String query = "delete from credit_inquiry where userid=" + userId +";\n" +
	 							"delete from credit_trade_line where userid=" + userId +";\n" +
	 							"delete from credit_public_record where userid="+ userId +";\n" +
	 							"delete from credit_refresh_properties where userid="+ userId +";\n" +
	 							"delete from credit_profile_refresh where userid="+ userId +";\n" +
	 							"delete from credit_monitoring_user_address where userid="+ userId +";\n" +
	 							"delete from credit_monitoring_registration where userid="+ userId +";\n" +
	 							"delete from credit_profile where userid="+ userId +";\n" +
	 							"delete from user_property where userid=" + userId + " and name='creditScoreRegistered'"+";\n" + 
	 							"delete from user_property where userid=" + userId + " and name='creditscore.welcomemat.dismissed'" +";\n";
		   		File file = new File("/Users/scheerla1/Downloads/data/"+shardId + ".sql");
		        if (!file.exists()) file.createNewFile();
		        
		 		FileWriter fw = new FileWriter(file.getAbsoluteFile(),true);
		 		BufferedWriter bw = new BufferedWriter(fw);

	 			System.out.println(sCurrentLine);
				bw.write(query+"\n");	
	 			i++;
		 		bw.close();

	 		}
	 		
		} catch (IOException e) {
			e.printStackTrace();
		} 

	  }
	
}
