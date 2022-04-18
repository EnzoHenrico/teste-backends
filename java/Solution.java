import java.lang.reflect.Array;
import java.util.*;
public class Solution {

  public static void main(String[] args) {

    List<String> messages = new ArrayList<String>();
    List<String[]> dataList = new ArrayList<String[]>();
    String[][] data = new String[4][10];

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

    for (int i = 0; i < messages.size(); i++){

      data[i] = messages.get(i).split(",");
    
      dataList.add(data[i]);
      
      System.out.println(data[i][0]);
    }
  
    //processMessages(messages);
  }

  public static String processMessages(List<String> messages) {

  /** 
    * ↓ All message sumary ↓ 
    * event_id - (id da transação): [id][0]
    * event_schema - (tipo de transação): [id][1]
    * event_action - (tipo de atualização): [id][2]
    * event_timestampv - (data do evento): [id][3]
  */ 

  List<String[]> dataList = new ArrayList<String[]>();
  

  for (int i = 0; i < messages.size(); i++){

    String[] data = messages.get(i).split(",");

    dataList.add(data);
    
    System.out.println(data);
  }


    return "";
  }


  public static Boolean validateProposal(){
    return true;
  }
  public static Boolean validateWarantty(){
    return true;
  }
  public static Boolean validateProponent(){
    return true;
  }
}
