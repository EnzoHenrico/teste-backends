import java.text.*;
import java.util.*;
public class Solution {

  public static void main(String[] args) {

    List<String> messages = new ArrayList<String>();

    // Exemple used for tests
    String messageData[] = {
     
    "72ff1d14-756a-4549-9185-e60e326baf1b,proposal,created,2019-11-11T14:28:01Z,80921e5f-4307-4623-9ddb-5bf826a31dd7,1141424.0,240",
  
    "af745f6d-d5c0-41e9-b04f-ee524befa425,warranty,added,2019-11-11T14:28:01Z,80921e5f-4307-4623-9ddb-5bf826a31dd7,31c1dd83-8fb7-44ff-8cb7-947e604f6293,3245356.0,DF",

    "450951ee-a38d-475c-ac21-f22b4566fb29,warranty,added,2019-11-11T14:28:01Z,80921e5f-4307-4623-9ddb-5bf826a31dd7,c8753500-1982-4003-8287-3b46c75d4803,3413113.45,DF",

    "66882b68-baa4-47b1-9cc7-7db9c2d8f823,proponent,added,2019-11-11T14:28:01Z,80921e5f-4307-4623-9ddb-5bf826a31dd7,3f52890a-7e9a-4447-a19b-bb5008a09672,Ismael Streich Jr.,42,62615.64,true"
    };

    // Loop to insert recived data in a ArrayList
    for (int i = 0; i < messageData.length; i++){
      
      messages.add(messageData[i]);
    }
  }


  // Execute other methods to proceed validation
  public static String processMessages(List<String> messages) {

    
    return "";
  }

  // Filter repeated events by ID
  public static void validadeID(List<String> messages){

    for (int i = 0; i < messages.size() -1; i++){
      for (int n = 0; n <= messages.size() -1;n++){

        if(messages.get(i) == messages.get(i + 1)){

          messages.remove(i);
        }
      }    
    }
    checkUpdates(messages);
  }

  // Check if an action is a update, then delete outdated actions
  public static void checkUpdates(List<String> messages) {
    
  }

  // Validates if there are at least one Proponet and their ages are over 18
  public static void validateProponent(String[][] data){
  
    int proponentCount = 0;
    int proponentMain = 0;

    for (int i = 0; i < data.length; i++){
      
      int age = Integer.parseInt(data[i][7]);

      if(data[i][1] == "proponent" && age > 18){
        
        proponentCount++;
        proponentMain++;
      }
    }

    if(proponentCount >= 2 && proponentMain >= 1) {
      validateProposal(data);
    }
    else{
      System.out.println("Didnt passed!"); 
    }
  }

  public static void validateProposal(String[][] data){
    //not implemented  
  }

  public static void validateWarantty(String data){
    //not implemented  
  }


  // Tool methods used inside other methods
  

  /* ↓ Data array sumary ↓ 
  * event_id - (id da transação): [x][0]
  * event_schema - (tipo de transação): [x][1]
  * event_action - (tipo de atualização): [x][2]
  * event_timestamp - (data do evento): [x][3] */

  // Split data in the messages to treat each one separatly
  public static String[][] splitter(List<String> messages) {
    
    List<String[]> dataList = new ArrayList<String[]>();
    String[][] data = new String[messages.size()][10];
    

    for (int i = 0; i < messages.size(); i++){

      data[i] = messages.get(i).split(",");
    
      dataList.add(data[i]);
    }

    return data;
  }

  // Convert de date string passed in the messages to Date object
  public static Date stringToDate(String stringDate) throws ParseException{

    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");

      Date date = formatter.parse(stringDate);
      System.out.println("date: " + date);
      
      return date;   
  }
}
