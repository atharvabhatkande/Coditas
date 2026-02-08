package Collections;

import java.util.*;

public class MapExample {
    public static  void main(String [] args){
        HashMap<Integer,String> map=new HashMap<>();

        map.put(1,"Atharva");
        map.put(2,"Deep");
        map.put(8,"Prajwal");
        map.put(3,"Arya");

        System.out.println(map.getOrDefault(10,"Aman"));


        for(Map.Entry<Integer, String> i:map.entrySet()){
            System.out.println(i.getKey()+": "+i.getValue());
        }
        System.out.println();



        LinkedHashMap<Integer,String > map2=new LinkedHashMap<>();
        map2.put(1,"Atharva");
        map2.put(2,"Deep");
        map2.put(8,"Prajwal");
        map2.put(3,"Arya");



        for(Map.Entry<Integer, String> i:map2.entrySet()){
            System.out.println(i.getKey()+": "+i.getValue());
        }
    }
}
