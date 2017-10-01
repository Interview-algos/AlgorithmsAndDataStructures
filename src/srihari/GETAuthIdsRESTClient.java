package srihari;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;


public class GETAuthIdsRESTClient {
	public static void main(String[] args) {
		ArrayList<String> listOfdates = new ArrayList<String>();
		String ids = "";
		String importDates="";
		  try {

			URL url = new URL("https://mint2tax-be.mint.com/api/v1/tax/admin/users?taxYear=2016");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");
			//conn.setRequestProperty("Authorization", "Bearer eyJlbmMiOiJBMTI4Q0JDLUhTMjU2IiwiYWxnIjoiZGlyIn0..LhInFqPBRt-FAY69CMnguA.jIfXyKmkLWOPS2exaPC1AkRxelIBLEQvQBEwIrRMmW7JbH3srwRzCCMBi8Dqore3jQQetBnNeZvKAIew2RTuCn8sbzmtzuVSuM_lMV2SSUpP3gdU-8cfag1SF8njydFg4Qpomed8v4ofg7eOwfNHyyIRnzIVpZTw2BXswQDKL7r3kJ2MIfRvKhMyfFTyozmG3CTJlH0V3TQsQ8gU8j1F_menJ_52Dwf-s4zjT0Ogzm3eVpmE1gNPIMp2Pdc1xGBaclDFx5YSCvltvJcIPL65XTsMAdoWY1ObI9tS4tv_DWukBkPDYlFgoBuLxTZBTEYv7oDBDaisjkz0J2tBbYoqX0UnBPX7pv7qq6RbHaE6HvLrxIarPzoqV9sC78uD0InYJljjdcDOt50diVPxqYXrXzYw9GvWHhFf0158Q2ZpHNkQzTZaostp8gXNJ8eg3uWbpa1cjPraf0wuTTq8UfAZx8_QiQ4m4csbEgywNkg-OXaJXNmtIXPjekVwopjzdxR3ZtEkQSgdFtzmQWu7SOIODY531cjbD3nUDymFkQ8rOTg.E7tWhkb0B_l3KNTmWnOhaQ");

			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ conn.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(
				(conn.getInputStream())));

			String output;
			//System.out.println("Output from Server .... \n");
			while ((output = br.readLine()) != null) {

				if (output.contains("authIds")) {
					ids = output.split(":")[1];
					ids=ids.replace("[", "").replace("]", "");
					System.out.println("ALL IDS:" + ids);
					
				}
				//System.out.println(output);
			}

			conn.disconnect();			
		  } catch (MalformedURLException e) {

			e.printStackTrace();

		  } catch (IOException e) {

			e.printStackTrace();

		  }
		  
		  String authIDS[] = ids.split(",");
		  
