package com.h2kinfosys.learnJava.day08;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {

    public static void main(String[] args) {
        HashMap<Integer, String> testMap = new HashMap<>();
        testMap.put(10, "David");
        testMap.put(11, "Niel");
        testMap.put(12, "Byron");

        System.out.println(testMap);
        testMap.put(10, "Dorothea");
        System.out.println(testMap);
        System.out.println(testMap.get(12));

        for (int eachKey : testMap.keySet()){
            System.out.println("Key :: " + eachKey + " Value :: " + testMap.get(eachKey));
        }

        for (String eachValue : testMap.values()){
            System.out.println("Value :: " + eachValue);
        }
        for(Map.Entry<Integer, String> eachEntry : testMap.entrySet()){
            System.out.println("Key :: " + eachEntry.getKey()+ " Value :: " + eachEntry.getValue());
        }

        // Membership
        if (testMap.containsKey(10)){
            System.out.println("Key 10 is present");
        }
        if (testMap.containsValue("Dorothea")){
            System.out.println("Dorothea is present");
        }

        HashMap<Integer, String> testMap2 = new HashMap<>();
        testMap2.put(20, "Ram");
        testMap2.put(21, "Laxman");
        testMap2.put(22, "Bharat");
        testMap2.put(10, "Raghu");

        testMap.putAll(testMap2);
        System.out.println(testMap);

        testMap.replace(10,"Raghu", "Raghunath");

        testMap.remove(12);
        System.out.println(testMap);

        testMap.clear();
    }
}
