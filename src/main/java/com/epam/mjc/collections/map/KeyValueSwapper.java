package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map <String, Integer> newMap = new HashMap<>();
        for (Map.Entry <Integer, String> entry : sourceMap.entrySet())
        {Integer key = entry.getKey();
        String value = entry.getValue();
            String newKey = value;
            Integer newValue = key;

       if (newMap.containsKey(newKey))
       {Integer currentValue = newValue;
           if (currentValue<newValue){ newMap.put(newKey, currentValue);}
           else{newMap.put(newKey, newValue);}
       }
       else {newMap.put(newKey, newValue);}

        }

        return newMap;
    }
}