		  try {
			  
			  System.out.println("Number of Docs for each AuthId");
			  for (int i = 0; i < authIDS.length; i++) {
				  String uri = "https://mint2tax-be.mint.com/api/v1/tax/admin/user/" + authIDS[i].replaceAll("\\s+", "") + "/documents?taxYear=2016";
				  URL url = new URL(uri);
					HttpURLConnection conn = (HttpURLConnection) url.openConnection();
					conn.setRequestMethod("GET");
					conn.setRequestProperty("Accept", "application/json");
					//conn.setRequestProperty("Authorization", "Bearer eyJlbmMiOiJBMTI4Q0JDLUhTMjU2IiwiYWxnIjoiZGlyIn0..LhInFqPBRt-FAY69CMnguA.jIfXyKmkLWOPS2exaPC1AkRxelIBLEQvQBEwIrRMmW7JbH3srwRzCCMBi8Dqore3jQQetBnNeZvKAIew2RTuCn8sbzmtzuVSuM_lMV2SSUpP3gdU-8cfag1SF8njydFg4Qpomed8v4ofg7eOwfNHyyIRnzIVpZTw2BXswQDKL7r3kJ2MIfRvKhMyfFTyozmG3CTJlH0V3TQsQ8gU8j1F_menJ_52Dwf-s4zjT0Ogzm3eVpmE1gNPIMp2Pdc1xGBaclDFx5YSCvltvJcIPL65XTsMAdoWY1ObI9tS4tv_DWukBkPDYlFgoBuLxTZBTEYv7oDBDaisjkz0J2tBbYoqX0UnBPX7pv7qq6RbHaE6HvLrxIarPzoqV9sC78uD0InYJljjdcDOt50diVPxqYXrXzYw9GvWHhFf0158Q2ZpHNkQzTZaostp8gXNJ8eg3uWbpa1cjPraf0wuTTq8UfAZx8_QiQ4m4csbEgywNkg-OXaJXNmtIXPjekVwopjzdxR3ZtEkQSgdFtzmQWu7SOIODY531cjbD3nUDymFkQ8rOTg.E7tWhkb0B_l3KNTmWnOhaQ");

					if (conn.getResponseCode() != 200) {
						throw new RuntimeException("Failed : HTTP error code : "
								+ conn.getResponseCode());
					}
					
					BufferedReader br = new BufferedReader(new InputStreamReader(
							(conn.getInputStream())));

						int numOfDocs = 0;
						String output;
						//System.out.println("Output from Server .... \n");
						while ((output = br.readLine()) != null) {
							
							if (output.contains("importedDate")) {
								String importDate = output.split(":")[1].replace(",", "").replaceAll("\\s+", "");
								importDates = importDates + ":" +importDate;
								numOfDocs++;
							}
							//System.out.println(output);
						}
						
						System.out.println(authIDS[i] + ":" + numOfDocs);
				}
			  
			  System.out.println("All imported Dates:" + importDates);
			  
				
			  String date[] = importDates.split(":");
			  long[] allDates = new long[date.length-1];
					  
			  for (int i = 1; i < date.length; i++) {
				  try {
					  
				//System.out.println(Long.parseLong(date[i]));
					  long val = Long.parseLong(date[i]);
					  if (val == 0) {
						continue;
					}
					  allDates[i-1] = val;
				  } catch(NumberFormatException e) {
					  System.out.println("sree");
				  }
			}
			  
			    long min = getMin(allDates);
			    
			    System.out.println("Minimum Date:" + min);
			    
		  } catch (MalformedURLException e) {
				e.printStackTrace();

			  } catch (IOException e) {

				e.printStackTrace();

			  }
		  
	}

	private static long getMin(long[] inputArray) {
		// TODO Auto-generated method stub
	    long minValue = inputArray[0]; 
	    for(int i=1;i<inputArray.length;i++){ 
	      if(inputArray[i] < minValue){ 
	        minValue = inputArray[i]; 
	      } 
	    } 
	    return minValue; 	}
		  
/*
		  try {

			 int i = 0;
			for (String id : listOfIds) {
				if (i< 60) {
					continue;
				}
				URL url = new URL("https://mint2tax-be.mint.com/api/v1/tax/admin/user/123145994214749/documents?taxYear=2016"+id);
				HttpURLConnection conn = (HttpURLConnection) url.openConnection();
				conn.setRequestMethod("GET");
				conn.setRequestProperty("Accept", "application/json");
				//conn.setRequestProperty("Authorization", "Bearer eyJlbmMiOiJBMTI4Q0JDLUhTMjU2IiwiYWxnIjoiZGlyIn0..LhInFqPBRt-FAY69CMnguA.jIfXyKmkLWOPS2exaPC1AkRxelIBLEQvQBEwIrRMmW7JbH3srwRzCCMBi8Dqore3jQQetBnNeZvKAIew2RTuCn8sbzmtzuVSuM_lMV2SSUpP3gdU-8cfag1SF8njydFg4Qpomed8v4ofg7eOwfNHyyIRnzIVpZTw2BXswQDKL7r3kJ2MIfRvKhMyfFTyozmG3CTJlH0V3TQsQ8gU8j1F_menJ_52Dwf-s4zjT0Ogzm3eVpmE1gNPIMp2Pdc1xGBaclDFx5YSCvltvJcIPL65XTsMAdoWY1ObI9tS4tv_DWukBkPDYlFgoBuLxTZBTEYv7oDBDaisjkz0J2tBbYoqX0UnBPX7pv7qq6RbHaE6HvLrxIarPzoqV9sC78uD0InYJljjdcDOt50diVPxqYXrXzYw9GvWHhFf0158Q2ZpHNkQzTZaostp8gXNJ8eg3uWbpa1cjPraf0wuTTq8UfAZx8_QiQ4m4csbEgywNkg-OXaJXNmtIXPjekVwopjzdxR3ZtEkQSgdFtzmQWu7SOIODY531cjbD3nUDymFkQ8rOTg.E7tWhkb0B_l3KNTmWnOhaQ");

				if (conn.getResponseCode() != 200) {
					throw new RuntimeException("Failed : HTTP error code : "
							+ conn.getResponseCode());
				}
				
				i = i + 1;
			}

		  } catch (MalformedURLException e) {

			e.printStackTrace();

		  } catch (IOException e) {

			e.printStackTrace();

		  }*/
	
	
		
}
