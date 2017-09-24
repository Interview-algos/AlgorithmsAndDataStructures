//package sreehari;
//
//import java.io.FileReader;
//import java.util.Iterator;
//
//import org.json.simple.JSONArray;
//import org.json.simple.JSONObject;
//import org.json.simple.parser.JSONParser;
// 
///**
// * @author Crunchify.com
// */
// 
//public class JsonTest {
// 
//    @SuppressWarnings("unchecked")
//    public static void main(String[] args) {
//        JSONParser parser = new JSONParser();
// 
//        try {
// 
//            Object obj = parser.parse(new FileReader("/Users/scheerla1/Desktop/data/minttotax/minttotax_109x_1473961940531_V1.json"));
// 
//            JSONObject jsonObject = (JSONObject) obj;
// 
//            String num = (String) jsonObject.get("numDocuments");
//            JSONArray companyList = (JSONArray) jsonObject.get("documents");
// 
//            System.out.println("No.Of Docs: " + num);
//            System.out.println("\ndocs");
//            Iterator<String> iterator = companyList.iterator();
//            while (iterator.hasNext()) {
//                System.out.println(iterator.next());
//            }
// 
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}