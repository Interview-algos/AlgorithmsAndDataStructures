package sreehari;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


public class POSTMINTCall {

    public static void main(String[] args) {
		  try {

			  String sree="https://mint-e2e.finance.intuit.com/v1/transactions/";;
			URL url = new URL(sree);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Accept", "application/json");
			conn.setRequestProperty("Authorization", "Bearer eyJlbmMiOiJBMTI4Q0JDLUhTMjU2IiwiYWxnIjoiZGlyIn0..LhInFqPBRt-FAY69CMnguA.jIfXyKmkLWOPS2exaPC1AkRxelIBLEQvQBEwIrRMmW7JbH3srwRzCCMBi8Dqore3jQQetBnNeZvKAIew2RTuCn8sbzmtzuVSuM_lMV2SSUpP3gdU-8cfag1SF8njydFg4Qpomed8v4ofg7eOwfNHyyIRnzIVpZTw2BXswQDKL7r3kJ2MIfRvKhMyfFTyozmG3CTJlH0V3TQsQ8gU8j1F_menJ_52Dwf-s4zjT0Ogzm3eVpmE1gNPIMp2Pdc1xGBaclDFx5YSCvltvJcIPL65XTsMAdoWY1ObI9tS4tv_DWukBkPDYlFgoBuLxTZBTEYv7oDBDaisjkz0J2tBbYoqX0UnBPX7pv7qq6RbHaE6HvLrxIarPzoqV9sC78uD0InYJljjdcDOt50diVPxqYXrXzYw9GvWHhFf0158Q2ZpHNkQzTZaostp8gXNJ8eg3uWbpa1cjPraf0wuTTq8UfAZx8_QiQ4m4csbEgywNkg-OXaJXNmtIXPjekVwopjzdxR3ZtEkQSgdFtzmQWu7SOIODY531cjbD3nUDymFkQ8rOTg.E7tWhkb0B_l3KNTmWnOhaQ");

			if (conn.getResponseCode() != 201) {
				System.out.println(sree);
				throw new RuntimeException("Failed : HTTP error code : "
						+ conn.getResponseCode() + "resp:" +conn.getResponseMessage()); 
			}
			
		  }  catch (MalformedURLException e) {

				e.printStackTrace();

			  } catch (IOException e) {

				e.printStackTrace();

			  }
    }
}
