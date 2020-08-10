package Collections;
//Map interface in java
//HashMap

import java.util.*;

public class MapDemo {
    
    public static void main(String[] args) {
        
        Map<String,String> map=new HashMap<String,String>();
        map.put("Name", "Raj");//It add as(key,value) it can be <String,String>/<String,Integer>
        map.put("id", "1");
        map.put("Act", "Mohanlal");
        System.out.println(map);//o/p-->{Act=Mohanlal, id=1, Name=Raj}
        System.out.println(map.get("Name"));//o/p-->Raj----To get the particular method
        System.out.println(map.get("Hello"));//o/p-->null---Will gve null for unknown value
        
        //To change values of a key change but the key will not point towards two values
        map.put("Act", "Tovi");
        System.out.println(map);//o/p-->{Act=Tovi, id=1, Name=Raj}

        //To get both the keys and values
        Set<String> keys = map.keySet();//keySet() is used to get all th keys
        for(String key:keys){
            System.out.print(key +":"+map.get(key));//o/p-->
            /*Act:Tovi
            id:1
            Name:Raj */
        }
        System.out.println(map.keySet());//o/p->[Act, id, Name]

        //To get both values toghether we use entry set which is nested interface the interfac inside map interface
        System.out.println(map.entrySet());//o/p-->[Act=Tovi, id=1, Name=Raj]
        Set<Map.Entry<String , String>> values = map.entrySet();
        for (Map.Entry<String,String> entry : values) {
            System.out.println(entry.getKey()+":"+entry.getValue());/*o/p-->
            Act:Tovi
            id:1
            Name:Raj */
        }

    }
}

/*WE can use HashTable instead of HashMap then it will be getting Synchronized
Hashtable will not allow null key
Hash table is slow than hashmap
HashTable is thread safe and synchronised */