package srihari;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;


public class MintAdminRESTClient {
	public static void main(String[] args) {
		ArrayList<String> listOfIds = new ArrayList<String>();

		  try {

			URL url = new URL("https://mintadmin-be.mint.com/mint-restapi/v1/user/fis");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");
			conn.setRequestProperty("Authorization", "Intuit_IAM_Authentication intuit_token_type=IAM-Ticket,intuit_appid=Intuit.platform.csfitnesseautomation.csfitnesse,intuit_token=V1-61-b0bobh3pecws9224f8rryt,intuit_userid=1387740950,intuit_app_secret=prd5dCFK9lL8mF9k09yiFvMHmqWnx4zxSsFoGFbt");
			conn.setRequestProperty("user_auth_id", "1378835410");
			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ conn.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(
				(conn.getInputStream())));

			String output;
			System.out.println("Output from Server .... \n");
			while ((output = br.readLine()) != null) {
				if (output.contains("depth")) {
					String val = output.split(":")[1];
					if (val.equals("1")) {
						continue;
					}
				}
				
				if (output.contains("id")) {
					String id = output.split(":")[1].replace("\"", "");
					listOfIds.add(id);
				}
				System.out.println(output);
			}

			conn.disconnect();			
		  } catch (MalformedURLException e) {

			e.printStackTrace();

		  } catch (IOException e) {

			e.printStackTrace();

		  }

		  
		  

		  try {

			 int i = 0;
			for (String id : listOfIds) {
				if (i< 60) {
					continue;
				}
				URL url = new URL("https://mint-e2e.finance.intuit.com/v1/categories"+id);
				HttpURLConnection conn = (HttpURLConnection) url.openConnection();
				conn.setRequestMethod("DELETE");
				conn.setRequestProperty("Accept", "application/json");
				conn.setRequestProperty("Authorization", "Bearer eyJlbmMiOiJBMTI4Q0JDLUhTMjU2IiwiYWxnIjoiZGlyIn0..LhInFqPBRt-FAY69CMnguA.jIfXyKmkLWOPS2exaPC1AkRxelIBLEQvQBEwIrRMmW7JbH3srwRzCCMBi8Dqore3jQQetBnNeZvKAIew2RTuCn8sbzmtzuVSuM_lMV2SSUpP3gdU-8cfag1SF8njydFg4Qpomed8v4ofg7eOwfNHyyIRnzIVpZTw2BXswQDKL7r3kJ2MIfRvKhMyfFTyozmG3CTJlH0V3TQsQ8gU8j1F_menJ_52Dwf-s4zjT0Ogzm3eVpmE1gNPIMp2Pdc1xGBaclDFx5YSCvltvJcIPL65XTsMAdoWY1ObI9tS4tv_DWukBkPDYlFgoBuLxTZBTEYv7oDBDaisjkz0J2tBbYoqX0UnBPX7pv7qq6RbHaE6HvLrxIarPzoqV9sC78uD0InYJljjdcDOt50diVPxqYXrXzYw9GvWHhFf0158Q2ZpHNkQzTZaostp8gXNJ8eg3uWbpa1cjPraf0wuTTq8UfAZx8_QiQ4m4csbEgywNkg-OXaJXNmtIXPjekVwopjzdxR3ZtEkQSgdFtzmQWu7SOIODY531cjbD3nUDymFkQ8rOTg.E7tWhkb0B_l3KNTmWnOhaQ");

				if (conn.getResponseCode() != 204) {
					throw new RuntimeException("Failed : HTTP error code : "
							+ conn.getResponseCode());
				}
				
				i = i + 1;
			}

		  } catch (MalformedURLException e) {

			e.printStackTrace();

		  } catch (IOException e) {

			e.printStackTrace();

		  }
		}
}
